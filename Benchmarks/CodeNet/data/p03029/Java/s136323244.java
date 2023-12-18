import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int p = sc.nextInt();
        int ahash = a * 3;
        p = p + ahash;

        int num = p / 2;
        System.out.println(num);
    }
}