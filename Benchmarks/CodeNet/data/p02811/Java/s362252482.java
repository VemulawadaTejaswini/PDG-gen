import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String[] array = line1.split(" ");
        
        int k = Integer.parseInt(array[0]);
        int x = Integer.parseInt(array[1]);
        
        String result = "No";
        int sum = 500 * k;
        
        if(sum >= x)
        {
            result = "Yes";
        }
        
        System.out.println(result);
    }
}
