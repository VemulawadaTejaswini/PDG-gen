import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main{
    static Scanner s = new Scanner(new BufferedInputStream(System.in));
    public static void solution1(){
        int k = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();

        for(int i = a ; i <= b ; i++ ){
            if(i%k == 0){
                System.out.println("OK");
                return;
            }
        }
        System.out.println("NG");
    }

    public static void solution2(){
        long  n = s.nextLong();
        long balance = 100;
        int years=0;
        for( ; balance < n ; ){
            balance = (int) (balance + balance * 0.01f);
            years++;
        }
        System.out.println(years);
    }

    public static void solution3(){

    }
    public static void main(String[] args) {
        solution2();
    }
}