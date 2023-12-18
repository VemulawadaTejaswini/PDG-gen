import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] sl = sc.next().toCharArray();
        List<Integer> rl = new ArrayList<>();
        List<Integer> gl = new ArrayList<>();
        List<Integer> bl = new ArrayList<>();
        int bcnt = 0;
        long ans = 0;
        int i = 0;
        for(char c :sl){
            if(c == 'R'){
                rl.add(i);
            }else if(sl[i] == 'G'){
                gl.add(i);
            }else{
                bl.add(i);
                bcnt++;
            }
            i++;
        }
        for(int r : rl){
            for(int g : gl){
                int big = Math.max(r,g);
                int small = Math.min(r,g);
                int dif = big-small;
                int tmp = bcnt;
                if(bl.contains(big + dif)) tmp--;
                if(bl.contains(small - dif)) tmp--;
                if((big + small) % 2 == 0 && bl.contains((big + small) / 2)) tmp--;
                if(tmp > 0) ans += tmp;
            }
        }
        System.out.println(ans);
    }
}