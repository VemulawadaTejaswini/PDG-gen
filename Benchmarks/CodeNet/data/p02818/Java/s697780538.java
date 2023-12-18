import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();

    for(int i=0;i<k;i++) {
    	if(a>0) {
    		a -= 1;
    	}
    	else {
    		b -= 1;
    	}
    }
    System.out.println(a + " " + b);
  }
}