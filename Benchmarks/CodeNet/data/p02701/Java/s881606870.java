import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;

        String[] array = new String[n];
        
        String s = scan.nextLine();

        for (int i = 0; i < n; i++) {
            s = scan.nextLine();
            if (Arrays.asList(array).contains(s)) {
                
            }else{count++;}
            array[i] = s;
        }


   


        
        System.out.println(count);
 
        scan.close();
    }
}
