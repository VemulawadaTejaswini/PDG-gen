import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if(s.length() >= 1 && s.length() <= 10){
            String t = scan.next();

            char[] x = new char[s.length()];
            for(int i = 0 ; i < s.length() ; i++){
                x[i] = s.charAt(i);
            }
            char[] y = new char[t.length()];
            for(int i = 0 ; i < t.length() ; i++){
                y[i] = t.charAt(i);
            }

            String out = "Yes";

            if((s.length() + 1) == t.length()){
                for(int i = 0 ; i < s.length() ; i++){
                    if(x[i] != y[i]){
                        out = "No";
                        break;
                    }
                }
                System.out.println(out);
            }
        }
    }
}
