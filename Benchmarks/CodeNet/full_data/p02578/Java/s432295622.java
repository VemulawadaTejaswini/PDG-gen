import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		
		int result=0;
		int num=0;
		
		for(int i=0;i<n;i++) {
			if(num==0) {
				int a=sc.nextInt(); 
				num=a;
			}else {
				int a=sc.nextInt(); 
				if(a>=num) {
					num=a;
				}else {
					result=result+num-a;
				}
			}
			
		}
		
		System.out.println(result);
		
	}

}
