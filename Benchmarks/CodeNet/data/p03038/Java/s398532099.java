import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Long> bc = new ArrayList<>();

        for (int i=0; i<N; i++){
            bc.add(sc.nextLong());
        }
        int tmpB =0;
        long tmpC = 0; 
        for (int i=0; i < M; i++){
            tmpB = sc.nextInt();
            tmpC = sc.nextLong();
            for (int j=0; j<tmpB; j++){
                bc.add(tmpC);
            }
        }
        sc.close();
        
        Collections.sort(bc, Comparator.reverseOrder());

        long result=0;
        for (int i=0; i<N; i++){
            result += bc.get(i);
        }

        System .out.println(result);

    }
}