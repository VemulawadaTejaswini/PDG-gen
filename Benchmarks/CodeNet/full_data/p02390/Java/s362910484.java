import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  num = scanner.nextInt();
	  	int  a = num/3600;
	  	int R = num%3600;
	  	int  b = R/60;
	  	R = R%60;
	  	int c = R%60;
        System.out.print(a +":"+ b + ":" + c);
        scanner.close();
  }
}
