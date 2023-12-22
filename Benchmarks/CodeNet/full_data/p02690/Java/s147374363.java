import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        for (int i = -1000; i <= 1000; i++) {
            for (int h = -1000; h <= 1000; h++) {
                
                if (x == (Math.pow(i, 5) - Math.pow(h, 5)) ) {
                    System.out.println(i + " " + h);
                    return;
                }
            }
        }
        
    }
}