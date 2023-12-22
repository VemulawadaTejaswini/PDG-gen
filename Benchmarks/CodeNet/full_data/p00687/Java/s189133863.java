import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a, b, c, i, j;
	int[] x;
	while(true){
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    if((a|b|c)==0)
		break;
	    x = new int[a];
	    x[c-1]=1;
	    for(i=b-1; i<a; i+=b){
		x[i]=1;
		for(j=c; i+j<a; j+=c)
		    x[i+c]=1;
	    }
	    int itung=0;
	    for(i=0; i<a; i++)
		if(x[i]==0)
		    itung ++;
	    System.out.println(itung);
	}
    }
}