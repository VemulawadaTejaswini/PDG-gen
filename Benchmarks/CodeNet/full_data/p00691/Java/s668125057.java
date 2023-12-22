import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int z = sc.nextInt();

	while(z!=0){
	    int z3 = z*z*z;
	    int x3 = 0;
	    int y3 = 0;
	    int sum = 0;
	    for(int i=1;i<z; i++){
		x3 = i*i*i;
		if(x3>z3){break;}
		for(int j=1; j<z; j++){
		    y3 =j*j*j;
		    if(x3+y3>z3){j=z-1; continue;}
		    if(sum<x3+y3){sum = x3+y3;}
		}
	    }

	    int ans = z3 - sum;
	    System.out.println(ans);

	    z = sc.nextInt();
	}
    }
}