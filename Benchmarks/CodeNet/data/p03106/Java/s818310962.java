import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int bigger = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(A < B){
            bigger = B;
        }else{
            bigger = A;
        }
        for(int i = 1;i <= bigger;i++){
            if(A % i == 0 && B % i == 0){
                list.add(i);
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list.get(K-1));
    }
}
