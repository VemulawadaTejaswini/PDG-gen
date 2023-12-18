import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String tmp=str;
        int tmplength;
        while(true){
            tmplength=tmp.length();
            tmp=tmp.replaceAll("01", "");
            tmp=tmp.replaceAll("10","");
            if(tmplength==tmp.length()){
                break;
            }
        }
        System.out.println(str.length()-tmp.length());
        
    }
        
}