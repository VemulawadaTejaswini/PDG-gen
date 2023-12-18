import java.util.*;
//System.out.println("")

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String ss[]= s.split("");
        
        
        int cnt = 0;
        int gnt = 0;
        for(int i = 0; i<n; i+=2){
            if(ss[i].equals("0")){
                ss[i]="1";
                cnt++;
            }
        }
        for(int i = 1; i<n; i+=2){
            if(ss[i].equals("1")){
                ss[i]="0";
                cnt++;
            }
        }
        String rr[]=s.split("");
        
        for(int i = 1; i<n; i+=2){
            if(rr[i].equals("0")){
                rr[i]="1";
                gnt++;
            }
        }
        for(int i = 0; i<n; i+=2){
            if(rr[i].equals("1")){
                rr[i]="0";
                gnt++;
            }
        }
        cnt = Math.min(gnt,cnt);
        System.out.println(cnt);
    }
}