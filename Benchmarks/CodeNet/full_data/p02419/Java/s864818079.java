import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String w=sc.next();
        int cnt=0;
        char c;
        String str;
        String[] str2;
        int i;
        while(true){
            str=sc.next();
            if(str.equals("END_OF_TEXT"))break;
            c=getSymbolInString(str);
            str2=null;
            if(c!='a'){
                str2=str.split(Pattern.quote(String.valueOf(c)),0);
            }else{
                str2=new String[1];
                str2[0]=str;
            }
            for(i=0;i<str2.length;i++){
                if(str2[i].toLowerCase().equals(w))cnt++;
            }
        }
        System.out.println(cnt);
    }
    
    static char getSymbolInString(String s){
        char c;
        int i;
        for(i=0;i<s.length();i++){
            c=s.toLowerCase().charAt(i);
            if(c<'a'||c>'z')return c;
        }
        return 'a';
    }
}
