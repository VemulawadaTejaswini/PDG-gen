import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    long[] numSumList = new long[n + 1];
    long all = 0;

    for(int i = 0 ; i < n ; i++){
      a[i] = sc.nextInt();
      numSumList[a[i]]++;
    }
      for(int i = 0 ; i < n ; i++){
        long j = numSumList[i];
        all += j * (j - 1L) / 2L;
	}
      for(int i = 0 ; i < n ; i++){
        long k = numSumList[a[i]];
        	System.out.println(all - (k - 1));

      }
    }
}
