import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    double x = sc.nextInt();
	    double y = sc.nextInt();
	    
	    double kame = (y - x * 2) / 2;
	    System.out.println(kame);
	    double turu = x - kame;
	    System.out.println(turu);
	    if (kame >= 0  && turu >= 0 && kame + turu == x) {
	      System.out.println("yes");
	    } else {
	      System.out.println("No");
	    }
	  }
}