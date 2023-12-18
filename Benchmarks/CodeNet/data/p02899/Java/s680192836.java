import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			students[i] = new Student(i + 1, a[i]);
		}
		Arrays.sort(students);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(i > 0 ? " " : "");
			sb.append(students[i].getId());
		}
		System.out.println(sb.toString());
	}

	public static class Student implements Comparable<Student> {
		private int id;
		private int order;

		public Student(int id, int order) {
			this.id = id;
			this.order = order;
		}

		public int getId() {
			return id;
		}

		public int getOrder() {
			return order;
		}

		@Override
		public int compareTo(Student target) {
			if (this.order > target.getOrder()) {
				return 1;
			} else if (this.order < target.getOrder()) {
				return -1;
			}

			return 0;
		}
	}
}
