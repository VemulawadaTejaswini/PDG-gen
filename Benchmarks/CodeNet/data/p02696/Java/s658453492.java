import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        
        String[] array = line1.split(" ");
        
        long a = Long.parseLong(array[0]);
        long b = Long.parseLong(array[1]);
        long n = Long.parseLong(array[2]);
        
        double max = 0;
        double result = 0;
        for(int x = 0; x <= n; x++)
        {
            result = Math.floor((a * x) / b) - a * Math.floor(x / b);
            if(result > max)
            {
                max = result;
            }
        }
        
        System.out.println((int)max);
    }
}
