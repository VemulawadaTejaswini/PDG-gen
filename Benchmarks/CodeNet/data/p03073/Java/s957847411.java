import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int out1 = 0;
        int out2 = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(i % 2 == 0 && s.charAt(i) != '0'){
                out1++;
            }else if(i % 2 != 0 && s.charAt(i) != '1'){
                out1++;
                
            }
        }
        for(int i = 0; i < s.length() - 1; i++){
            if(i % 2 == 0 && s.charAt(i) != '1'){
                out2++;
            }else if(i % 2 != 0 && s.charAt(i) != '0'){
                out2++;
            }
        }
        System.out.println(Math.min(out1, out2));
        scan.close();
    }
}
