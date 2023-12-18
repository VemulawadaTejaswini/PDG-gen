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
        
        int count_a = 0;
        int count_c = 0;
        while(a > 0)
        {
            a -= d;
            count_a++;
        }
        while(c > 0)
        {
            c -= b;
            count_c++;
        }
        
        if(count_a >= count_c)
        {
            result = "Yes";
        }
        
        System.out.println(result);
    }
}
