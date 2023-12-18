import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        char[] s=sc.next().toCharArray();
        char[] t=sc.next().toCharArray();
        TreeSet<String> ts=new TreeSet<>();
        int sizeS=s.length;
        int sizeT=t.length;
        for (int i = 0; i <= sizeS-sizeT; i++) {
            int count=0,temp=0,check=0;
            for (int j = i; j < sizeT+i; j++) {
                if(s[j]=='?'||s[j]==t[j-i]){
                    count++;
                    if(s[j]==t[j-i])check++;
                    temp=i;
                }
            }
            if(count==sizeT&&check>0){
                String ans="";
    //            out.println("temp="+temp);
                for (int j = 0; j < sizeS; j++) {
  //                  out.println("j="+j);
//                    out.println("ans="+ans);
                    if(j<temp){
                        if(s[j]=='?')ans+='a';
                        else ans+=s[j];
                    }else{
                        ans+=t[j-temp];
                    }
                }
                ts.add(ans);
            }
        }
        out.println(ts.size()==0?"UNRESTORABLE":ts.pollFirst());
    }
}