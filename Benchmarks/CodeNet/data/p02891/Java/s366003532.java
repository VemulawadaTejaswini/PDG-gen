import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = s.toCharArray();

        long k = sc.nextLong();

        long ans = 0;

        int cnt = 1;
        for (int i=0; i<s.length()-1; i++){
            if (c[i]==c[i+1]) {
                cnt++;
            }
        }
//        System.out.println(cnt);
        if (cnt==s.length()){
            System.out.println(((long)s.length()*k)/2);
        }else {
            if (c[0]==c[s.length()-1]){
                String t = s+s;
//                System.out.println(t);
                char[] cc = t.toCharArray();
                long tmp = 0;
                for (int j=0; j<t.length()-1; j++){
                    if (cc[j]==cc[j+1]){
                        tmp++;
                        j++;
                    }
                }
                for (int j=0; j<s.length()-1; j++){
                    if (c[j]==c[j+1]){
                        ans++;
                        j++;
                    }
                }
//                System.out.println(tmp);
//                System.out.println(ans);
                if (tmp == ans*2){
                    System.out.println(ans*k);
                }else {
                    System.out.println(ans+(ans+1)*(k-1));
                }

            }else {
                for (int i=0; i<s.length()-1; i++){
                    if (c[i]==c[i+1]){
                        ans++;
                        i++;
                    }
                }
                System.out.println(ans*k);
            }
        }
    }
}