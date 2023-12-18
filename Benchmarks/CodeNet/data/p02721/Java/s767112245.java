import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        char[] s = sc.next().toCharArray();
        ArrayList<Integer> li = new ArrayList<>();
        int i = 0;
        for(char ch: s){
            if(ch == 'o'){
                li.add(i);
            }
            i++;
        }
        if(!check(li,k,c,-1)){
            return;
        }else{
            for(int m : li){
                if(!check(li,k,c,m)){
                    System.out.println(m+1);
                }
            }
        }
    }

    public static boolean check(ArrayList<Integer> li, int k, int c, int m){
        if(li.size() == k && m >= 0) return false;
        int wk = 0;
        int next = -1;
        for(int d: li){
            if(d == m){
                continue;
            }else if(d > next){
                next = d + c;
                wk++;
                if(wk == k){
                    return true;
                }
            }
        }
        return false;
    }

}