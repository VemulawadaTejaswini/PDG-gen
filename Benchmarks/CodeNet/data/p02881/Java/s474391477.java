import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int i=0;
        int j=0;

        for(i=1;i<=Math.sqrt(N);i++){
            if(N%i==0){
                j=N/i;
            }
        }
        System.out.println(i+j-2);

        //END
    }
}

