import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int m = sc.nextInt();
      	long k = sc.nextLong();
      	long[] a = new long[n];
      	long[] b = new long[m];
      	int aPos = 0;
      	int bPos = 0;
      	long ans = 0;
      	long tmp = 0;
      	long aaa = 0;
      	for(int i=0;i<n;i++){
          a[i] = sc.nextLong();
          if( tmp + a[i] <= k ){
            tmp += a[i];
            aPos = i+1;
          }
        }
      	for(int i=0;i<m;i++){
          b[i] = sc.nextLong();
        }
      	long[] Atmp = new long[aPos];
      	for(int i=0;i<aPos;i++){
          aaa = 0;
          for(int j=0;j<i;j++){
            Atmp[i] += a[j];
            aaa++;
          }
          for(int j=0;j<m;j++){
            Atmp[i] += a[j];
            aaa++;
            if( Atmp[i] > k ){
              aaa--;
              if( aaa > ans ){
                ans = aaa;
              }
              break;
            }
          }
        }
      System.out.println(ans);
    }
}