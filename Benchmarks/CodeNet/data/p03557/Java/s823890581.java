
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array_a = new int[n];
        int[] array_b = new int[n];
        int[] array_c = new int[n];

        for(int i = 0;i < n;i++){
            array_a[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            array_b[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            array_c[i] = sc.nextInt();
        }

        Arrays.sort(array_a);
        Arrays.sort(array_b);
        Arrays.sort(array_c);

        int ans = 0;

//        System.out.println(Arrays.binarySearch(array_a,3));

        for(int i = 0;i < n;i ++){

            int temp_b = Arrays.binarySearch(array_b,array_a[i]);
            temp_b = temp_b < 0?0 - temp_b - 1: temp_b;
//            System.out.println(temp_b);
            for(int j = temp_b;j < n;j ++){

                int temp_c = Arrays.binarySearch(array_c,array_b[j]);
                temp_c = temp_c < 0 ? 0 - temp_c - 1:temp_c;
//                System.out.println(temp_c);
                for(int k = temp_c;k < n;k ++){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}