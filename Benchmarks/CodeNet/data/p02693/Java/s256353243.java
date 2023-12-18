import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        
        int k = Integer.parseInt(line1);
        
        String[] array = line2.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        
        String result = "NG";
        for(int i = a; i <= b; i++)
        {
            if(i % k == 0)
            {
                result = "OK";
                break;
            }
        }
        
        System.out.println(result);
    }
}
