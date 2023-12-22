import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			
			for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			String judge = "";
			
			
			if((a+b+c)/3 >= 70)judge = "B";
			if((a+b+c)/3 >= 50 && (b >= 80 || c >= 80))judge = "B";
			if(a==100||b==100||c==100)judge = "A";
			if((b+c)/2 >= 90)judge = "A";
			if((a+b+c)/3 >= 80)judge = "A";
			if(judge.equals(""))judge = "C";
			
			System.out.println(judge);
			}
		}
		}
	}