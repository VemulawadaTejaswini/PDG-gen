import java.util.*;
import java.math.*;

class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();    
        String s = in.next();
        
        Vector <Integer> vc = new Vector<Integer>();
        Vector <Integer> vpos = new Vector<Integer>();
        
        int ans = 0, ans2 = 0, ans3 = 0, ans4 = 0, ans5 = 0;
        int ch1 = 0;
        int ch2 = 0;
        s+='@';
        if (n != 1){
            for (int i = n - 1; i > -1; --i)
                if (s.charAt(i) == '#')  ++ch1; 
                    else  ++ch2;
                    
            int tmp = 0;
            
            for (int i = n - 1; i > -1; --i)
                if (s.charAt(i) == '.') ++tmp; 
                    else{
                        if (tmp != 0) vpos.add(i);
                        vc.add(tmp);
                        tmp  = 0;
                    }
                
            for (int i = n - 1; i > -1; --i){
                if (s.charAt(i) == '#') ++ans3;
                    else break;
            }
            if (s.charAt(0) == '#' && s.charAt(1) == '.'){
            int key = 0;
            for (int i = 0; i < n; ++i){
                if (s.charAt(i) == '#') ++ans4;
                    else{
                        ++key;
                        break;
                    }
            }
            for (int i = key + 1; i < n; ++i){
                if (s.charAt(i) == '.') ++ans5;
                    else break;
            }
            }
            ans2 = 0;    
            for (Integer x : vc)
                ans2+=x;
            }
        System.out.print(Math.min(Math.min(ans2, ch1 - ans3),ans2 - ans5));
    }
}
