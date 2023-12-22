import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int num[];
		num = new int[10000];
		int i;
		int min=0, big=0, sum=0;
		
		int a = scan.nextInt();
		for(i=0; i<=a-1; i++){
			int b = scan.nextInt();
			
			num[i] = b;
			if(i == 0){
				min = b;
				big = b;
			}
		}
		
		for(i=0; i<=a-1; i++){
			if(min>num[i]){
				min = num[i];
			}
			if(big<num[i]){
				big = num[i];
			}
			sum += num[i];
		}
		
		System.out.println(min+" "+big+" "+sum);	
	}
}