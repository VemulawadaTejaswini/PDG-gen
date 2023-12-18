import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        long K=sc.nextLong();
        long arr[]=new long[N+1];
        long brr[]=new long[M+1];
        for(int i=0;i<N;++i) {
            int ele=sc.nextInt();
            arr[i+1]=arr[i]+ele;
        }
        for(int i=0;i<M;++i) {
            int eleb=sc.nextInt();
            brr[i+1]=brr[i]+eleb;
        }
        int count=0;
//        int i=0,j=0;
//        while(i<arr.length&&j<brr.length) {
//            if(arr[i]+brr[j]<=K) {
//                count=Math.max(count,i+j);
//            }
//            if(arr[i]<=brr[j]) {
//                i++;
//            } else
//                j++;
//        }
//        while(i<arr.length) {
//
//        }
        int j=M;
        int  max=0;
        for(int i=0;i<arr.length;++i) {
            if(arr[i]>K)
                break;
            while(brr[j]>K-arr[i]) {
                j--;
            }
            max=Math.max(i+j,max);

        }
        System.out.println(max);

    }
}