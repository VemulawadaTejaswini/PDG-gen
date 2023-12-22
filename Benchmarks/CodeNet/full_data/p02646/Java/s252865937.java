import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int v=sc.nextInt();
		int b=sc.nextInt();
		int w=sc.nextInt();
        int t=sc.nextInt();
  		long c=0;
  		int ans=0;
  		if(v<=w){
        ans=1;
        }else{
        c=v-w;
        c*=t;
        if(c>=Math.abs(b-a)){
        	ans=0;
        }else{
        	ans=1;
        }
        }
		
    
 	if(ans==0){
    		System.out.println("YES");
    	}else{
     		System.out.println("NO");
   	 }

    }
}