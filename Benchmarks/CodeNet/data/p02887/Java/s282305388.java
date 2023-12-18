import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String S=sc.next();


        String[] strArray=S.split("");

        int i=0;
        int sum=1;


        for(i=0;i<N-1;i++){
            if(!(strArray[i].equals(strArray[i+1]))){
                sum=sum+1;
            }
        }
        System.out.println(sum);

        //END
    }
}

