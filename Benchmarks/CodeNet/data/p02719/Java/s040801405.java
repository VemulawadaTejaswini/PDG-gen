import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        String[] array = data.split(" ");
        
        long n = Long.parseLong(array[0]);
        long k = Long.parseLong(array[1]);
        
        long min = n % k;
        long buf = 0;
        while(true)
        {
            buf = Math.abs(min - k);
            
            if(min < buf)
            {
                break;
            }
            else
            {
                min = buf;
            }
        }
        
        System.out.println(min);
    }
}
