package Tutorials;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int needStrip = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        if(arr[0]>=arr[1]){
            needStrip = 1;
        }
        else {
            while(arr[0]<arr[1]) {
                arr[0]+=arr[0];
                needStrip++;
            }

        }
        System.out.println(needStrip+1);
    }
}