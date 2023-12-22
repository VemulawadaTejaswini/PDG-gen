import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean flag=true;
		for(int i=1,j=1,k=0;k<m;i++,j++,k++){
			if(n%2==0 && (n-j)-i<=n/2 && flag==true){
				i++;
				flag=false;
			}
			System.out.println(i+" "+(n-j));
			
		}
		
		

		
	}
	
}
