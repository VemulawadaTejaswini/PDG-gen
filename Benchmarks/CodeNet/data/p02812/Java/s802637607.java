import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        int c = 0;

        for(int i = 0; i < s.length()-2; i++){
            String ss = s.substring(i, i+3); 
            if (ss.equals("ABC")) c++;
        }

        System.out.println(c);
    }
}