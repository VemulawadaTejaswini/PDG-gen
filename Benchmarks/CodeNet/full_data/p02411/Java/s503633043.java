import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int no =-1;
		while(true){
			int m=sc.nextInt();
			int f=sc.nextInt();
			int r=sc.nextInt();
		if(m>=0||f>=0||r>=0) {
		if((m+f)>=80) {
			System.out.println("A");
		}else if(65<=(m+f)&&(m+f)<80) {
			System.out.println("B");
		}else if(r>=50||50<=(m+f)&&(m+f)<65) {
			System.out.println("C");
		}else if(m==-1||f==-1||(m+f)<30) {
			System.out.println("F");
		}else if(30<=(m+f)&&(m+f)<50||r>=50) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		}else if(m==-1&&f==-1){
			break;
		}
	}
	}
}



