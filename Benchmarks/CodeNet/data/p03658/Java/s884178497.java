
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            x.add(sc.nextInt());
        }
        Collections.sort(x);
        System.out.print((x.get(N-1)+x.get(N-2)+x.get(N-3)));;
    }
}