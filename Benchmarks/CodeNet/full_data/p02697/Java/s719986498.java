import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int i=1,j=0,k=0;k<m;i++,j++,k++){
			System.out.println(i+" "+(n-j));
			if(i*2<n/2 && (i+1)*2>=n/2 && n%2==0)i++;
		}
		
		

		
	}
	
}
