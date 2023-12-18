import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        
        if(n == m)
            sum += n + m;
        else if(n > m)
            sum += n*2 -1;
        else
            sum += m*2 -1;
        
        System.out.println(sum);
    }
}
