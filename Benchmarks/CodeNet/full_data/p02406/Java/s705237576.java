import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int i= 1;
	 while (++i <= n){
		 if(i % 3 == 0){
			 System.out.printf(" "+ i);
		 }
		 else if(i % 10 == 3){
			 System.out.printf(" "+ i); 
		 }
	 }
}
}