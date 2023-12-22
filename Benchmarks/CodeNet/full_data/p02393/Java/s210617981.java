import java.util.Scanner;
class Main {
	public static void main(String[] args){
		 Scanner scn = new Scanner(System.in);
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int c = scn.nextInt();
		if(a<b & b<c) {
			System.out.print(a+" "+b+" "+c);
		}
		else if (b<a & a<c) {
			System.out.print(b+" "+a+" "+c);
		}
		else if (c<a & a<b) {
			System.out.print(c+" "+a+" "+b);
		}
	}
}