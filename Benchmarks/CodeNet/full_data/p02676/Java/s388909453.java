package Atcoder;
import java.util.Scanner;

public class Beginner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		String S;
		int K=keyboard.nextInt();
		S=keyboard.next();
		if(S.length()>K){
			System.out.println(S.substring(0,K)+"...");
		}else{
			System.out.println(S);
		}
	}

}
