import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int x = sc.nextInt();
        //int X = x/50;
        int count = 0;
        for (int a = 0;a <= A;a++ ){
            for (int b = 0;b <= B;b++ ){
                for (int c = 0;c <= C;c++ ){
                    if(x == (a*500 + b*100 + c *50)){
                        count +=1;
                    }
                }
            }
        }

        System.out.println(count);
    }
}