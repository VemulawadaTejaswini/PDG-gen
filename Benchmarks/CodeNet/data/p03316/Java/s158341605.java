import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //test cases
        int n = in.nextInt();

        int S_n = n%9;
        if(n%S_n==0) System.out.println("Yes");
        else System.out.println("No");
    }
}