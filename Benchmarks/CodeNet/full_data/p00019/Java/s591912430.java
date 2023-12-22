import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner	sc	= new Scanner(System.in);
		int		n	= sc.nextInt();
		sc.close();
		
		if(n==0||n==1){
			System.out.println(1);
		}else{
			for(int i=n-1; i>0; i--){
				n *= i;
			}
			System.out.println(n);
		}
	}
}