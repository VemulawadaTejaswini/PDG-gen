import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int flag = 1;
        if(s.charAt(0) != 'A'){
            flag = 0;
        }
        int countc = 0;
        for(int i = 2; i <= s.length()-2; i++){
            if(s.charAt(i) == 'C'){
                countc++;
            }
            if(s.charAt(i) != 'C' && s.charAt(i) <= 'Z'){
                flag = 0;
                break;
            }
        }
        if(countc != 1){
            flag = 0;
        }
        if(flag == 1){
            System.out.print("AC");
        } else {
            System.out.print("WA");
        }
    }
}