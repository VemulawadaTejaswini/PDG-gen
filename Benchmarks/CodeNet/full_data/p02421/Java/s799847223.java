import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
    while(kbd.hasNext()){
        int n = kbd.nextInt();
        if(n!=0) solve(n);
    }
    }
 
    static void solve(int n){
    int taro = 0;
    int hana = 0;
    String t, h;
 
    while(n>0){
        t = kbd.next();
        h = kbd.next();
        int j = t.compareToIgnoreCase(h);
        if(j < 0){
        hana += 3;
        }
        else if(j > 0){
        taro += 3;
        }
        else{
        hana += 1;
        taro += 1;
        }
        n--;
    }
 
    System.out.println(taro+" "+hana);
    }
}