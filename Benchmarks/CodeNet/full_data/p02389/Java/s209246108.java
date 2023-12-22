import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        //aとbの値を代入する
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //面積と周の値を求める
        int area = a * b;
        int periphery = (a + b) * 2;
        
        //面積と周の値を表示する
        System.out.println(area + " " + periphery);
    }
}

