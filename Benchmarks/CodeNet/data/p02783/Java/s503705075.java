

import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args)
    {
        long i,j,k=0;
        Scanner sc =new Scanner(System.in);
        i=sc.nextLong();
        j=sc.nextLong();
        if(j>=i)
        {
            k=1;
            System.out.println(k);
        }
        else {
            while (i >= 0) {
                i = i - j;
                k++;
            }
            System.out.println(k);
        }

    }
}