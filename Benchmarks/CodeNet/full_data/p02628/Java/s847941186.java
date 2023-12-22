import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
       
        
            int total = scn.nextInt();
            int nof = scn.nextInt();
            
            int[] prize = new int[total];
            for (int i = 0; i < total; i++) {
                prize[i]= scn.nextInt();
            }
            Arrays.sort(prize);
            int sum=0;
            for (int i = 0; i < nof; i++) {
                sum = sum + prize[i];
            }
            System.out.print(sum);



    }
}