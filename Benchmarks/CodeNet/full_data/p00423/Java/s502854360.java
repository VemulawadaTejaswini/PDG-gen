import java.util.*;

class Test{

    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	int n,a,b,sum_a,sum_b;

	while(true){

	    n = in.nextInt();
	    if(n == 0)break;
	    sum_a=0;
	    sum_b=0;

	    for(int i=0;i<n;i++){
		a=in.nextInt();
		b=in.nextInt();
		if(a>b)sum_a+=(a+b);
		else if(b>a)sum_b+=(a+b);
		else{ 
		    sum_a+=a;
		    sum_b+=b;
		}
	    }

	    System.out.println(sum_a+" "+sum_b);
	    
	    
	}



    }


}