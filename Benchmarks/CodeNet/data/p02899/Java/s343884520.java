import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Student(i + 1, sc.nextInt());
        }
        System.out.println(Stream.of(a).sorted().map(s -> String.valueOf(s.num)).collect(Collectors.joining(" ")));
    }
    private static class Student implements Comparable<Student> {
        int num;
        int order;
        private Student(int num, int order) {
            this.num = num;
            this.order = order;
        }
        @Override
        public int compareTo(Student o) {
            return Integer.compare(this.order, o.order);
        }
    }
}