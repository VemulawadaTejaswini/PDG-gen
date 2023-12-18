import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        
        int n = 0;
        int m = 0;

        n = (D*2)+1;
        m = N%n;

        if(m != 0){
            m+=1;
        }
        else{
            m = N/n;
        }

        System.out.println(m);
        
    }

}