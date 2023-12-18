import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int  j=c.length, cnt=0;
        for(int i=0; i<j/2; i++){
            if(c[i] != c[j-1-i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}