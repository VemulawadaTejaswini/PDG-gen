import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 100;) {
		//??\???
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
        //???????????????
		if(a < b && b < c ) {
		System.out.println("YES");
	    }else {
	    	System.out.println("NO");
		   }
	   }
     }
   }

	