import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
    
        List<Integer> resultList = new ArrayList<>();
        resultList.addAll(Arrays.asList(A+B, A-B, A*B));
        
        int max = -100;
        for (int i=0; i<resultList.size(); i++) {
            max = Math.max(max, resultList.get(i));
        }
        System.out.println(max);
    
    }
}