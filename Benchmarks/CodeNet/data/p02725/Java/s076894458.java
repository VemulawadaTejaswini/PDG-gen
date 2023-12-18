import java.util.*;

/*
問題文


*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i ++) {
                a[i] = sc.nextInt();
        }
            Arrays.sort(a);
	if (a[n-1]-a[0] <= k/2) {
      
            System.out.println(a[n-1]-a[0]);
    } else {
      for (int i = 0; i < n; i ++) {
                if (k/2 < a[i]) {
                    a[i] = a[i] - k;
                } else if (k/2 == a[i]) {
                    a[i] = 0;
                }
        }
            Arrays.sort(a);
            System.out.println(Math.abs(a[0]) + Math.abs(a[n-1]));
    }
    }
}