import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        ArrayList<Integer> i = new ArrayList<Integer>();
        int[][] s = new int[a][b];
        for(int x = 0; x < b; x++){
            i.add(Integer.parseInt(scanner.next()));
        }
        for(int xx = 0; xx < a; xx++){
            for(int xxx = 0; xxx < b ; xxx++ ){
                s[xx][xxx] = Integer.parseInt(scanner.next());
            }
        }
        scanner.close();
        int[] ii = i.stream().mapToInt(Integer::intValue).toArray();
        int count = 0;
        for(int y = 0; y < a; y++){
            int res = 0;
            for(int yy = 0; yy < b; yy++){
                res += ii[yy] * s[y][yy];
            }
            if(res + c > 0) count++;
        }

        System.out.println(count);
    }
}
