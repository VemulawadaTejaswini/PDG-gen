import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();

        int count = 0;
        for(int i = 0; i < Q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            count = 0;
            
            //文字列の切り出し
            String Ssub = S.substring(l-1, r);
            for(int j = 0; j < Ssub.length()-1 ; j++){
                if(Ssub.substring(j, j+2).equals("AC")){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
