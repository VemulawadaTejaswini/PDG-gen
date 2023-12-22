import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []array=new int[N];
        for(int i=0;i<N;i++)array[i]=sc.nextInt();
        int num=0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if(array[i]>array[j]){
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                    num++;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(array[i]);
            if(i<N-1)System.out.print(" ");
        }
        System.out.println();
        System.out.println(num);
    }
}
