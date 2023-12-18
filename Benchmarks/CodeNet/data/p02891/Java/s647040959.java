import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        char[] c = s.toCharArray();

        long ans = 0;

        int cnt = 1;
        for (int i=0; i<s.length()-1; i++){
            if (c[i]==c[i+1]){
                cnt++;
            }
        }

//        System.out.println(cnt);
        if (cnt==s.length()){
            System.out.println((s.length()*n)/2);
            return;
        }

        if (s.length()>=2){
            for (int i=0; i<s.length()-1; i++){
                if (c[i]==c[i+1]){
                    ans++;
                    i++;
                }
            }
        }else {
            if (n%2==0){
                System.out.println(n/2);
                return;
            }else {
                System.out.println(n/2);
                return;
            }
        }


        System.out.println(ans * n);
    }
}
