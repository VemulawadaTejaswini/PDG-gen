import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int K = sc.nextInt();
	int count = 0;
	for(int a=1;a<=K;a++){
	    for(int b=1;b<=K;b++){
		for(int c=1;c<=K;c++){
		    count += gcd(gcd(a,b),c);
		}
	    }
	}
	System.out.print(count);
    }
    public static int gcd(int p,int q){
	if(p%q==0) return q;
	return gcd(q,p%q);
    }
}
