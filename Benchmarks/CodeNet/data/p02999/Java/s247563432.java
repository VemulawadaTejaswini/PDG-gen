import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = 2;
        int[]a = new int[b];
        for(int i = 0; i < b; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        //result(a)でa[]を送れる
        int re = result(a);
        System.out.println(re);
    }
 
    //判定
    private static int result(int a[]){
        int re = 0;
        if(a[0] < a[1]){
            re = 0;
        }else{
            re = 10;
        }
        return re;
    }
}