import java.util.Scanner;

public class Main{


	public static void main(String[] args){

		//?¨??????\???
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		result(a,b);

	}

	//???????????¨?????????????????????
	private static void result(int a, int b){
		if(a>b){
			System.out.println("a > b");}
		else if(a<b){
		    System.out.println("a < b");}
		else{System.out.println("a == b");}
	}


}