import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long D = scanner.nextLong();
        long E = scanner.nextLong();

        List<Long> throughTime = new ArrayList<>();
        throughTime.add(N/A + (N%A==0 ? 0 : 1));
        throughTime.add(N/B + (N%B==0 ? 0 : 1));
        throughTime.add(N/C + (N%C==0 ? 0 : 1));
        throughTime.add(N/D + (N%D==0 ? 0 : 1));
        throughTime.add(N/E + (N%E==0 ? 0 : 1));
        Long maxTT = Collections.max(throughTime);

        System.out.println(maxTT + 4);
    }
}