import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
           int n = sc.nextInt();
           int s = sc.nextInt();
           if(n+s == 0) break;
           System.out.println(sol(n, s, 0));
        }
    }
    public static int sol(int n, int s, int c) {
    	if(n==1 && s>=c && s<10) return 1;
        if(n==1) return 0;
        int sum = 0;
        for(int i=c; i<10 && i<s; i++){
            sum += sol(n-1,s-i,i+1);
        }
        return sum;
    }
}
