import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long b = sc.nextLong();
	long c = sc.nextLong();
	long k = sc.nextLong();
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
