

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] s=in.nextLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int a=Integer.parseInt(s[1]);
        long [] arr=new long[n];
        int b=Integer.parseInt(s[2]);
        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextLong();

        }
        Arrays.sort(arr);
        long sum=0;
        double count=0;
        int comb=1;
        for (int i = n-1; i>=0 ; i--) {
            if(count<a){
                sum+=arr[i];
                count++;
            }
            else{
                if(arr[i]==arr[i+1])
                {   comb++;
//                    count++;
                }
                else{
                    break;
                }
            }
        }
        System.out.printf("%.6f\n%d",(sum/count),comb);
    }
}
