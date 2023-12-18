

import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        int[] left = new int[k];
        int[] right = new int[k];

        int idx = 0;

        Left:
        for (int i=0; i<k; i++) {
            if (n<=idx) break Left;
            if (arr[idx]=='o') {
                left[i] = idx;
                idx += (c + 1);
            } else {
                while (arr[idx]!='o') {
                    idx++;
                }
                i--;
            }
        }

        idx = n-1;

        Right:
        for (int i=k-1; i>=0; i--) {
            if (idx<=-1) break Right;
            if (arr[idx]=='o') {
                right[i] = idx;
                idx -= (c + 1);
            } else {
                while (arr[idx]!='o') {
                    idx--;
                }
                i++;
            }
        }

        List<Integer> L = new ArrayList<>();
        List<Integer> R = new ArrayList<>();

        for (int i=0; i<k; i++) L.add(left[i]);
        for (int i=0; i<k; i++) R.add(right[i]);

        int cnt = 0;

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<k; i++) {
            if (left[i]==right[i]) sb.append(left[i]+1+"\n");
        }

//        System.out.println(L);
//        System.out.println(R);
        System.out.println(sb.toString());

    }

}