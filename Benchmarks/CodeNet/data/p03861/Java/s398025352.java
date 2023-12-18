import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = scan.nextInt();
		
		int kosuu = 0;
		
		
		for(int i = a;i<=b;i++){
			if(i%x==0)
				kosuu +=1;
			
		}
		
		
		
		System.out.println(kosuu);
		
	}

}
