import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[][] x = new int[2][2];
        for(int i = 0; i < 2; i++){
            x[i][0] = sc.nextInt();
            x[i][1] = sc.nextInt();
        }
        sc.close();

        int[] to2 = new int[2];
        to2[0] = x[1][0] - x[0][0];
        to2[1] = x[1][1] - x[0][1];
        int[] x3 = new int[2];
        int[] x4 = new int[2];
        x3[0] = x[1][0] - to2[1];
        x3[1] = x[1][1] + to2[0];
        x4[0] = x[0][0] - to2[1];
        x4[1] = x[0][1] + to2[0];

        System.out.println(x3[0] + " " +
                            x3[1] + " " +
                            x4[0] + " " + 
                            x4[1]);
    }
}