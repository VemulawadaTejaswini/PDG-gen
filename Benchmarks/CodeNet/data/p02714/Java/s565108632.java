import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder S = new StringBuilder();
        S.append("i");
        S.append(sc.next());
        int r =0,g=0,b=0;
        for(int i=1;i<=N;i++){
            if(S.charAt(i)=='R') r++;
            else if(S.charAt(i)=='G')g++;
            else if(S.charAt(i)=='B')b++;
        }
        long opt = r*g*b;
        for(int i=1;i<=N-1;i++){
            for(int j=i+1;j<=N;j++){
                int k = 2*j-i;
                if(k<=N)if(S.charAt(i)!=S.charAt(j)&&S.charAt(j)!=S.charAt(k)&&S.charAt(i)!=S.charAt(k))opt--;
            }
        }
        if(opt>=0)System.out.println(opt);
        else System.out.println(0);
    }
}