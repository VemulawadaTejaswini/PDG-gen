import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        boolean b = false;
        int out = 1;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                b = true;
            }
            if(s.charAt(i) == 'Z'){
                b = false;
                if(out > max){
                    max = out;
                }
                out = 0;
            }
            if(b){
                out++;
            }
        }
        System.out.print(max);
    }
}