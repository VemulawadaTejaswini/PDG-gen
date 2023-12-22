import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String cls[] = new String[9];
		int a[] = new int [9];
		int b[] = new int [9];
 		for(int i = 0;i < 9;i++){
 			cls[i] = in.next();
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
 		for(int i = 0; i < 9;i++){
 			System.out.println(cls[i]+" "+(a[i]+b[i])+" "+(200*a[i]+300*b[i]));
 		}
	}
}