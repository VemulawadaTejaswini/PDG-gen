import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        var y = new int[h+1];
        var x = new int[w+1];
        int maxY = 0;
        int maxX = 0;
        var set = new HashSet<Long>();
        for(int i = 0; i < m; i++){
            int hi = Integer.parseInt(sc.next());
            int wi = Integer.parseInt(sc.next());
            y[hi]++;
            x[wi]++;
            maxY = Math.max(y[hi], maxY);
            maxX = Math.max(x[wi], maxX);
            set.add(hi * 10000000L + wi);
        }
        
        var listY = new ArrayList<Integer>();
        for(int i = 1; i <= h; i++){
            if(y[i] == maxY) listY.add(i);
        }
        var listX = new ArrayList<Integer>();
        for(int i = 1; i <= w; i++){
            if(x[i] == maxX) listX.add(i);
        }
        
        int a = listY.size();
        int b = listX.size();
        boolean c = false;
        for(int i = 0; i < a; i++){
            int hi = listY.get(i);
            for(int j = 0; j < b; j++){
                int wj = listX.get(j);
                if(!set.contains(hi * 10000000L + wj)){
                    c = true;
                    break;
                }
            }
        }
        if(c){
            System.out.println(maxY + maxX);
        }else{
            System.out.println(maxY + maxX -1);
        }
    }
}