import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s="CODEFESTIVAL2016";
        String in=scan.next();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(in.charAt(i)!=s.charAt(i))
                cnt++;
        }
        System.out.println(cnt);
    }
}
