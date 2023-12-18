import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int R = Integer.parseInt(sc.next());
        sc.close();
        
        //Rの値で条件分岐
        if(R < 1200) {
        	System.out.println("ABC");
        }else if(R < 2800) {
        	System.out.println("ARC");
        }else {
        	System.out.println("AGC");
        }
	}
}