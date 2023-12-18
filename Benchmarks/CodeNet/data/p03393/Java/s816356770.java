import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        String ord ="abcdefghijklmnopqrstuvwxyz";
        String[] ords = ord.split("");
        String s = sc.next();
        String ans = "";
        int ins = -1;
        int ordnum = -1;
        for(int i = 0; i < ords.length; i++){
            if(!s.contains(ords[i])){
                ans = s + ords[i];
                System.out.println(ans);
                return;
            }        
        }
        for(int i = s.length()- 1; i >= 0; i--){
            int c = ord.indexOf(s.charAt(i));
            String sub = s.substring(0, i + 1);
            for(int j = c; j < ords.length; j++){
                if(!sub.contains(ords[j])){
                    ans = s.substring(0, i) + ords[j];
                    System.out.println(ans);
                    return;
                }
            }
        }
        System.out.println("-1");
        sc.close();
    }
}