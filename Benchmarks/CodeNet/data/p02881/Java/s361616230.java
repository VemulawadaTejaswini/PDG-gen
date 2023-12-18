import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long c1[] = new long[1000];
    long c2[] = new long[1000];
    long a=Long.MAX_VALUE;
    int g = 0;
    
    for(int i=1;i<Math.sqrt(n);i++){
    	if(n%i==0){
        	a[g]=i;
          	b[g]=n/i;
          	g++;
        }
    }
    
    for(int j=0;j<g;j++){
      a = Math.min(a,c1[i]+c2[i]-2);
    }
    System.out.println(a);
  }
}