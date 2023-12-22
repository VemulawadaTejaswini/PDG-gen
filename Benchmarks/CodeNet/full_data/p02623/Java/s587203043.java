import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        long K=sc.nextLong();
       int arr[]=new int[N];
        int brr[]=new int[M];
        for(int i=0;i<N;++i) {
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        for(int i=0;i<M;++i) {
            int eleb=sc.nextInt();
            brr[i]=eleb;
        }
        int i=0, j=0;
        int count=0;
        while(i<arr.length&&j<brr.length) {
            if(arr[i]<=brr[j]) {
                K-=arr[i];
                i++;
            } else {
                K-=brr[j];
                j++;
            }
            if(K<0)
                break;
            count++;
        }
        while(i<arr.length) {
            K-=arr[i];
            if(K<0)
                break;
            i++;
            count++;
        }
        while(j<brr.length) {
            K-=brr[j];
            if(K<0)
                break;
            j++;
            count++;
        }
        System.out.println(count);

    }
}