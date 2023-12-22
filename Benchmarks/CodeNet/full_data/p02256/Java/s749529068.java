import java.util.Scanner;

public class Main{

    static int func(int x, int y){
        if(x > y) {
            if(x % y == 0) return y;
            return func(y, x%y);
        }
        else{
            if(y % x == 0) return x;
            return func(x, y%x);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int x = sc.nextInt();
        int y = sc.nextInt();

        int answer = func(x, y);

        System.out.println(answer);
        sc.close();
    }
}
