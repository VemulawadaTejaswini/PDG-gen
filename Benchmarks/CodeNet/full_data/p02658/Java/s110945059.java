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
      	long ans2 = (long)ans;
        if(ans2 > sum2 || ans2 < 0){
          System.out.println("-1");
        }
        else {
          System.out.println(ans2);
        }
      	//System.out.println(ans2);
    }
}