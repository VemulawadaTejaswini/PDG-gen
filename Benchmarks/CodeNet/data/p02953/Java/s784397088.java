import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n+1];
        boolean arrr[]=new boolean[n+1];
        for (int i=1;i<n+1;i++)arr[i]=sc.nextInt();
        boolean yes=false;
        for (int i=1;i<n;i++) {
            if (arr[i]>arr[i+1] && !arrr[i]){
                arr[i]--;
                arrr[i]=true;
            }
            if (arr[i]<arr[i-1] && !arrr[i-1]){
                arr[i-1]--;
                arrr[i-1]=true;
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]<=arr[i+1]){
                yes=true;
            }else{
                yes=false;
                break;
            }
        }
        if (yes) {
            System.out.println("Yes");
        }else System.out.println("No");
    }

}

