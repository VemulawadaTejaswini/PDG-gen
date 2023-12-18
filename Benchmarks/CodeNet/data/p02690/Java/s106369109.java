import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        for (int i = -65; i <= 65; i++) {
            for (int h = -65; h <= 65; h++) {
                
                if (x == (Math.pow(i, 5) - Math.pow(h, 5)) ) {
                    System.out.println(i + " " + h);
                    return;
                }
            }
        }
        
    }
}