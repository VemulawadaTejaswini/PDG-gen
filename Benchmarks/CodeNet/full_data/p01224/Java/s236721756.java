import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);

        boolean [] perfect = new boolean[100000001];
        perfect[6]=true;
        perfect[28]=true;
        perfect[496]=true;
        perfect[8128]=true;
        perfect[33550336]=true;
        while(true){

        	int n = scan.nextInt();
        	if(n==0)break;
        if(perfect[n])
        	System.out.println("perfect number");
        else if(n>fuctor_sum(n))System.out.println("deficient number");
        else System.out.println("abundant number");
        
        }
    }
    public static int fuctor_sum(int n){
    	int sum=0;

    	for(int i=1;i<n;i++){
    		if(n%i ==0)sum+=i;
    		if(sum>n)return n+1;
    	}
    	return sum;
    }
}