import java.util.*;

class Main
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a <= 5) {
            System.out.println(0);
            return;
        } else if (a >= 13) {
            System.out.println(b);
        } else {
            System.out.println(b / 2);
        }

        
    }
}