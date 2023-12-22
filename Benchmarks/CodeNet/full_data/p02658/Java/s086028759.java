import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	long a = 1;
	double p = 0;
	int n = sc.nextInt();
	for(int i=0;i<n;i++){
	    long m = sc.nextLong();
	    p+=Math.log10(m);
	    if(p<=18){
	    a*=m;
	    }
	}
	if(p>18){
	    System.out.println("-1");
	}else{
	    //System.out.println(p);
	    System.out.println(a);
	}
      }
}
