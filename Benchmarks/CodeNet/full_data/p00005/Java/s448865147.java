import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	long a = sc.nextInt();
	long b = sc.nextInt();

	long smaller = a;
	long larger = b;
	if(b<smaller){smaller = b; larger = a;}

	int count = 0;
	long gcd = 0;
	for(long i=smaller; i>0; i--){
	    count=0;
	    for(long j=1; j<smaller; j++){
		if(i*j>larger){break;}
		if(i*j==a || i*j==b){count++;}
		if(count==2){gcd = i;}
	    }
	    if(count==2){break;}
	}
	long lcm = (a*b)/gcd;

	System.out.println(gcd+" "+lcm);
    }
}