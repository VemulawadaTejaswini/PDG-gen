import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double k=sc.nextDouble();
  		double kaku=1/n;
  		double ans=0;
  		int d=0;
		
  		
		for(int c=1;c<=n;c++){
          	d=c;
    		while(d<k){
             kaku*=0.5;
             d*=2;
            }
          ans+=kaku;
          
          kaku=1/n;
    	}
    
    	System.out.println(ans);
    }
}