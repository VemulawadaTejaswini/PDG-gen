import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer S = new StringBuffer(sc.next());
        int Q = sc.nextInt();
        int check = 0;
        for(int i=0;i<Q;i++){
            int t = sc.nextInt();
            if(t==1) check++;
            else{
                int f = sc.nextInt();
                String c = sc.next();
                if((check==1&&f==1)||(check==0&&f==2)) S.append(c.charAt(0));
                else S.insert(0,c.charAt(0));
                }
            check%=2;
            }
        String opt = new String(S);
        String opt2 = new String(S.reverse());
        if(check==0) System.out.println(opt);
        else System.out.println(opt2);
    }
}