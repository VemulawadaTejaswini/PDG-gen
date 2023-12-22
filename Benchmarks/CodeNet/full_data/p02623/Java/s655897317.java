import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        int cnt =0,min=0;
        for(int i=0;i<N;i++)A.add(sc.nextInt());
        for(int i=0;i<M;i++)B.add(sc.nextInt());
        while(min<=K){
            if(A.size()!=0&&B.size()!=0){
                if(A.get(0)<B.get(0)){
                    if(A.get(0)+min>K) break;
                    min+=A.remove(0);
                }
                else {
                    if(B.get(0)+min>K) break;
                    min+=B.remove(0);
                }
            }
            else if(A.size()!=0) {
                if(A.get(0)+min>K) break;
                min+=A.remove(0);
            }
            else if(B.size()!=0) {
                if(B.get(0)+min>K) break;
                min+=B.remove(0);
            }
            else break;
            cnt++;
        }
        System.out.println(cnt);
    }
}