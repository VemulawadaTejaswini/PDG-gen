import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        String s = input.next();
        int pop = 0;
        int abr = 0;
        for (int i = 0; i < n; i++){
            String ans = "No";
            char c = s.charAt(i);
            if (c == 'a'){
                if (pop < a+b){
                    ans = "Yes";
                    pop += 1;
                }
            } else if (c == 'b'){
                if (pop < a+b && abr < b){
                    ans = "Yes";
                    pop += 1;
                    abr += 1;
                }
            }
            System.out.println(ans);
        }
    }
}