import java.util.Scanner;

public class Main{
	static int[] p;
	static int n;
	
	// a i-1 人までの A の合計
	// b 
	static int choice(int i,int a,int b) {
		if(i < p.length) {
		//case 1
		int m1 = choice(i+1,a+p[i],b);
		//case 2
		int m2 = choice(i+1,a, p[i]+b);
		return Math.min(m1, m2);
		}
		else {
			return Math.abs(a-b);
		}
		
	}
	
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(true) {
        		int n = sc.nextInt();
        		if(n==0) break;
        		p =  new int[n];
        		for(int i=0;i<n;i++) {
        			p[i] = sc.nextInt();        		}
        		System.out.println(choice(0,0,0));
        	}
        }
    }
}
 
