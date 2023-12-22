import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
  		int n=sc.nextInt();
        String x=sc.next();
  		int x2 = Integer.parseInt(x,2);	
		for(int a=n-1;a>=0;a--){
         int x1=x2^(1<<a); 
         int c=0;
         while(x1>0){
         int k=0;
         int x3=x1;
         while(x3>0){
         if(x3%2==1){
         k++;
         }
          x3=x3/2;
         }
          x1=x1%k;
           c++;
         }
          	System.out.println(c);
        }


    
    }
 
  
}