import java.io.*;
import java.util.*;
 
class Lake {
    Lake(int area, int x){
        this.area = area;
        this.x = x;
    }
    public int area, x;
}
 
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        char g[] = br.readLine().toCharArray();
        int sum = 0;
        ArrayDeque<Integer> lx = new ArrayDeque<Integer>();
        ArrayDeque<Lake> lakes = new ArrayDeque<Lake>();
 
        for(int x = 0; x < g.length; x++) {
            if (g[x] == '\\') {
                lx.add(x);
            } else if (!lx.isEmpty() && g[x] == '/') {
                int a = x - lx.getLast();
                sum += a;
                while (!lakes.isEmpty() && lx.getLast() < lakes.getLast().x) {
                    a += lakes.getLast().area;
                    lakes.removeLast();
                }
                lakes.add(new Lake(a, lx.pollLast()));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sum).append('\n').append(lakes.size());
        for (Lake l : lakes) {
            sb.append(' ').append(l.area);
        }
        System.out.println(sb);
    }
}