import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
           int n = sc.nextInt();
           int x = sc.nextInt();
           int t = sc.nextInt(); // minutes

           int time = 0;
           int made = 0;
           
           while (n > made ) {
        	   made += x;
        	   time += t;
           }

           System.out.println(time);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
