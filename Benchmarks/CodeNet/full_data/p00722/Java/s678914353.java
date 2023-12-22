import java.util.Scanner;

public class Main {
	
	static boolean[] prime=new boolean[1000000];
	static void primes(int x) {
		for(int i=2; x*i<1000000; i++) {
			prime[x*i]=false;
		}
	}
	
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
                for(int i=2; i<1000000; i++) {
                	prime[i]=true;
                }
                for(int i=2; i<1000000; i++) {
                	if(prime[i]) {
                		primes(i);
                	}
                }
                prime[0]=prime[1]=false;
                
                while(sc.hasNext()) {
                	int a=sc.nextInt();
                	int d=sc.nextInt();
                	int n=sc.nextInt();
                	if(a+d+n==0) break;
                	int count=0;
                	int ans=0;
                	for(int i=0; i<1000000; i++) {
                		if(prime[a+d*i]) {
                			count++;
                		}
                		if(count==n) {
                			ans=a+d*i;
                			break;
                		}
                	}
                	System.out.println(ans);
                	
                }
                
        }
    }
}
