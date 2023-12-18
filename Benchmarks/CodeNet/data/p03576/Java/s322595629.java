import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        long[][] rectangle = new long[N][2];
        
        for(int i = 0; i < N; i++) {
            rectangle[i][0] = scan.nextLong();
            rectangle[i][1] = scan.nextLong();
        }
        
        long minArea = Long.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                if(canCreateRectangle(i, j, N, K, rectangle)) {
                    long area = Math.abs(rectangle[i][0] - rectangle[j][0]) * Math.abs(rectangle[i][1] - rectangle[j][1]);
                    if(minArea > area) minArea = area;
                }
            }
        }
        System.out.println(minArea);
    }
    
    static boolean canCreateRectangle(int i, int j, int N, int K, long[][] rectangle) {
        int count = 2;
        for(int a = 0; a < N; a++) {
            if(a != i && a != j && 
            (rectangle[a][0] >= rectangle[i][0] || rectangle[a][0] >= rectangle[j][0]) && 
            (rectangle[a][0] <= rectangle[i][0] || rectangle[a][0] <= rectangle[j][0]) && 
            (rectangle[a][1] >= rectangle[i][1] || rectangle[a][1] >= rectangle[j][1]) && 
            (rectangle[a][1] <= rectangle[i][1] || rectangle[a][1] <= rectangle[j][1])) count++;
        }
        if(count >= K) return true;
        return false;
    }
}
