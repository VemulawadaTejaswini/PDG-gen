import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < N; i++){
            char c = S.charAt(i);
            if(c == '.'){
                cnt1++;
            }else{
                cnt2++;
            }
        }
        System.out.println(cnt1 < cnt2 ? cnt1 : cnt2);
    }
}
