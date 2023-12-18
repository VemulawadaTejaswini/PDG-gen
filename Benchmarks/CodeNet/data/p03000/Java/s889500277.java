import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
 
  		int[] l=new int[n];
  		int d=0;
  		int ans=0;
		for(int c=0;c<n;c++){
    		l[c]=sc.nextInt();
          	d+=l[c];
            if(d<=x){
            	ans++;
            }else{
            	break;
            }
    	}
    
    	System.out.println(ans+1);
    }
}
