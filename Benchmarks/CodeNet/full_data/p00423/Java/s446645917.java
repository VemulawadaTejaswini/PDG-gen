import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	int a=0,b=0,n=scn.nextInt();

	for(int i=0; i<n; i++){
	    int ta = scn.nextInt();
	    int tb = scn.nextInt();

	    if(ta>tb)
		a += ta+tb;
	    else if(ta<tb)
		b += ta+tb;
	    else{
		a += ta;
		b += tb;
	    }
	}

	System.out.println(a+" "+b);
    }
} 