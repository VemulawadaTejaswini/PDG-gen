import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((int)((Math.pow(4,n)-3*(n-2)-6*(n-3))%(Math.pow(10,9)+7)));
	}
}