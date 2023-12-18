import java.util.*;
import java.io.*;

public class Main {
    public static int digitSum(int N){
    	return (N%10)+((N/10)%10)+((N/100)%10)+((N/1000)%10)+((N/10000)%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int ans = 0;
        for(int n=1;n<=N;n++){
        	if(A<=digitSum(n) && digitSum(n)<=B) ans+=n;
        }
        System.out.println(ans);
    }
}