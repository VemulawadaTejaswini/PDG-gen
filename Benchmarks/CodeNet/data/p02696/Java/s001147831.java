import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
		double n=sc.nextDouble();
  		double ans=0;
    
 	if(n<b){
      		ans=Math.floor(n*a/b);
    		System.out.println(ans);
    	}else{
      		ans=Math.floor(a*(b-1)/b);
     		System.out.println(ans);
   	 }

    }
}
