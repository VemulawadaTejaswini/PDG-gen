import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        String[] array = data.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int c = Integer.parseInt(array[2]);
        int d = Integer.parseInt(array[3]);
        
        String result = "No";
        
        while(a >= 0)
        {
            c -= b;
            if(c <= 0)
            {
                result = "Yes";
                break;
            }
            a -= d;
        }
        
        
        System.out.println(result);
    }
}
