import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
	int b = sc.nextInt();
	int n = sc.nextInt();
	
	int result=0;
	int max = 0;

	if(n<b) max = (a*n)/b;
	else{
	    for(int x=0;x<=n;x++){
		if(x<b) result = (a*x)/b;
		else result = (a*x)/b - a * (x/b);
		if(result > max) max = result;
	    }
	}
       
        
	/*
	for(int x=0;x<=n;x++){
	    result =  (a*x)/b - a * (x/b) ;
	    if(result > max) max = result;
	}
	*/
	System.out.print(max);
    }
}
