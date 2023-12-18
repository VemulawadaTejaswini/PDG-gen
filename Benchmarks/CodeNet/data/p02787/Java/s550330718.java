import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        Map<Integer,Integer> AB = new HashMap<>();
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<N;i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            AB.put(A, B);
            List.add(A);
        }
        long min = List.get(0);
        for(int i= 1;i<List.size();i++){
            long r = GCD(Math.max(min,List.get(i)),Math.min(min,List.get(i)));
            if(r!=0)min = (min*List.get(i))/r;
        }
        long min_p=999999999,min_A=0;
        for(int i=0;i<N;i++){
            long num = min/ List.get(i);
            long p = num*AB.get(List.get(i));
            if(min_p>p){
                min_p=p;
                min_A=List.get(i);
            }
        }
        long num = H/min_A;
        long sum = num*AB.get((int)min_A);
        if(H%min_A==0) System.out.println(num*AB.get((int)min_A));
        else{
            H-= num*min_A;
            min_p = 999999999;
            for(int i=0;i<N;i++){
                if(H-List.get(i)<0) if(min_p<AB.get(List.get(i))) min_p=AB.get(List.get(i));
                else{
                    if(H%List.get(i)!=0)num = H/List.get(i)+1;
                    else num = H/List.get(i);
                    if(min_p<AB.get(List.get(i)*num)) min_p=AB.get(List.get(i))*num;
                }
            }
            sum+=min_p;
            System.out.println(sum);
        }
    }
    public static long GCD(long a,long b){
        long r=b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}