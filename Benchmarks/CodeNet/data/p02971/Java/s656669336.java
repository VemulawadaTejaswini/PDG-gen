import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 空白入力
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // 空白入力
        int[] a = new int[200010];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        int ma = 0;
        int print = 0;
        for(int i=1;i<n;i++){
            if(a[ma] < a[i]){
                print = ma;
                ma = i;
            }
        }
        for(int i=0;i<n;i++){
            if(ma == i){
                for(int j=0;j<n;j++){
                    if(ma != j){
                        if(a[print] < a[j]){
                            print = j;
                        }
                    }
                }
                System.out.println(a[print]);
            }else{
                System.out.println(a[ma]);
            }
        }
    }
}
