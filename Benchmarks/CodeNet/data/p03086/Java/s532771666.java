import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        for(char i='A';i<='Z';i++){
            if(i=='A'||i=='T'||i=='G'||i=='C'){
                continue;
            }
            s=s.replaceAll(Character.toString(i), "-");
        }
        String[] x=s.split("-");
        int ans=0;
        for(int i=0;i<x.length;i++){
            ans=max(ans,x[i].length());
        }
        out.println(ans);
    }
}