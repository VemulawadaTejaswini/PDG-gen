import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Person[] ps = new Person[N];
		for(int y = 0;y < N;y++) {
			ps[y] = new Person();
		}
		
		int inA = sc.nextInt();
		for(int i = 0; i < inA ; i++) {
			ps[sc.nextInt()-1].inA = true;
		}
		
		int inB = sc.nextInt();
		for(int m = 0; m < inB; m++) {
			ps[sc.nextInt()-1].inB = true;
		}
		
		int inC = sc.nextInt();
		for(int l = 0;l < inC; l++) {
			ps[sc.nextInt()-1].inC = true;
		}
		
		int count = 0;
		for(Person p : ps) {
			if(p.check()) {
				count += 1;
			}
		}
		System.out.println(count);
 	}
	static class Person {
		public boolean inA = false;
		public boolean inB = false;
		public boolean inC = false;
		public Person() {
			
		}
		public boolean check() {
			if(inC == false) {
				return false;
			} else if(inA == false && inC == true) {
				return true;
			} else if(inB == true && inC == true) {
				return true;
			}
			return false;
		}
	}
}