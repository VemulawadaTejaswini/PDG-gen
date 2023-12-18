import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<long> list = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            long num = sc.nextInt();
            list.add(num);
        }
        long N = list.get(0);
        long A = list.get(1);
        long B = list.get(2);
        long C = 0;
          
        if(A == 0){
            System.out.println("0");
        }else if(N <= A){
            System.out.println(N);        
        }else if(N <= A + B){
            System.out.println(A);
        }else{
            while(N >= A+B){
                C++;
                N = N-(A+B);
            }
            System.out.println(C*A + N);
        }
    }
}
