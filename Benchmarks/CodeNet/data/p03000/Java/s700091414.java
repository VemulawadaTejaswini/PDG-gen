import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){

        Scanner scan =new Scanner(System.in);

        int n=scan.nextInt();
        int x=scan.nextInt();

        int count=1;
        int D=0;
        int l;

        for(int i=0;i<n;i++){

            l=scan.nextInt();
            D=D+l;

            if(D<=x) count=count+1;
        }

        System.out.print(count);

    }
}