import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int cnt = 0;
        int max = ;
        for(int i = 0; i < S; i++){
            char c = S.charAt(i);
            if(c == 'I'){
                cnt++;
                max = Math.max(max,cnt);
            }else{
                cnt--;
            }
        }
        System.out.println(cnt);
    }
}