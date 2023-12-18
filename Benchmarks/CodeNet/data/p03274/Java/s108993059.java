import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main{

    static int N;
    static int K;

    static int b[];
    static int [] num;
    static List<Integer> list;
    public static void main(String args[]) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        K= sc.nextInt();
        num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        list=  new ArrayList<>();
        permutation(num, 0, 0, K);
        Collections.sort(list);
        System.out.println(list.get(0));

    }
    public static void permutation(int a[], int count, int count2, int except) {
        if (count2 == except) {

            jisuan(b);

        } else {
            if (count2 == 0) {
                b = new int[except];
            }

            for (int i = count; i < a.length; i++) {
                b[count2] = a[i];
                permutation(a, i + 1, count2 + 1, except);
            }
        }
    }
    public static void jisuan(int [] num){
        int sum=0;
        int start = Math.abs(num[0]);
        int end = Math.abs(num[num.length-1]);
        if(num[0] >0 && num[num.length-1] > 0){
            sum = end;
        }else if(num[0] <0 && num[num.length-1] < 0){
            sum = start;
        }else{
            if (start>end){
                sum=end*2+start;
            }else{
                sum=start*2 +end;
            }
        }

        list.add(sum);
    }
}