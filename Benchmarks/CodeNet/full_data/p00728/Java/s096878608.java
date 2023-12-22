import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            int temp;
            int sum = 0;
            temp = sc.nextInt();
            int min = temp,max = temp;
            sum += temp;
            for (int i = 0; i < n-1; i++){
                temp = sc.nextInt();
                if(temp<min) min = temp;
                if(temp>max) max = temp;
                sum += temp;
            }
            System.out.println((sum-(min+max))/(n-2));
        }
    }
}