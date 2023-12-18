import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long n;
        long[] a = new long[5];
        long min = 1000000000000000L;
        int minV = 0;
        n = sc.nextLong();
        for(int i=0;i<5;i++){
            a[i] = sc.nextLong();
            if(a[i] < min){
              min = a[i];
              minV=i;
            }
        }
        System.out.println((n+a[minV]-1)/a[minV] + 4);   
	}
}