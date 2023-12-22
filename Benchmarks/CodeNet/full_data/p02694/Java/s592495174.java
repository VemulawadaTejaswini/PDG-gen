import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		long  x = scn.nextLong();
		long cur =100;
		int cnt =0;
		while(cur<x){
			cur+=cur*0.01;
			cnt++;
		}

		System.out.println(cnt);
	}

}