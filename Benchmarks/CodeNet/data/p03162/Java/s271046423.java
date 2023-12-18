import java.util.Scanner;

/**
 *
 * @author German le yo
 */
public class DynamicProgrammingContest {
    
    // State contins the last action and the curent max happyness
    static int[][] state;
    static int[][] days;
    
    static int[] getOther(int j){
        switch(j){
            case 0: return new int[]{1, 2};
            case 1: return new int[]{0, 2};
            case 2: return new int[]{0, 1};
        }
        
        return null;
    }
    
    static int getMax(int i, int j){
        // Calulated
        if(state[i][j] != 0) return state[i][j];
        // Base case
        if(i == 0) return days[0][j];
        
        // Get max of others
        int[] other = getOther(j);
        int maxOther = -1, maxTmp;
        for(int otherI: other){
            maxTmp = getMax(i - 1, otherI);
            if(maxTmp > maxOther) maxOther = maxTmp; 
        }
       
       return state[i][j] = maxOther + days[i][j];
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Input
        int N = scan.nextInt();
        state = new int[N][3];
        days = new int[N][3];
        for(int i = 0; i < N; i++){
            days[i] = new int[]{scan.nextInt(), scan.nextInt(), scan.nextInt()};
        }
        
        int max0 = getMax(N - 1, 0);
        int max1 = getMax(N - 1, 1);
        int max2 = getMax(N - 1, 2);

        System.out.println(Math.max(Math.max(max0, max1), max2));
    }
    
}