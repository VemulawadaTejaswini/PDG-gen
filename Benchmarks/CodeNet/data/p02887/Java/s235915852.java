import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        String S = sc.next();
        char[] sca = S.toCharArray();
        int cnt=1;
        if(sca.length == 1){
            System.out.println(1);
            return;
        }
        for(int i=1;i<N;i++){
            if(sca[i] != sca[i-1]){
                cnt++;
            }
        }
        System.out.println(cnt);
        return;
    }
}

