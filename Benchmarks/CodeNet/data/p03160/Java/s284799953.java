import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        int [] arr = new int[t];
        int [] minpatharr = new int[t];
        for(int i=0;i<t;i++)
            arr[i]=s.nextInt();
        minpatharr[0]=0;
        minpatharr[1]=Math.abs(arr[1]-arr[0]);
        for(int i=2;i<t;i++){
            minpatharr[i]=Math.min(Math.abs(arr[i]-arr[i-1])+minpatharr[i-1],Math.abs(arr[i]-arr[i-2])+minpatharr[i-2]);
        }
        System.out.println(minpatharr[t-1]);
    }
}
