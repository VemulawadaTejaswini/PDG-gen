import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer S = new StringBuffer(sc.next());
        int Q = sc.nextInt();
        for(int i=0;i<Q;i++){
            int t = sc.nextInt();
            if(t==1) S.reverse();
            else{
                int f = sc.nextInt();
                String c = sc.next();
                if(f==1) S.append(c);
                else S.insert(0,c);
                }
            }
        System.out.println(S);
    }
}