import java.util.Scanner;

public class Main {
	
    public static int helperFunc(int num1, int num2) { 
        if (num1 == 0) {
          return num2; 
        }
        if (num2 == 0) {
          return num1; 
        } 
        if (num1 == num2) { 
            return num1;
        }
       
        if (num1 > num2) {
        	return helperFunc(num1-num2, num2);
        } else {
        	return helperFunc(num1, num2-num1);
        } 
    } 
	      

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		System.out.println(helperFunc(a,b));

	}

}
