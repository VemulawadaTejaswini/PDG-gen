import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Pair[] pairs = new Pair[m];
        for(int i = 0;i < m;i++){
            Pair ps = new Pair();
            ps.from = sc.nextInt();
            ps.end = sc.nextInt();
            pairs[i] = ps;
        }
        Arrays.sort(pairs);
        int cnt = 0;
        int nowclear = 0;
        for(int i = 0;i < m;i++){
            int nowfrom = pairs[i].from;
            int nowend = pairs[i].end;
            if(nowclear < nowfrom){
                cnt++;
                nowclear = nowend - 1;
            }
        }
        System.out.println(cnt);
    }
}
class Pair implements Comparable{
    int from;
    int end;
    public int compareTo(Object other){
        Pair otherpair = (Pair) other;
        return end - otherpair.end;
    }
}
