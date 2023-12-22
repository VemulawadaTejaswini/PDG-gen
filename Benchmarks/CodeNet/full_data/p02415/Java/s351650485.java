//10018???????????????
 
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public  static void main(String[] args){
    while(kbd.hasNext()){
        String s = kbd.nextLine();
        solve(s);
    }
    }
 
    static void solve(String s){
    String ans = "";
    int i;
    String x;
    for(i=0; i<s.length(); i++){
        x = s.substring(i,i+1);
        x = change(x);
        ans += x;
    }
    System.out.println(ans);
    }
 
    static String change(String x){
    String[] s = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
              "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", 
              "u", "v", "w", "x", "y", "z"};
    String[] b = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
              "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
              "U", "V", "W", "X", "Y", "Z"};
    int i=0;
    while(i<s.length && !x.equals(s[i])) i++;
    if(i<s.length) return b[i];
 
    i=0;
    while(i<b.length && !x.equals(b[i])) i++;
    if(i<b.length) return s[i];
 
    return x;
    }
}