import com.sun.deploy.util.ArrayUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(sc.nextInt(), sc.nextInt(),sc.nextInt()));
        if (arr.contains(5)){
            arr.remove(arr.indexOf(5));
            if (arr.contains(5)){
                arr.remove(arr.indexOf(5));
                if (arr.contains(7)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
    }
}