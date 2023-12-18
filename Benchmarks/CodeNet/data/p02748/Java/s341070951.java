import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int[] ap = new int[a];
        int[] bp = new int[b];
        int min_a = 10000000;
        int min_b = 10000000;
        for(int i=0;i<a;i++){
            int tmp = sc.nextInt();
            ap[i] = tmp;
            min_a = Math.min(min_a, tmp);
        }
        for(int i=0;i<b;i++){
            int tmp = sc.nextInt();
            bp[i] = tmp;
            min_b = Math.min(min_b, tmp);
        }

        int res = min_a+min_b;
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();
            int sum = ap[x-1] + bp[y-1] - c;
            res = Math.min(sum, res);
        }

        System.out.println(res);
    }
}
