import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int ans = 0;
        int numOfPen = 0;
        int x = 0, y = 0;
        // Xセット
        while(numOfPen < N){
            numOfPen += A;
            x += B;
        }
        numOfPen = 0;
        // Yセット
        while(numOfPen < N){
            numOfPen += C;
            y += D;
        }
        
        if(x < y){
            ans = x;
        }else{
            ans = y;
        }
        System.out.println(ans);
    }
}
