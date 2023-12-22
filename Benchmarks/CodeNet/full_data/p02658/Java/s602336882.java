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
	    if(p<=18||m==0){
		a*=m;
	    }
	}
	if(p>18){
	    System.out.println("-1");
	}else{
	    long y = 1;
	    for(int i=0;i<18;i++){
		y*=10;
	    }
	    long z = a-y;
	    if(!((int)z>0)){
		if(a!=0)
		    System.out.println(a);
	    }else
		if(a==0)
		    System.out.println("0");
		else
		    System.out.println("-1");
	}
      }
}
