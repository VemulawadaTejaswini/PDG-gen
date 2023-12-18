import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String ans = "No";
        for (int i = 0; i < s.length()-1; i++){
            if (s.substring(i,i+2).equals("AC")){
                ans = "Yes";
            }
        }
        System.out.println(ans);
    }
}