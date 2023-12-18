import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        double[][] xy=new double[8][2];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        final int X=0,Y=1;
        double gt=0;
        for(int i=0;i<n;i++){
            xy[i][X]=sc.nextDouble();
            xy[i][Y]=sc.nextDouble();
        }
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                gt+=Math.sqrt(Math.pow(xy[i][X]-xy[j][X],2)+Math.pow(xy[i][Y]-xy[j][Y],2));
            }
        }
        System.out.println(gt*2/n);
    }
}