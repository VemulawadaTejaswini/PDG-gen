import java.util.Scanner;
public class Main{
    public static boolean prime(int x){
        if(x == 1)
            return false;
        else if(x == 2)
            return true;
        else if(x % 2 == 0)
            return false;
        else{
            for(int i = 3 ; i <= Math.sqrt(x) ; i += 2)
            {
                if(x % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            int x = sc.nextInt();
            if(prime(x))
                count++;
        }
        System.out.println(count);
    }
}
