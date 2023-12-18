import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length();
        t = t.concat(t);
        String check = "No";
        for(int i=0; i<n; i++){
            if(s.equals(t.substring(i,i+n))){
                check = "Yes";
            }
        }
        System.out.println(check);
    }
}