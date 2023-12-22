import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    int x = 2;  // 匹
	    int y = 100;  // 本
	    
	    int kame = (y - x * 2) / 2;
	    
	    int turu = x - kame;
	    
	    if (kame + turu < x  && kame + turu == x) {
	      System.out.println("yes");
	    } else {
	      System.out.println("No");
	    }
	  }
}