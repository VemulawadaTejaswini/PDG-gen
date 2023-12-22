import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args){
        // input N
            Scanner sc = new Scanner(System.in);
            int D= sc.nextInt(), T= sc.nextInt(), S = sc.nextInt();
            int ans = D / S;

            // output N
            

            // if
            if(T >= ans){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
            


    }

}