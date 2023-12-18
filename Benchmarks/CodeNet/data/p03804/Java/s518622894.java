import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
String[] nline=new String[n];
String[] mline=new String[m];
    for (int i = 0; i < n; i++) {
        nline[i]=sc.next();
    }
    for (int i = 0; i < m; i++) {
        mline[i]=sc.next();
    }
    int c=0;
    for (int i = 0; i <= n-m; i++) {
        c=0;
        for (int j = 0; j < m; j++) {
            if(nline[j+i].contains(mline[j])){
                c++;
            }
        }
        if(c==m)break;
    }
    if(c==m){
        out.println("Yes");
    }else{
        out.println("No");
    }
}}