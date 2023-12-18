import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int i=0,j=0;i<m;i++,j++){
			System.out.println((i+1)+" "+(n-j));
			if(i*2==n && n%2==0)i++;
		}
		
		

		
	}
	
}
