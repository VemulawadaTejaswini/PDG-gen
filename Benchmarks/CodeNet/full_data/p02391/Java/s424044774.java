import java.util.Scanner;

public class Main{
    public static void Compare(int x, int y){
        if(x > y){
            System.out.println("a > b");
        }else if(x < y){
            System.out.println("a < b");
        }else{
            System.out.println("a == b");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Compare(a, b);
    }
}
