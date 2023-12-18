import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();

        int aMax = 0;
        List<Integer> bList = new ArrayList<>();
        long sumB = 0;

        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            if (a > aMax) {aMax = a;}

            int b = sc.nextInt();
            bList.add(b);
            sumB += b;
        }
        long ans = 0;
        Collections.sort(bList);
        int index = Collections.binarySearch(bList, aMax);
        index = Math.abs(index) - 1;
        for (int i=0; i<index; i++) {
            sumB -= bList.get(i);
        }

        if (sumB < H) {
            ans = (N-index) + (long)Math.ceil((float)(H-sumB)/aMax);
        } else {
            long trackSum = 0;
            for (int i=N-1; i>=index; i--) {
                trackSum += bList.get(i);
                ans++;
                if (trackSum > H) {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
