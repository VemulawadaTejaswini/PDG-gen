import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

//        int[] p = new int[n];
//        int h = 0, sum = 0;
//        for (int i = 0; i < n; i++){
//            p[i] = input.nextInt();
//            if (p[i] > h){
//                sum += h;
//                h = p[i];
//
//            } else {
//                sum += p[i];
//            }
//        }
//        System.out.println(Arrays.toString(p));
//        System.out.print(sum + h/2);

        int k = input.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++){
            h[i] = input.nextInt();
        }
        Arrays.sort(h);
//        System.out.println(Arrays.toString(h));

        int max = h[k-1] - h[0];
        for (int i = 1; i <= n - k; i++) {
            max = Math.min(h[i+k-1]-h[i], max);
        }
        System.out.print(max);
    }
}
