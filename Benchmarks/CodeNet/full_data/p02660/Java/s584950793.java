import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int count =0;
      	int i = 2;

     	
      	while(n>1) {
      		if(n%i==0) {
      			n /= i; 
      			count ++;
      		}
      		
      		i++;
      	}
		sc.close();

		System.out.println(count);
	}
}