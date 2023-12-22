import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xy[][]= new int[n][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++){
                xy[j][i] = sc.nextInt();
            }
        }
        distance(xy, n);
    }
     public static void distance(int xy[][], int n){
        double array[] = new double[4];
        double max = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < n; j++){
                array[i] += Math.abs(Math.pow(xy[j][0] - xy[j][1], i + 1));
                max = Math.max(max, Math.abs(xy[j][0] - xy[j][1]));
            }
        }
        System.out.println(array[0]);
        System.out.println(Math.sqrt(array[1]));
        System.out.println(Math.cbrt(array[2]));
        System.out.println(max);
        
    }
}
