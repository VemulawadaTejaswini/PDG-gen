import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        String T = sc.next();
        int l = T.length();
        if(S.equals(T.substring(0, l-1))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}