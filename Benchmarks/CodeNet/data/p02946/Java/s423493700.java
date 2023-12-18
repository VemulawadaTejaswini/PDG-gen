import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int x = sc.nextInt();

        
        for(int i = k-1; i >= 0; i--)
            System.out.println(x-i);
        for(int i = 1; i < k; i++)
            System.out.println(x+i);
        sc.close();

    }
}