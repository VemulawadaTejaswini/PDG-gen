import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int countg1 = 0;
		    int countg2 = 0;
		    int countg3 = 0;
		    if(a == 1 || a == 3 || a == 5||a == 7|| a == 8|| a==10 ||a==12) {
		    	countg1++;
		    }
		    if(b == 1 || b == 3 || b == 5|| b == 7 || b == 8|| b == 10 || b == 12) {
		    	countg1++;
		    }
		    if(a==4||a==6||a==9||a==11) {
		    	countg2++;
		    }
		    if(b==4||b==6||b==9||b==11) {
		    	countg2++;
		    }
		    if(a==2) {
		    	countg3++;
		    }
		    if(b==2) {
		    	countg3++;
		    }
		    if(countg1 == 2||countg2 == 2||countg3==2) {
		    	System.out.println("Yes");
		    }
		    else {
		    	System.out.println("No");
		    }
		    
		    sc.close(); }
}
