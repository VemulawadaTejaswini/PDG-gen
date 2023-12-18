import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String slist[] = S.split("");
        if(S.length()==2){
            System.out.println(S);
        }
        if(S.length()==3){
            String S1 = slist[2] + slist[1] + slist[0];
            System.out.println(S1);
        }
        
    }
}
