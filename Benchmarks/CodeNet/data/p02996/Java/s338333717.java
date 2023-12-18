import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer,Long> A = new HashMap<>();
        Map<Integer,Long> B = new HashMap<>();
        ArrayList<Integer> List = new ArrayList<>();
        long sum=0;
        boolean opt =true;
        for(int i=0;i<N;i++){
            long A_num =sc.nextLong();
            long B_num =sc.nextLong();
            A.put(i, A_num);
            B.put(i,B_num);
        }
        B.entrySet().stream()
                .sorted(java.util.Map.Entry.comparingByKey());
        List = new ArrayList<>(B.keySet());
        for(int i : List){
            sum+=A.get(i);
            if(sum>B.get(i)){
                opt = false;
                break;
            }
        }
        if(opt==true) System.out.println("Yes");
        else System.out.println("No");
    }
}
