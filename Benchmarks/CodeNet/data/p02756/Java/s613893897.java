import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int Q = sc.nextInt();

        boolean isReversed = false;
        String headString = "";
        String tailString = "";
        StringBuffer sb = new StringBuffer(S);
        for(int i=0;i<Q;i++){
            int t = sc.nextInt();
            if(t == 1){
                isReversed = !isReversed;

            } else {
                int f = sc.nextInt();
                StringBuffer C = new StringBuffer(sc.next());

                if(f == 1){
                    if(isReversed){
                        sb.append(C);
                    } else {
                        C.append(sb);
                        sb = C;
                    }
                } else {
                    if(isReversed){
                        C.append(sb);
                        sb = C;

                    } else {
                        sb.append(C);
                    }
                }
            }

        }
        if(isReversed ){
            System.out.println(sb.reverse());
        } else {
            System.out.println(sb);
        }

    }

}







