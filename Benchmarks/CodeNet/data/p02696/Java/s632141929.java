import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner  sc=new Scanner(System.in);
    
	long a,b,n;
	a=sc.nextLong();
	b=sc.nextLong();
	n=sc.nextLong();
	
	long max=0;
	int i=1;
	while(i<=n){
		max=Math.max(max,((a*i)/b)-(a*(i/b)));
        	i++;
	
  }
  System.out.println(max);
  }
}
