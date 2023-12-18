import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int l = s.length();        
        boolean ans = true;
        
        for(int i=0; i<l; i++){  
            if(s.indexOf(s.charAt(i),i+1)!=t.indexOf(t.charAt(i),i+1)){
                ans = false;
                break;
            }
        }

        System.out.println(ans?"Yes":"No");
    }
}