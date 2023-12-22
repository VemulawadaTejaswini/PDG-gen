import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String forward = input.nextLine();
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(forward);
        
        String reverse = sb.reverse().toString();
        
        System.out.printf("%s\n",reverse);
    }
    
}