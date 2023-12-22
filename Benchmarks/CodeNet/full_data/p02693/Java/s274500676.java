import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 目標値K
        int K = sc.nextInt();
        // 範囲A,B
        int A = sc.nextInt();       
        int B = sc.nextInt();

        int WariFlag=0;

        if( K>B){
        }else{
            for(int i=A;i<=B&&WariFlag==0;i++){
                if(i%K==0){
                   WariFlag=1;
                }
            }
        }
        if(WariFlag==0){
            System.out.println("NG");
        }else{
            System.out.println("OK");
        }

        }
}
