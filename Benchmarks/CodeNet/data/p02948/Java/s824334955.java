import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        int[][] ary = new int[n][2];
        for(int i = 0; i < n; i++){
            String line2 = sc.nextLine();
            String[] line3 = line2.split(" ");
            ary[i][0] = Integer.parseInt(line3[0]);
            ary[i][1] = Integer.parseInt(line3[1]);
        }
        Arrays.sort(ary, (b, a) -> Integer.compare(a[0], b[0]));
        Arrays.sort(ary, (b, a) -> Integer.compare(a[1], b[1]));
        int score = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(count + ary[i][0] <= m){
                score += ary[i][1];
                count++;
            }
            if(count == m)  break;
        }
        System.out.println(score);
    }
}