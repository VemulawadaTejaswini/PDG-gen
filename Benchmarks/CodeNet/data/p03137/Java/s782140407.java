import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] x= new int[m];
		
		int ans=0;
		
		for(int i=0;i<m;i++){
			x[i]=sc.nextInt();
		}
		
		Arrays.sort(x);
		
		int div=Math.abs((int)Math.ceil(((x[m-1]-x[0])/n)));
		
		int cn=n;
		
		for(int i=0;i<m-1;i++){
			System.out.println("div:"+div);
			if(x[i+1]-x[i]>div){
				cn=cn-1;
				div=Math.abs((int)Math.ceil(((x[m-1]-x[i+1])/cn)));
				continue;
			}
			for(int j=i;j<m-1;j++){
				System.out.println("x[i]:"+x[i]);
				if(j==m-2 && x[j+1]<x[i]+div){
					ans=ans+x[j+1]-x[i];
					i=m-2;
					break;
				}
				else if(x[j+1]<x[i]+div)continue;
				else{
					ans=ans+x[j]-x[i];
					i=j;
					System.out.println(ans);
					break;
				}
				
			}
		}
		
		
		
		
		System.out.println(ans);
	}
	
	
	

}
