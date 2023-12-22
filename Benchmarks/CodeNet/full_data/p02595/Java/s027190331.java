import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int dotNum = sc.nextInt();
        int distance = sc.nextInt();
        int[][] point = new int[dotNum][2]; 
        for(int i = 0; i < dotNum; i++){
            point[i][0] = sc.nextInt();
            point[i][1] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < dotNum; i++){
            if(isLessThanDistance(point[i][0], point[i][1],distance)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isLessThanDistance(int x, int y,int distance){
        return distance >= Math.sqrt((double)x*x + (double)y*y) ? true : false;
    }
}