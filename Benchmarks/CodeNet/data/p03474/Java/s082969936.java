import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                String s = sc.next();
                HashMap<Character,Integer> m = new HashMap<Character,Integer>();
                boolean afterHihun = false;

                m.put('h',0);
                m.put('a',0);
                m.put('b',0);

                for(int i = 0; i < a + b + 1; i ++){
                        if(s.charAt(i) == '-'){
                                m.put('h',m.get('h')+1);
                                afterHihun = true;
                        }else if(!afterHihun){
                                m.put('a',m.get('a')+1);
                        }else{
                                m.put('b',m.get('b')+1);
                        }
                }
                if(m.get('h') == 1
                && m.get('a') == a
                && m.get('b') == b){
                        System.out.println("Yes");
                }else{
                        System.out.println("No");
                }
        }
}
