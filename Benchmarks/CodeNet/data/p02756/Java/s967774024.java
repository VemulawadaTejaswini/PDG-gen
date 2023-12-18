import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.next());
        int Q = sc.nextInt();
        for(int i=0;i<Q;i++){
            int t = sc.nextInt();
            if(t==1) S=S.reverse();
            else if(t==2){
                int f = sc.nextInt();
                String c = sc.next();
                if(f==1)S.insert(0,c);
                else S.append(c);
            }
        }
        System.out.println(S);
    }
}