import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[10];
		for(int i=0;i<n;i++){
			int m=sc.nextInt();
			a[m]+=1;
		}
		int i=0;
	
		for(;;){
			
			if(f(k++,a)){
				break;
			}
			
		}
	}
	public static boolean f(int n,int a[]){
		char c[]=Integer.toString(n).toCharArray();
		//System.out.println(Arrays.toString(c));
		boolean t=true;
		for(int i=0;i<c.length;i++){
			for(int j=0;j<n;j++){
				//System.out.println(i);
				if(a[(c[i]-'0')]!=0){
					t=false;
					break;
				}
			}
		}
		
		
		if(t){
			String ans="";
			for(int u=0;u<c.length;u++){
				ans+=c[u];
			}
			System.out.println(ans);
		}
		return t;
	}

}