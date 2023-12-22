import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
       try {
			Scanner sc=new Scanner(System.in);
			int d=sc.nextInt();
			int t=sc.nextInt();
			int s=sc.nextInt();
			int k=d/s;
			if(k<=t) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}catch(Exception e) {
			
		}
    }
}