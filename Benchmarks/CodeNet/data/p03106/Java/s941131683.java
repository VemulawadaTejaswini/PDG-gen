import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    int k = scan.nextInt();

    int d = 1;
    int c = 0;
    while(true) {
    	if(a%d==0 && b%d==0) {
    		c++;
    		if(k==c) {
    			break;
    		}
    	}
    	d++;
    }
    System.out.println(d);
  }
}