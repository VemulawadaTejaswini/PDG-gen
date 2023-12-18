import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean[] rec = new boolean[26];
        for(int i=0;i<S.length();i++){
            int cur = S.charAt(i)-'a';
            if(rec[cur]){
                System.out.println("no");
                System.exit(0);
            }
            else rec[cur]=true;
        }
        System.out.println("yes");
    }
}
 