

import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String s[] =in.nextLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]);
        s=in.nextLine().split(" ");
        long arr[]=new long[n];
//        arr[0]=Long.parseLong(s[0]);
        int count=n-1,count2=0;
        for (int i = 0; i <n ; i++) {
            arr[i]=Long.parseLong(s[i]);

        }
        Arrays.sort(arr);
        for (int i = 1; i <n ; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
//        System.out.println(Arrays.toString(arr));

        if(arr[n-1]<=k){
            System.out.println(n);
        }
        else {
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] - k > 0) {
                    count--;
//                break;
                }
            }
            System.out.println(count);
        }



//        System.out.println(Integer.MAX_VALUE>1e9);


    }
}
