import java.io.*;
import java.util.*;

class Program{

}
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1,N = in.nextInt();
        Set<Integer> S = new HashSet<Integer>();
        S.add(N);
        while(true){
            if(N%2==0){
                N/=2;
            }
            else{
                N = 3*N+1;
            }
            S.add(N);
            count++;
            if(S.size()<count) {
                System.out.println(count);
                break;
            }
        }
    }
}