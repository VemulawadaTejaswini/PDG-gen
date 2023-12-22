import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static class Point {
    	int point, x, y;
    	Point(int p) {
    		point =p ; 
    	}
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
                int n = sc.nextInt();
                Point[] pairs = IntStream.range(0, n).mapToObj(p -> new Point(p+1)).toArray(Point[]::new);
                
                IntStream.range(0, n).forEach(input -> {
                    int X = sc.nextInt();
                    int Y = sc.nextInt();
                    pairs[input].x = X;
                    pairs[input].y = Y;
                });//準備
                
                Arrays.sort(pairs, (p1, p2)->{
                    if(p1.x == p2.x) {
                        return p1.y - p2.y;
                    }
                    return p1.x - p2.x;
                });//x昇順→y昇順
                
                for(int i = 0; i < n; i++) {
                    System.out.println(pairs[i].x+" "+pairs[i].y);
                }
                
        }
    }
}
