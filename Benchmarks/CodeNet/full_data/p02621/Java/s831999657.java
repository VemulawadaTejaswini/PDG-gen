import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();	   
	    int answer = a + a*a + a*a*a;
	    System.out.println(answer);	    
	    sc.close();

	}

}
