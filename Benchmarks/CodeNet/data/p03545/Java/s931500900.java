package biginner079;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//A
		/*int N = sc.nextInt();
		String N_S = String.valueOf(N);
		char N1,N2,N3,N4;
		N1 = N_S.charAt(0);
		N2 = N_S.charAt(1);
		N3 = N_S.charAt(2);
		N4 = N_S.charAt(3);
		if((N1==N2&&N1==N3)||(N2==N4&&N3==N4))
			System.out.println("Yes");
		else
			System.out.println("No");*/

		//B
		/*int N =sc.nextInt();
		ArrayList<Long> List = new ArrayList<Long>();
		List.add((long) 2);
		List.add((long) 1);
		for(int i = 2 ; i <= N ; i++){
			List.add(List.get(i-1)+List.get(i-2));
		}
		System.out.println(List.get(N));*/

		//C
		int N = sc.nextInt();
		String N_S = String.valueOf(N);
		char N1,N2,N3,N4;
		N1 = N_S.charAt(0);
		N2 = N_S.charAt(1);
		N3 = N_S.charAt(2);
		N4 = N_S.charAt(3);
		int A = Integer.parseInt(""+N1);
		int B = Integer.parseInt(""+N2);
		int C = Integer.parseInt(""+N3);
		int D = Integer.parseInt(""+N3);
		int ans  = (A+B+C+D-7)/2;
		String op1 = "+";
		String op2 = "+";
		String op3 = "+";

		if(ans == 0){

		}else if(B==ans){
			op1 = "-";
		}else if(C==ans){
			op2 = "-";
		}else if(D==ans){
			op3 = "-";
		}else if(B+C==ans){
			op1 = "-";
			op2 = "-";
		}else if(B+D==ans){
			op1 = "-";
			op3 = "-";
		}else if(C+D==ans){
			op2 = "-";
			op3 = "-";
		}else if(B+C+D==ans){
			op1 = "-";
			op2 = "-";
			op3 = "-";
		}

		System.out.println(A+op1+B+op2+C+op3+D+"=7");
	}
}
