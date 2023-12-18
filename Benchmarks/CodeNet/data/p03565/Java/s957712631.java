import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        boolean ok = false;
        String str = "";
        for(int i = 0;i < s.length();i++){
            boolean can = true;
            for(int j = 0;j < t.length();j++){
                if(i + j >= s.length()){
                    can = false;
                    break;
                }
                if(s.charAt(i+j) != '?' && s.charAt(i+j) != t.charAt(j)){
                    can = false;
                    break;
                }
            }
            if(can){
                str = s.replace(s.substring(i),t);
                ok = true;
                break;
            }
        }
        str = str.replaceAll("\\?","a");
        if(ok){
            System.out.println(str);
        }
        else{
            System.out.println("UNRESTORABLE");
        }
    }
}
