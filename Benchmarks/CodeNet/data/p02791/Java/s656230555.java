import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i  = 0 ; i  < n ;i ++){
            arr[i] = scn.nextInt();
        }
        int Gmax = 1 ;
        for(int i = 0 ; i<n;i++){
            int max = 1;
            int find = arr[i];
            for(int j = i+1 ;j<n;j++){
                if(arr[j]<find){
                    max++;
                }
                find = arr[j];
            }
            Gmax = Math.max(max,Gmax);
        }
        System.out.println(Gmax);
    }
}
