
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        for(int i=1;i<=s.length();i++){
            if(i%2!=0){
                if(s.charAt(i-1)=='R'||s.charAt(i-1)=='U'||s.charAt(i-1)=='D'){

                }else{
                    System.out.println("No");
                    return;
                }
            }else{                
                if(s.charAt(i-1)=='L'||s.charAt(i-1)=='U'||s.charAt(i-1)=='D'){

                }else{
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}