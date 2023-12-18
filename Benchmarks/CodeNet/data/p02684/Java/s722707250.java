import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        int ans=a[0];
        for(int i=0;i<k+1;i++){
            ans = a[ans-1];
            //System.out.println(ans);
        }
        System.out.println(ans);
    }    
}