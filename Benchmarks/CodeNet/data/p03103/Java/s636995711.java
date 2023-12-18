import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long opt = 0;
        ArrayList<Long> A = new ArrayList<>();
        Map<Long,Long> B = new HashMap<>();
        for(int a=0;a<N;a++){
            long A_num = sc.nextLong();
            long B_num = sc.nextLong();
            A.add(A_num);
            B.put(A_num,B_num);
        }
        Collections.sort(A);
        for(int a=0;a<A.size();a++){
            long m = B.get(A.get(a));
            if(M-m>0){
                M-=m;
                opt+=A.get(a)*m;
            }
            else{
                opt+=A.get(a)*M;
                break;
            }
        }
        System.out.println(opt);
    }
}
