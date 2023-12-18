import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count =0;
		//String As = String.valueOf(A);
		//String Bs = String.valueOf(B);
		for(int i =A;i <= B;i++){
			String ia = String.valueOf(i);
			char[] ic = ia.toCharArray();
			if(ic[0] == ic[4]&&ic[1]==ic[3]){
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}
