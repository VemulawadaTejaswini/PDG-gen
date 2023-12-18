import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int[] a=new int[5];
        int temp=10000000000;
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
            temp=a[i]<temp?a[i]:temp;
        }
        // 出力
        System.out.println(n/temp+4);
    }
}
