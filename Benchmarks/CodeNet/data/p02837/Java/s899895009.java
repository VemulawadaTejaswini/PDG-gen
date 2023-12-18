import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        ArrayList<int[]> xx = new ArrayList<int[]>();
        ArrayList<int[]> yy = new ArrayList<int[]>();
        for (int i=0;i<N;i++) {
            A[i] = Integer.parseInt(sc.next());
            int[] x = new int[A[i]];
            int[] y = new int[A[i]];
            for (int j=0;j<A[i];j++) {
                x[j] = Integer.parseInt(sc.next())-1;
                y[j] = Integer.parseInt(sc.next());
            }
            xx.add(x);
            yy.add(y);
        }

        int ans = 0;
        loop:for (int i=0;i<1<<N;i++) {
            int[] array = new int[N];
            int tmp = i;
            int sum = 0;
            for (int j=0;j<N;j++) {
                if ((tmp&1)==1) {
                    array[j]=1;
                    sum++;
                }
                tmp=tmp>>1;
            }
            for (int k=0;k<N;k++) {
                int[] xxx = xx.get(k);
                int[] yyy = yy.get(k);
                if (array[k]==0) {
                    for (int l=0;l<A[k];l++) {
                        if (array[xxx[l]]==yyy[l]) continue loop;
                    }
                } else { // array[k]=1
                    for (int l=0;l<A[k];l++) {
                        if (array[xxx[l]]!=yyy[l]) continue loop;
                    }
                }
            }
            ans = Math.max(ans, sum);
            // System.out.println(Arrays.toString(array));
        }
        System.out.println(ans);
    }
}