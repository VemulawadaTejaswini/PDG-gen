import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(jud(a));
    }

    private static int jud(int a[]){
        int re = 0;
        int b = 0;
        //初期値0なのでいらない
        // if(a[0] < a[1]){
        // }
        if(a[0] <= a[1]){
            b = a[1] / a[0];
            re = b;
        }
        if(a[2] < b){
            re = a[2];
        }
        return re;
    }
}