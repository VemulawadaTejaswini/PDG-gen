import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = f.nextInt();
        }
        int ans = 0;
        for(int i=0;i<5;i++){
            if(arr[i] == 0){
                ans = i + 1;
            }
        }
        System.out.println(ans);
    }
}