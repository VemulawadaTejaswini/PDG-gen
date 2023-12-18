import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner push = new Scanner(System.in);
		int A = push.nextInt();
		int B = push.nextInt();
		int C = push.nextInt();

		int work = A*10+B+C;
		int work2 = B*10+A+C;
		int work3 = C*10+A+C;

		if(work >= work2) {
			if(work >= work3) {
				System.out.println(work);
			}else if(work2 >= work3) {
				System.out.println(work2);
			}else {
				System.out.println(work3);
			}
		}else if(work2 >= work3) {
			System.out.println(work2);
		}else if(work3 >= work) {
			System.out.println(work3);
		}else {
			System.out.println(work);
		}
	}
}
