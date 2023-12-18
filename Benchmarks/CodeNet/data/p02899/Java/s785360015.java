import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student[] s = new Student[n];
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			s[i] = new Student(a, i + 1);
		}
		sc.close();
		new Main().solve(n, s);
	}
	void solve(int n, Student[] s){
		Arrays.sort(s);
		for(Student student : s){
			System.out.print(student.B + " ");
		}
	}
}

class Student implements Comparable<Student>{
	public int A; //生徒のいた人数
	public int B; //生徒の出席番号
	public Student(int A, int B){
		this.A = A;
		this.B = B;
	}
	@Override
	public int compareTo(Student o) {
		//生徒の人数で並び替える
		return this.A - o.A;
	}	
}