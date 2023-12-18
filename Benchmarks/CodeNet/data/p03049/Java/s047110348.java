import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int bcnt_f = 0;
        int acnt_b = 0;
        for(int i = 0; i<n; i++){
            String s = sc.next();
            if(s.contains("AB")) cnt++;
            char a[] = s.toCharArray();
            if(a[0]=='B') {
                bcnt_f++;
            }
            if(a[s.length()-1] == 'A') {
                acnt_b++;
            }
        }
        int add3 = Math.min(acnt_b,bcnt_f);
        if(add3 == n){
            add3 = add3 - 1;
        }
        System.out.println(cnt + add3);
    }
}
