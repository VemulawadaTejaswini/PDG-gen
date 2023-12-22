import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (;;){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if(m==-1 && f==-1 && r==-1)break;
			int p = m + f;
			if(m==-1 || f==-1) p=0;
			if(p>=80){
				System.out.println("A");
			}else if(p>=65 && p<80){
				System.out.println("B");
			}else if(p>=50 && p<65){
				System.out.println("C");
			}else if(p>=30 && p<50){
				if(r>=50){
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}else if(p<30){
				System.out.println("F");
			}
		}
	}
}