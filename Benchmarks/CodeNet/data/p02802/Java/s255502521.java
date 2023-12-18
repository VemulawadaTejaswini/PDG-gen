import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] po=new boolean[N+1];
        int pena=0;
        for(int i=0; i<M; i++){
            int p=sc.nextInt();
            String s=sc.next();
            if(s.equals("WA")){
                if(!po[p]){
                    pena++;
                }
                else{}
            }
            else if(s.equals("AC")){
                if(!po[p]){
                    po[p]=true;
                }
            }
        }
        int ans=0;
        for(int i=0; i<=N; i++){
            if(po[i]) {
                ans++;
            }
        }
        System.out.println(ans+" "+pena);
    }

}
