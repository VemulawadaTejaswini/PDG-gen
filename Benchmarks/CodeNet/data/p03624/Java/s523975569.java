import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int l = s.length();
        ArrayList<Character> list = new ArrayList<Character>(); 

        for(int i=0; i<l; i++){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        char a = 'a';
        for(int i=0; i<l; i++){
            if(list.get(i)==a){
                a = (char)(a + 1);
            }
            else{
                System.out.println(a);
                break;
            }
            if(i==l-1){
                System.out.println("None");
            }
        }
    }
}