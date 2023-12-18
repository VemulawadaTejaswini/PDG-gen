
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfUsers = scanner.nextInt();
        int friendships = scanner.nextInt();
        int blockships = scanner.nextInt();

        int[][] relationshipPlan = new int[numberOfUsers][numberOfUsers];
        int[] answer = new int[numberOfUsers];
        for (int i = 0; i < friendships; i++) {
            int friendshipOne = scanner.nextInt();
            int friendshipTwo = scanner.nextInt();
            relationshipPlan[friendshipOne - 1][friendshipTwo - 1] = 1;
            relationshipPlan[friendshipTwo - 1][friendshipOne - 1] = 1;
        }

        for (int i = 0; i < blockships; i++) {
            int blockshipOne = scanner.nextInt();
            int blockshipTwo = scanner.nextInt();
            relationshipPlan[blockshipOne - 1][blockshipTwo - 1] = -1;
            relationshipPlan[blockshipTwo - 1][blockshipOne - 1] = -1;
        }

        List<List<Integer>> relationships = new ArrayList<>();
        List<List<Integer>> blockedUsers = new ArrayList<>();

        for (int i = 0; i < numberOfUsers; i++) {
            List<Integer> friends = new ArrayList<>();
            List<Integer> blocked = new ArrayList<>();

            for (int k = 0; k < numberOfUsers; k++) {
                if (relationshipPlan[i][k] == 1) {
                    friends.add(k + 1);
                } else if (relationshipPlan[i][k] == -1) {
                    blocked.add(k + 1);
                }
            }
            relationships.add(friends);
            blockedUsers.add(blocked);
        }


        Set<Integer> candidates = new HashSet<>();
        Set<Integer> visited = new HashSet<>();
        List<Integer> relationship;
        for (int i = 0; i < relationships.size(); i++) {
            candidates.clear();
            visited.clear();

            relationship = relationships.get(i);
            lookForFriends(relationship, relationships, candidates, visited);
            int tempAnswer = 0;
            for (int candidate : candidates) {
                if (!relationship.contains(candidate) && !blockedUsers.get(i).contains(candidate) && candidate != i + 1) {
                    tempAnswer++;
                }
            }
            answer[i] = tempAnswer;
        }


        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberOfUsers; i++) {
            stringBuilder.append(answer[i] + " ");
        }

        System.out.println(stringBuilder.toString().trim());
    }

    private static void lookForFriends(List<Integer> currentUser, List<List<Integer>> allUsers, Set<Integer> candidates, Set<Integer> visited) {
        for (int friend : currentUser) {
            candidates.add(friend);
            if (!visited.contains(friend)) {
                visited.add(friend);
                lookForFriends(allUsers.get(friend - 1), allUsers, candidates, visited);
            }
        }
    }
}