import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  a = scanner.nextInt();
	  	int  b = scanner.nextInt();
	  	int  c = scanner.nextInt();
	  	
	  	if(a < b){
	  		if(b < c)
		  		System.out.println("Yes");
		  	else
		  		System.out.println("No");
	  	}
	  	else
        	System.out.println("No");

        scanner.close();
  }
}
