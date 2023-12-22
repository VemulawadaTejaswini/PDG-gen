import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int i=1;
	int a = s.nextInt();
	while(a!=0){
	System.out.println("Case"+" "+i+":"+" "+a);
		i=i+1;
		a = s.nextInt();
		}
	}
}