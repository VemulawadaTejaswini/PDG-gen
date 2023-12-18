import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] numSumList = new int[n + 1];
    long all = 0;

    for(int i = 0 ; i < n ; i++){
      a[i] = sc.nextInt();
      numSumList[a[i]] = numSumList[a[i]] + 1;
    }
      for(int i = 0 ; i < n ; i++){
        long j = numSumList[i];
        all += j * (j - 1L) / 2L;
	}
      for(int i = 0 ; i < n ; i++){
        int k = numSumList[a[i]];
        if(k > 1)
        System.out.println(all - (long)k * ((long)k - 1L) / 2L + ((long)k - 1L) * ((long)k - 2L) / 2L);
        else
        	System.out.println(all);

      }
    }
}
