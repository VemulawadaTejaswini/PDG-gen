import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String w = sc.next();
        int l = w.length();
        int a = 1;
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<l; i++){
            list.add(String.valueOf((char)w.charAt(i)));
        }

        Collections.sort(list);

        if(l==1){
            System.out.println("No");
        }

        for(int i=1; i<l; i++){
            if(list.get(i).equals(list.get(i-1))){
                a += 1;
            }
            else if(!list.get(i).equals(list.get(i-1))){
                if(a%2!=0){
                    System.out.println("No");
                    break;
                }
                a = 1;
            }

            if(i==l-1){
                System.out.println("Yes");
            }
        }
    }
}