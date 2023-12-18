import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    static class Student implements Comparable<Student> {
        int id, num;

        public Student(int id, int num) {
            this.id = id;
            this.num = num;
        }

        @Override
        public int compareTo(Student student) {
            return this.num - student.num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        SortedSet<Student> students = new TreeSet<>();

        for (int i = 1; i <= N; i++) {
            students.add(new Student(i, sc.nextInt()));
        }

        for (Student student : students) System.out.print(student.id + " ");
    }
}