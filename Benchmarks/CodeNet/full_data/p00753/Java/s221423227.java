import java.util.*;
import java.lang.Math;
class Main{
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	while(true) {
	    int n = sc.nextInt();
	    if (n == 0) break;
	    int count = 0;
	    for(int i=n+1;i<=2*n;i++){
	        if (isPrime(i))
		    count++;
	    }
	    System.out.println(count);
	}
    }
    static boolean isPrime(int n){
	if(n==1 || n==2)return true;
	double pow =Math.pow(n,0.5)+1;
	for(int i = 2; i<pow; i++){
	    if(n % i == 0) return false;
	}
	return true;
    }
}