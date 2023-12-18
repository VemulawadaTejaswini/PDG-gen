import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    UserService userService = new UserService();
    for (int i = 1; i < n + 1; i++) {
      userService.addUser(new User(i));
    }
    for (int i = 0; i < m; i++) {
      userService.makeFriends(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
    }
    for (int i = 0; i < k; i++) {
      userService.makeBlocked(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
    }
    pw.println(
      userService.countCandidates().stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" "))
    );
  }

  static class User {

    private int id;
    Set<User> friends = new HashSet<>();
    Set<User> blocked = new HashSet<>();

    public User(int id) {
      this.id = id;
    }

    void addFriends(User user) {
      friends.add(user);
    }

    Set<User> friendsChain(Set<User> current) {
      Set<User> newFriends = new HashSet<>(friends);
      newFriends.removeAll(current);
      current.addAll(newFriends);
      Set<User> newFriendsChain = newFriends.stream()
        .map(u -> u.friendsChain(current))
        .flatMap(Set::stream)
        .collect(Collectors.toSet());
      newFriendsChain.remove(this);
      current.addAll(newFriendsChain);
      return current;
    }

    boolean isFriend(User u) {
      return friends.contains(u);
    }

    void addBlocked(User user) {
      blocked.add(user);
    }

    boolean isBlocked(User u) {
      return blocked.contains(u);
    }
  }

  static class UserService {

    LinkedHashMap<Integer, User> users = new LinkedHashMap<>();

    void addUser(User user) {
      users.put(user.id, user);
    }

    void makeFriends(int a, int b) {
      User userA = users.get(a);
      User userB = users.get(b);
      userA.addFriends(userB);
      userB.addFriends(userA);
    }

    void makeBlocked(int a, int b) {
      User userA = users.get(a);
      User userB = users.get(b);
      userA.addBlocked(userB);
      userB.addBlocked(userA);
    }

    List<Long> countCandidates() {
      Map<User, Set<User>> chainedUserGroupCache = new HashMap<>();
      for (User user : users.values()) {
        if (chainedUserGroupCache.containsKey(user)) {
          chainedUserGroupCache.get(user).addAll(user.friends);
        } else {
          Set<User> userGroup = new HashSet<>(user.friends);
          chainedUserGroupCache.put(user, userGroup);
        }
        for (User groupUser : chainedUserGroupCache.get(user)) {
          chainedUserGroupCache.put(groupUser, chainedUserGroupCache.get(user));
        }
      }
      List<Long> answer = new ArrayList<>();
      for (User user : users.values()) {
        long count = chainedUserGroupCache.get(user).stream()
          .filter(candidate -> user != candidate)
          .filter(candidate -> !user.isFriend(candidate))
          .filter(candidate -> !user.isBlocked(candidate))
          .count();
        answer.add(count);
      }
      return answer;
    }
  }
}
