import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int [n];
        int[] b1 = new int [n-1];
        for(int i = 0;i < n;i++){
            x[i] = sc.nextInt();
        }
        int[] a = x.clone();
        Arrays.sort(x);
        for(int j = 0;j < n;j++){
            for(int i = 0;i < n;i++){
                if(x[i] == a[j]){
                    if(i < (n/2)){
                        System.out.println(x[n/2]);
                    }
                    else{
                        System.out.println(x[n/2-1]);
                    }
                    break;
                }
            }
        }
    }
}