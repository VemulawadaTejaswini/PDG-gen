import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        for (int i = -70; i <= 70; i++) {
            for (int h = -70; h <= 70; h++) {
                
                if (x == (Math.pow(i, 5) - Math.pow(h, 5)) ) {
                    System.out.println(i + " " + h);
                    return;
                }
            }
        }
        
    }
}