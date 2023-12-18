import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
		
  		int[] s=new int[n];
		for(int c=0;c<n;c++){
    		s[c]=sc.nextInt();
          	ans+=s[c];
    	}
  		Arrays.sort(s);
  
  		if(ans%10==0){
  		
  		for(int d=0;d<n;d++){
        if((ans-s[d])%10!=0){
        	ans-=s[d];
            break;
        }
        }
        }
  		if(ans%10==0){
        ans=0;
        }
    	System.out.println(ans);
    }
}
