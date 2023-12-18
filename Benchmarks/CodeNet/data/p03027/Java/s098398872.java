import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int Q=in.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<Q;i++){
            int x=in.nextInt();
            int d=in.nextInt();
            int N=in.nextInt();

            long result=1;
            for(int j=0;j<N;j++){
                result=(result*x)%1000003;
                x=x+d;
            }
            sb.append(result);
            sb.append("\n");

        }
        System.out.println(sb);

    }
}
