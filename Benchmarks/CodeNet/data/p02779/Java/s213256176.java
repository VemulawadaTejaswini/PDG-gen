import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Set<Long> set = new HashSet<Long>();
        long N=sc.nextLong();
        for(long i=0;i<N;i++){
            long temp=sc.nextLong();
            set.add(temp);
        }
        if(set.size()==N){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
