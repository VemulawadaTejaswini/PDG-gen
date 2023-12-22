import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=10000; i++){
            int[] xy = {sc.nextInt(), sc.nextInt()};
            if(xy[0]==0 && xy[1]==0) break;
            Arrays.sort(xy);
            System.out.println(xy[0] + " " + xy[1]);
            
        }
    }
}

