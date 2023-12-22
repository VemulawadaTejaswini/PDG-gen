import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    Person persons[] = new Person[n + 1];
    List<Group> groups = new ArrayList<>();
    for (int i = 0; i < n + 1; i++) {
      persons[i] = new Person(i);
    }
    for (int i = 0; i < m; i++) {
      int from = Integer.parseInt(sc.next());
      int to = Integer.parseInt(sc.next());
      if (!persons[from].belongsToGroup() && !persons[to].belongsToGroup()) {
        int groupIndex = groups.size();
        Group g = new Group();
        g.memberCount += 2;
        persons[from].groupIndex = groupIndex;
        persons[to].groupIndex = groupIndex;
        groups.add(g);
      } else if (!persons[from].belongsToGroup() && persons[to].belongsToGroup()) {
        Group g = groups.get(persons[to].groupIndex);
        g.memberCount++;
        persons[from].groupIndex = persons[to].groupIndex;
      } else if (persons[from].belongsToGroup() && !persons[to].belongsToGroup()) {
        Group g = groups.get(persons[from].groupIndex);
        g.memberCount++;
        persons[to].groupIndex = persons[from].groupIndex;
      } else {
        Group fromG = groups.get(persons[from].groupIndex);
        Group toG = groups.get(persons[to].groupIndex);
        if (fromG == toG) {
          continue;
        }
        fromG.memberCount += toG.memberCount;
        groups.set(persons[to].groupIndex, fromG);
      }
    }
    pw.println(
      groups.stream().mapToInt(g -> g.memberCount).max().orElse(1)
    );
  }

  static class Group {

    int memberCount;
  }

  static class Person {

    int num;
    int groupIndex = -1;

    Person(int num) {
      this.num = num;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Person person = (Person) o;
      return num == person.num;
    }

    @Override
    public int hashCode() {
      return Objects.hash(num);
    }

    boolean belongsToGroup() {
      return groupIndex != -1;
    }
  }
}
