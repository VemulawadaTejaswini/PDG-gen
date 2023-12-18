import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      	int x=sc.nextInt();
      	int y=sc.nextInt();
        long o=1;
      	int a=2*x-y;
      	int b=2*y-x;
      
      	if(a%3==0&&b%3==0){
        	a/=3;
          	b/=3;
          	int c= a+b;
          	boolean[] a2=new boolean[a];
          	boolean[] b2=new boolean[b];
          	long l=1;
          	long m=1;
          	long n=1;          	
            for(long i=1;i<=c;i++){
                l*=i;
              
              	for(int j=1;j<=a;j++){
                	if(!a2[j-1]&&l%j==0){
                    	a2[j-1]=true;
                      	l/=j;
                    }
                }
              	for(int j=1;j<=b;j++){
                	if(!b2[j-1]&&l%j==0){
                    	b2[j-1]=true;
                      	l/=j;
                    }
                }            
                           
            }
          
          o=l%1000000007;
        }else{
        	o=0;
        }
      	System.out.println(o);
    }
}