import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();   // 赤のカード
        int B = in.nextInt();   // 緑のカード
        int C = in.nextInt();   // 青のカード
        int K = in.nextInt();   // 操作回数
        int count = 0;
        
        while( B <= A ){
            B*=2;
            count+=1;
        }

        while( C <= B ){
            C*=2;
            count+=1;
        }

        if( count > K ){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}