
import java.util.Arrays;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    
    private static int N;
    private static int M;
    private static boolean[] isAC;
    
    private static NavigableMap<Integer, Integer> submitTimes = new TreeMap<>();
    
    private static final String AC = "AC";
    private static final String WA = "WA";
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        
        isAC = new boolean[N+1];
        Arrays.fill(isAC, false);
        
        for (int i = 0; i < M; i++) {
            int p = sc.nextInt();
            String S = sc.next();
            
            if(submitTimes.containsKey(p)) {
                if(isAC[p]) {
                    continue;
                }else {
                    submitTimes.put(p, submitTimes.get(p) + 1);
                }

            }else {
                submitTimes.put(p, 1);
            }
            
            if(S.equals(AC)) {
                isAC[p] = true;
            }
        }
        
        int sumAC = 0;
        int sumPenalty = 0;
        
        for(int i=1;i<N+1;i++) {
            if(!isAC[i]) {
                continue;
            }
            
            sumAC++;
            sumPenalty += submitTimes.get(i) -1;
        }
        
        System.out.println(sumAC + " " + sumPenalty);
    }
}
