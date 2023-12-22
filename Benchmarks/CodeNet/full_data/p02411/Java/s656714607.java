import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int m=sc.nextInt(),f=sc.nextInt(),r=sc.nextInt();
			if(m==-1 && f==-1 && r==-1) {
				break;
			}
			int sum=m+f;
			if((m==-1 || f==-1)  || sum<30) {
				System.out.println("F");
			}else if(sum>=80) {
				System.out.println("A");
			}else if(sum>= 65 && sum<80){
				System.out.println("B");
			}else if(sum>=50 && sum<65 || r>=50) {
				System.out.println("C");
			}else  {
				System.out.println("D");
			}
		}
	}
}
