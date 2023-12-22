import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
        int max = min;
        for(int i = 0 ; i < n-1 ; i++){
            int x = sc.nextInt();
            if(x < min)
                min = x;
            else if(x > max)
                max = x;
        }
        int ans = max - min;
        if(ans % 2 == 0)
            System.out.println(ans/ 2);
        else
            System.out.println(ans / 2 + 1);
    }
}
