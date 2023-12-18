import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        String n;
        char station = ' ';
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.next();

        for(int i = 0; i < 2; i++){
            if(i == 0){
                station = n.charAt(i); 
            }else if(station == n.charAt(i)){
                result = 1;
                break;
            }
        }
        if(result == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}