import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        ArrayList<Integer> val_1 = new ArrayList<Integer>();
        ArrayList<Integer> val_2 = new ArrayList<Integer>();
        ArrayList<Integer> val_3 = new ArrayList<Integer>();
        ArrayList<Integer> val_4 = new ArrayList<Integer>();
        int w1 = Integer.parseInt(sc.next());
        int v1 = Integer.parseInt(sc.next());
        val_1.add(v1);
        for (int i=0;i<N-1;i++) {
            int w = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            if (w==w1) {
                val_1.add(v);
            } else if (w==w1+1) {
                val_2.add(v);
            } else if (w==w1+2) {
                val_3.add(v);
            } else { // w==w1+3
                val_4.add(v);
            }
        }
        Collections.sort(val_1, (o1, o2) -> Integer.compare(o2, o1));
        Collections.sort(val_2, (o1, o2) -> Integer.compare(o2, o1));
        Collections.sort(val_3, (o1, o2) -> Integer.compare(o2, o1));
        Collections.sort(val_4, (o1, o2) -> Integer.compare(o2, o1));
        // System.out.println(val_1);
        // System.out.println(val_2);
        // System.out.println(val_3);
        // System.out.println(val_4);
        long[] dp_1 = new long[val_1.size()+1];
        long[] dp_2 = new long[val_2.size()+1];
        long[] dp_3 = new long[val_3.size()+1];
        long[] dp_4 = new long[val_4.size()+1];
        for (int i=0;i<val_1.size();i++) {
            dp_1[i+1] = dp_1[i]+(long)val_1.get(i);
        }
        for (int i=0;i<val_2.size();i++) {
            dp_2[i+1] = dp_2[i]+(long)val_2.get(i);
        }
        for (int i=0;i<val_3.size();i++) {
            dp_3[i+1] = dp_3[i]+(long)val_3.get(i);
        }
        for (int i=0;i<val_4.size();i++) {
            dp_4[i+1] = dp_4[i]+(long)val_4.get(i);
        }
        long ans = 0L;
        for (int i=0;i<=N;i++) {
            for (int j=0;j<=N;j++) {
                for (int k=0;k<=N;k++) {
                    int l = Math.min(val_4.size(), N-i-j-k);
                    if (l<0) {
                        continue;
                    }
                    if (i>val_1.size() || j>val_2.size() || k>val_3.size() || l>val_4.size()) {
                        continue;
                    }
                    // System.out.println("a: " + ((long)w1*i+(long)(w1+1)*j+(long)(w1+2)*k+(long)(w1+3)*l));
                    if (((long)w1*i+(long)(w1+1)*j+(long)(w1+2)*k+(long)(w1+3)*l)>(long)W) {
                        // System.out.println("aa");
                        continue;
                    }
                    ans = Math.max(ans, dp_1[i]+dp_2[j]+dp_3[k]+dp_4[l]);
                }
            }
        }
        System.out.println(ans);
    }
}