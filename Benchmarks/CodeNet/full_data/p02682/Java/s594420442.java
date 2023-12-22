import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int k = sc.nextInt();
	if(k<=a){
	    System.out.println(a);
	    System.exit(0);
	}
	if(k>a&&k<=a+b){
	    System.out.println(a);
	    System.exit(0);
	}
	System.out.println(2*a+b-k);
      }
}
