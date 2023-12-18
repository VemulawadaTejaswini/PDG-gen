import java.util.*;
 
class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int k = stdIn.nextInt();
        int x = stdIn.nextInt();
        String c = ""; 
        for(int i = x - k + 1; i <= x + k - 1 ; i++){
            System.out.print(c + i);
            c = " ";
        }
        System.out.println();
   }
}