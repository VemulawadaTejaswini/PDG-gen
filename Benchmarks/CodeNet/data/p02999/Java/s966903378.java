import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){
        Scanner scan =new Scanner(System.in);
        int x=scan.nextInt();
        int a=scan.nextInt();

        if(x<a){
            System.out.print(0);
        }
        else {
            System.out.print(10);
        }

    }
}