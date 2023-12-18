import java.util.*;
public class Main {
    public static void main(String[] args){
        Main start=new Main();
        start.start();

    }
    public Main(){
    }
    public void start(){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int result=0;
        for(int i=0;i<=N/R;i++){
            for(int j=0;j<=(N-i*R)/G;j++){
                if((N-i*R-j*G)%B==0){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
    int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}