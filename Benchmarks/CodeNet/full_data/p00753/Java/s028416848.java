import java.util.Scanner;
 
public class Main{
	public static boolean cheak(int a) {
		for(int i=2;i*i<=a;i++) {
			if(a%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(sc.hasNext()) {
        		int n = sc.nextInt();
        		if(n==0)break;
        		
        		int cnt = 0;
        		for(int i=n+1;i<=2*n;i++) {
        			if(cheak(i)) cnt++;
        		}
        		System.out.println(cnt);
        	}
        }
    }
}



