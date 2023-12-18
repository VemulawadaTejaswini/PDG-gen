import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int ans = 0;

        for(int i = 0;(i * i) <= X;i++){
            ans = i;
        }

        int a = (ans * ans);
        System.out.println(a);

    }
}