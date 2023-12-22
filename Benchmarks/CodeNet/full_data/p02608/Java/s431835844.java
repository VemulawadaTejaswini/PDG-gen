

import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] ans = new int[10050];

        for (int i = 1; i < 105; i++) {
           for (int j= 1; j < 105; j++) {
               for (int k = 1; k < 105; k++) {
                   int v = i*i+j*j+k*k+i*j+j*k+k*i;
                   if (v<10050)
                       ans[v]+=1;
        }
        }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i+1]);
        }
    }
}
