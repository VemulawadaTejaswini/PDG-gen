/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String ans = "";

        // SS or SW or WW or WS
        // ss
        ans += "SS";
        for (int j = 0; j <= 3; j++) {
            if (j == 0) {
                ans = "SS";
                boolean bool = true; 
                boolean boolmae = true;
                for (int i = 1; i <= n; i++) {
                    if (s.charAt(i%n) == 'o' ^ (bool ^ boolmae) ) {
                            ans += "S";
                            // ww & o, ss & o is s
                            boolmae = bool;
                            bool = true;
                    }else{
                            ans += "W";
                            //ws & o, sw & o is w
                            boolmae = bool;
                            bool = false;
                    }
                }
                if (ans.charAt(0) == ans.charAt(ans.length()-2)) {
                    ans = ans.substring(0, n);
                    break;
                }
            }else if (j == 1){
                ans = "SW";
                boolean bool = false; 
                boolean boolmae = true;
                for (int i = 1; i <= n; i++) {
                    if (s.charAt(i%n) == 'o' ^ (bool ^ boolmae) ) {
                            ans += "S";
                            // ww & o, ss & o is s
                            boolmae = bool;
                            bool = true;
                    }else{
                            ans += "W";
                            //ws & o, sw & o is w
                            boolmae = bool;
                            bool = false;
                    }
                }
                if (ans.charAt(0) == ans.charAt(ans.length()-2)) {
                    ans = ans.substring(0, n);
                    break;
                }
            }else if (j == 2){
                ans = "WS";
                boolean bool = true; 
                boolean boolmae = false;
                for (int i = 1; i <= n; i++) {
                    if (s.charAt(i % n) == 'o' ^ (bool ^ boolmae) ) {
                            ans += "S";
                            // ww & o, ss & o is s
                            boolmae = bool;
                            bool = true;
                    }else{
                            ans += "W";
                            //ws & o, sw & o is w
                            boolmae = bool;
                            bool = false;
                    }
                }
                if (ans.charAt(0) == ans.charAt(ans.length()-2)) {
                    ans = ans.substring(0, n);
                    break;
                }
            }else{
                ans = "WW";
                boolean bool = false; 
                boolean boolmae = false;
                for (int i = 1; i <= n; i++) {
                    if (s.charAt(i % n) == 'o' ^ (bool ^ boolmae) ) {
                            ans += "S";
                            // ww & o, ss & o is s
                            boolmae = bool;
                            bool = true;
                    }else{
                            ans += "W";
                            //ws & o, sw & o is w
                            boolmae = bool;
                            bool = false;
                    }
                }
                if (ans.charAt(0) == ans.charAt(ans.length()-2)) {
                    ans = ans.substring(0, n);
                    break;
                }else{
                    ans = "-1";
                }
            }
        }

        System.out.println(ans);


        sc.close();
    }

}



