import java.util.*;
class Main{
	public static void main(String[]args){
      	Scanner sc = new Scanner(System.in);
    	long n,k,min;
      	n = sc.nextLong();
      	k = Math.sqrt(n);
      	min = n;
      	for(long i=1;i<=k;i++){
        	if(n%i==0){
            	long j=n/i;
              	if(i+j-2<min){min = i+j-2;}
            }
        }
      	System.out.println(min);
    }
}