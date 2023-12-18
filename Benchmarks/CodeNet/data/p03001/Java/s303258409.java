import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        double w=sc.nextDouble();
        double h=sc.nextDouble();
		double x=sc.nextDouble();
		double y=sc.nextDouble();
  		
		
  		double ans=w*h/2;
  		System.out.println(ans);
    
 	if(x==w/2&&y==h/2){
    		System.out.println(1);
    	}else{
     		System.out.println(0);
   	 }

    	
    }
}