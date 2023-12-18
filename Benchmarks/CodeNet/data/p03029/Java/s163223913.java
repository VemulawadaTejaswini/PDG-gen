import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        //りんご個数
        int p = sc.nextInt();
        //かけら

        p = p + (a * 3);

        int num = p / 3;
        System.out.println(num);
    }
}