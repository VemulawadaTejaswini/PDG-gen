import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		for(int i=0;i<n;i++){
			if(a%3==0){
				System.out.print(" "+a);
			}else if(a%10==3){
				System.out.print(" "+a);
			}
			a++;
		}
	}
}