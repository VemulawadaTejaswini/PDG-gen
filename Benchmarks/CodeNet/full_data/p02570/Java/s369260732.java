import java.util.Scanner;

public  class Main {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int d = stdIn.nextInt();
	int t = stdIn.nextInt();
	int s = stdIn.nextInt();
	if (d<=t*s){
	System.out.println("Yes");
	}
	else {System.out.println("No");}
	}

}