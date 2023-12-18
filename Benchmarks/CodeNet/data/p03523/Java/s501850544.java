import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        sc.close();
    
        int cntA = 0;
        char[] c = new char[5];
        c[0] = 'K';
        c[1] = 'I';
        c[2] = 'H';
        c[3] = 'B';
        c[4] = 'R';
        int idx = 0;
        for(int i = 0; i < S.length(); i++){
            if(cntA < 4 && S.charAt(i) == 'A')
                cntA++;
            else if(idx < 5 && S.charAt(i) == c[idx]){
                idx++;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}