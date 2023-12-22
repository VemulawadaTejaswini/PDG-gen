import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int x=1;
		while(x<n+1){
			if(x%3==0){
				System.out.print(" "+x);
			}else if(x%10==3){
				System.out.print(" "+x);
			}else if((x-x%10)/10%10==3){
				System.out.print(" "+x);
			}else if((x-x%100)/100%10==3){
				System.out.print(" "+x);
			}else if((x-x%1000)/1000%10==3){
				System.out.print(" "+x);
			}
			x++;
		}
	}	
}