import java.util.Scanner;

public class Main {

    private static int x;   //前者の和
    private static int y;   //後者の和
    private static int N;
    private static int a[];
    private static int ans = 1000000000;

    public static void sum(int index){
        for(int i=0;i<index;i++){
            x += a[i];
        }

        for(int i=index;i<N;i++){
            y += a[i];
        }
    }

    public static void input(){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        a = new int[N];

        for(int i=0;i<N;i++) {
            a[i] = scan.nextInt();
        }
    }

    public static void main(String args[]){
        input();

        for(int index=1;index<N;index++){
            sum(index);
            if(Math.abs(x-y) < ans){
                ans = Math.abs(x-y);
            }
            x = 0;//初期化
            y = 0;//初期化
        }

        System.out.println(ans);
    }
}
