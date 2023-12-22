import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner o = new Scanner(System.in);
		int n = o.nextInt();
		int a = o.nextInt();
		int max = a;
		int min = a;
		long sum = 0;
		
		for(int i = 0;i < n;i++){
			//System.out.println(a);
			if(max < a){
				max = a;
			}	
			if(min > a){
				min = a;
			}
			sum = sum + a;
			if((n-1) != i)
				a = o.nextInt();
			else
				break;
		}
		System.out.println(min+" "+max+" "+sum);
	}

}