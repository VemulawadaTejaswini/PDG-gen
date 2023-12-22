import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String[] input=sc.nextLine().split(" ");
		int a=Integer.parseInt(input[0]);
		int b=Integer.parseInt(input[1]);
		int d =a/b;
		int r=a%b;
		double f=a/b;
		System.out.println(d+" "+r+" "+f);
	}
}