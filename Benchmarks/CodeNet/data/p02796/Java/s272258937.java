import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr = new int[2*n];
        int x,l;
        int con=0;
        for(int i=0;i<arr.length;i+=2){
            x=scan.nextInt();
            l=scan.nextInt();
            arr[i]=x-l;
            arr[i+1]=x+l;
        }
        for(int i=1;i<arr.length;i+=2){
            for(int j=i;j<arr.length-1;j+=2){
                if(arr[i]<arr[j+1]){
                    con+=1;
                }
            }
        }
        System.out.println(con);
    }
}