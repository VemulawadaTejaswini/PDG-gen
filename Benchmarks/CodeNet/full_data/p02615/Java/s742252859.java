import java.util.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	BigInteger a[] = new BigInteger[N];
        for (int i=0; i<N; i++) {
            a[i] = BigInteger.valueOf(sc.nextInt());
        }
      
      	Arrays.sort(a, Collections.reverseOrder());
      	BigInteger ans = BigInteger.ZERO;
      
      	for (int i=1; i<N-1; i++) {
          	if(i<=N/2){
           	 ans = ans.add(a[i-1]);
              //System.out.println(a[i-1]);
            }
          	else{
              ans = ans.add(a[N-i-1]);
              //System.out.println(a[N-i-1]);
            }
        }
      	ans = ans.add(a[N/2]);
      
       	System.out.println(ans);
    }
}