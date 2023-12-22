import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long a[] = new Long[N];
      	long ans = 1;
      	double sum = Math.pow(10,18);
      	long sum2 = (long)sum;
        for (int i=0; i<N; i++) {
            a[i] = sc.nextLong();
          	ans = ans * a[i];
        }
        if(ans <= sum2 && ans >= 0){
          System.out.println(ans);
        }
        else {
          System.out.println("-1");
        }
      	//System.out.println(ans);
    }
}