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
  		for(int d=0;d<n;d++){
        if(ans%10==0){
        	ans-=s[d];
        }else{
        	break;
        }
        }
  
    

    	System.out.println(ans);
    }
}
