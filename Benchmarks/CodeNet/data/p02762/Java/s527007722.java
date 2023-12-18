import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    List<Person> friends = new ArrayList<Person>();
    List<Person> blocks = new ArrayList<Person>();
    int name;
    int friendNum = -1;

    Person(int name) {
        this.name = name;
    }

    public void addFriends(Person p) {
        this.friends.add(p);
    }

    public void addBlocks(Person p) {
        this.blocks.add(p);
    }

    public List<Person> getFriends() {
        return this.friends;
    }

    public List<Person> getBlocks() {
        return this.blocks;
    }

    public List<Person> traverseFriends(List<Person> donePerson) {
        donePerson.add(this);
        for (Person person : this.friends) {
            if (donePerson.contains(person)) continue;
            donePerson = person.traverseFriends(donePerson);
        }

        return donePerson;
    }

    public int getFriendNum() {
        return this.friendNum;
    }

    public void calcFriendNum(List<Person> donePerson) {
        int total = 0;
        for (Person person : donePerson) {
            if (this.equals(person) ||
                this.getFriends().contains(person) ||
                this.getBlocks().contains(person)) {

            } else {
                total++;
            }
        }
        this.friendNum = total;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        List<Person> ps = new ArrayList<Person>();
        for (int i = 0; i < n; i++) {
            ps.add(new Person(i));
        }

        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            ps.get(a - 1).addFriends(ps.get(b - 1));
            ps.get(b - 1).addFriends(ps.get(a - 1));
        }

        for (int i = 0; i < k; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            ps.get(a - 1).addBlocks(ps.get(b - 1));
            ps.get(b - 1).addBlocks(ps.get(a - 1));
        }

        for (int i = 0; i < n; i++) {
            int num = ps.get(i).getFriendNum();
            if (num == -1) {
                List<Person> cand = ps.get(i).traverseFriends(new ArrayList<Person>());
                for (Person person : cand) {
                    person.calcFriendNum(cand);
                }
                num = ps.get(i).getFriendNum();
            }
            System.out.print(num + " ");
        }
    }
}
