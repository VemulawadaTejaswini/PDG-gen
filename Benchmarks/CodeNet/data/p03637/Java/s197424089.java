import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;
        int b = 0;
        for(int i = 0;i < N;i++){
            long ai = sc.nextLong();
            if(ai%4 == 0)   a++;
            else if(ai%2 == 1)  b++;
        }
        if(a >= b)  System.out.println("Yes");
        else    System.out.println("No");
    }
}