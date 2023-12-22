import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char[]  alpha = new char[400];
        String line;
        int left = 0,right;

        while(true){
            line = sc.nextLine();
            if(line == "-") break;
           for(int i = 0; i < line.length(); i++){
               alpha[i] = line.charAt(i);
           }

           int m = sc.nextInt();
           right = line.length()-1;
           
           for(int j = 0; j < m; j++){
            int h = sc.nextInt();
            for(int k = 0; k < h; k++){
                alpha[right + 1 +k] = alpha[left + k];
            }
            left += h;
            right += h;
           }

           for(int loop = left; loop <= right; loop++){
               System.out.print(alpha[loop]);
           }
           System.out.println();

        }
         
    }
}
