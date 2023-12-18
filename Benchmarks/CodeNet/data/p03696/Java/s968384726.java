import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        String s1 = sc.next();
        String s2 = s1;
        s1 += "A";
        char[] c1 = new char[101];
        c1 = s1.toCharArray();
        
        int r = 0;
        int l = 0;
        
        for(int sa = 0; sa<s1.length();sa++){
            if(c1[sa]==')'&&c1[sa+1]==')') r++;
            if(c1[sa]=='('&&c1[sa+1]=='(') l++;
        }
        String R ="";
        String L ="";
           for(int sa = 0; sa<r-l;sa++)  R += "(";
           for(int sa = 0; sa<l-r;sa++)  L += ")";
        
        if(s1 != null && s1.length() > 0){
 s1.substring(0, s1.length()-1);
}
        

        System.out.print(R+s2+L);
        
        

        System.out.println();
    }

}