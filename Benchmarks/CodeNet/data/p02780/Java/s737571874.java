import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        List<Integer> numList = new ArrayList<>();
        for(int i=0;i<N;i++){
            numList.add(Integer.parseInt(sc.next()));
        }
        int max = 0;
        for(int i=0;i<N-K+1;i++){
            int sectionMax = numList.subList(i,i+K).stream().reduce(0,(s1,s2) -> s1 + s2);
            max = Math.max(max,sectionMax);
        }
        double result = (max + K)/2.0;
        System.out.println(String.format("%.12f",result));
}
}