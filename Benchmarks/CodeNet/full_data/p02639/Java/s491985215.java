import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    int xxxxx[] = new int[5];
	    for (int i = 0; i < 5; i++) {
	      xxxxx[i] = sc.nextInt();
	    }
	    
	    int count = 1;
	    for (int x : xxxxx) {
	      if (x == 0) {
	        System.out.println(count);
	      }
	      count++;
	    }
	    
	  }
}