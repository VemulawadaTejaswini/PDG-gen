import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){
        Scanner scan =new Scanner(System.in);
        int r=scan.nextInt();
        int d=scan.nextInt();
        int x=scan.nextInt();

        for(int i=0;i<10;i++){
            x=r*x-d;
            System.out.println(x);

        }

    }
}