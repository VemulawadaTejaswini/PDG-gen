import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int l = s.length();
        int g = 0;
        int p = 0;

        for(int i=0; i<l; i++){
            if(s.charAt(i)=='g'){
                g++;
            }
            else{
                p++;
            }
        }
        System.out.println((g - p) / 2);
    }
}