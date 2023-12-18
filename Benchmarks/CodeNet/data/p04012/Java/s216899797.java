import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String s = input.next();
        
        char arr [] = s.toCharArray();
        
        Arrays.sort(arr);
        char x = arr[0]; int c = 0; boolean b = true ;
        for (int i = 0; i < arr.length ; i++) {
            if (x==arr[i]){
            c++;
            }
            else {
            
            if (c%2!=0){
               b = false;
                break;
            }
            x= arr[i];
            c=1;
            }
        }
        if (b==true){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}