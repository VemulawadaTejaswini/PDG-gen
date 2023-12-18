import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        
        int cnt1 = 0;
        int cnt2 = 0;
        boolean flg = false;
        for(int i = 0; i < N; i++){
            char c = S.charAt(i);
            if(c == '.'){
                if(flg){
                    cnt1++;
                }
            }else{
                flg = true;
                cnt2++;
            }
        }
        
        if(cnt2 != N && S.charAt(N - 1) == '#'){
            int index = N - 1;
            int cnt = 0;
            while(true){
                if(S.charAt(index) == '#'){
                    cnt++;
                }else{
                    break;
                }
                index--;
            }
            cnt2 -= cnt;
        }
        System.out.println(cnt1 < cnt2 ? cnt1 : cnt2);
    }
}
