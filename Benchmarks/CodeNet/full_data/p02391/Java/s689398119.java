import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  x = scanner.nextInt();			//入力
	  	int  y = scanner.nextInt();
	  	
	  	if(x == y)
	  		System.out.println(x +"="+ y);
	  	else{
	  		if(x > y)
	  			System.out.println(x +">"+ y);
	  		else
	  			System.out.println(x +"<"+ y);
	  	}
        scanner.close();
  }
}
