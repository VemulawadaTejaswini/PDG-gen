import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = f(N);
        int i = 0;
        while (true){
        		if (A%10 == 0) {
        			A = A/10;
        			i++;
        		} else {
        			break;
        		}
        }
        System.out.println(i);
    }
    static long f(long n) {
    		if (n<2) return 1;
    		return n*f(n-2);
    }
} 