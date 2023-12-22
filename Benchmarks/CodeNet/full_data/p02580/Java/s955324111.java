import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        
        int[] rows = new int[h];
        int[] cols = new int[w];
        
        Set<String> mines = new HashSet<>();
        
        for(int i = 0; i<m ; i++) {
          int x = sc.nextInt();
          int y = sc.nextInt();
          
          x--;
          y--;
          mines.add(Arrays.toString(new int[] {x,y}));
          rows[x]++;
          cols[y]++;
        }
        
        int out = 0;
        for(int i = 0; i<h; i++) {
          for(int j = 0; j<w; j++) {
            int possible = rows[i]+cols[j];
            if(mines.contains(Arrays.toString(new int[] {i,j})))
              possible--;
            out = Math.max(out, possible);
          }
        }
        
        System.out.println(out);
    }
}