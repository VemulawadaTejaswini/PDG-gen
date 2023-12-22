import java.util.*;
import java.util.Arrays;

public class Main{
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int max = 0;
		for(int i=0;i<=4;i++){
			if((int)(Math.floor(a*i/b)-a*(Math.floor(i/b)))>=max){
				max =(int)(Math.floor(a*i/b)-a*(Math.floor(i/b)));
			}

		}
		System.out.println(max);
		

		
		
	}
}









