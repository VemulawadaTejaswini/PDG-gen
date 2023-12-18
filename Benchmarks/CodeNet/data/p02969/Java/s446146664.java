import java.util.*;
public class Main{
	public static void main(String[] args) throws Exception {
	 Scanner sc=new Scanner(System.in);
	 int r=sc.nextInt();
		int []w=mul(r,r*3);
	 for(int i=w.length-1;i>=0;i--)
		 if(i==w.length-1 && w[i]==0)
			 continue;
		 else
		     System.out.print(w[i]);
		}
    public static String solution(int i) {
    return "";
    }
    public static int [] mul(int x,int y) {
      int x1=x;
      int y1=y;
      int n=0;
      int m=0;
    	while(x1>0) {
    		x1/=10;
    	n++;
    	}
    	while(y1>0) {
    		y1/=10;
    	m++;
    	}
    	
    	int []a=new int [n];
    	int []b=new int [m];
    	for(int i=0;i<n;i++) {
    		a[i]=x%10;
    		x/=10;
    	}
    	for(int i=0;i<m;i++) {
    		b[i]=y%10;
    		y/=10;
    	}
   // 	System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
    	int []ans=new int [n+m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			int k=a[i]*b[j];
    			int mo=k+ans[i+j];
    			ans[i+j]=mo%10;
    			ans[i+j+1]+=mo/10;
    		}
    //		System.out.println(Arrays.toString(ans));
    	}
    	return ans;
    }
    
}
