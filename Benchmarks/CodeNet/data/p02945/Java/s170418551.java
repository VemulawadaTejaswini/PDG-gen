import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
		
      	int c = a + b;
      	int d = a - b;
		int e = a * b;
	
      	if(c > d){
			System.out.println();
          	if(c > e){
            	System.out.println(c);
            }
          	System.out.println(e);
        }
      	
      	System.out.println(d);
    }
}
