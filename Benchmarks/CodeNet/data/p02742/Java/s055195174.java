import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long h=sc.nextLong();
        long w=sc.nextLong();
		long ans=0;
  
  	if(w==1){
    	ans=1;
    }else if(h%2==1){
    		if(w%2==0){
            	ans=h*(w/2);
            }else{
            	ans=h*(w/2)+h/2+1;
            }
    	}else{
			ans=h/2*w;
   	 }

    	System.out.println(ans);
    }
}