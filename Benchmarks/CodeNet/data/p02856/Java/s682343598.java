


import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		long digitSum = 0;
		long digitNum = 0;
		for (int i=0;i<m;i++) {
			long d = sc.nextLong();
			long c = sc.nextLong();
			digitSum += d*c;
			digitNum += c;
		}
		
		System.out.println(digitSum/9+digitNum-1);
	
	}
}



