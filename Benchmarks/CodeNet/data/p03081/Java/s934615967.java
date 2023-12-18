import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] t = new char[Q];
        char[] d = new char[Q];

        for(int i=0; i<Q; i++) {
            t[i] = sc.next().charAt(0);
            d[i] = sc.next().charAt(0);
        }

        // 落ちる区間を二分探索 左側
        int l = 0;
        int r = N/2;
        int center=0;
        while(l<=r) {
            center = (l+r)/2;
            if (!isExist(center,s,t,d)) {
                l = center + 1;
                center++;
            } else {
                r = center - 1;
            }
        }
        int left = center;

        // 落ちる区間を二分探索 右側
        l = N/2 + 1;
        r = N-1;
        center=0;
        while(l<=r) {
            center = (l+r)/2;
            if (isExist(center,s,t,d)) {
                l = center+1;
                center++;
            } else {
                r = center-1;
            }
        }
        int right = center;

        System.out.println(right - left);
   }

   // 最終的に生き残れるかどうか
   private static boolean isExist(int initialIndex, char[] s, char[] t, char[] d ) {
        int currentIndex = initialIndex;
        for (int i = 0; i < t.length ; i++) {
            if (s[currentIndex] == t[i]) {
                switch(d[i]) {
                    case 'L':
                        currentIndex--;
                        break;
                    case 'R':
                        currentIndex++;
                        break;
                }
                if(currentIndex<0 || currentIndex> s.length-1) return false;
            }
        }
        return true;
   }
}