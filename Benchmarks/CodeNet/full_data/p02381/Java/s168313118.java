import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
     
    while(kbd.hasNext()){
        int n = kbd.nextInt();
        if(n!=0){
        int[] s = new int[n];
        double ave = 0;
        int i;
 
        for(i=0; i<n; i++){
            s[i] = kbd.nextInt();
            ave += s[i];
        }
        ave = ave/n;
 
        double a=0;
        for(i=0; i<n; i++){
            a += (s[i]-ave)*(s[i]-ave);
        }
        a = a/n;
        a = Math.sqrt(a);
 
        System.out.println(a);
        }
    }
    }
}