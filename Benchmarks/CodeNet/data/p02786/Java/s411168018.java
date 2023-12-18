
import java.util.Scanner;

public class Main {
    static int binarySearchRightMost(int arr[],int key){
        int l=0,r=arr.length-1;
        while (l<r){
            int mid=Math.floorDiv(l+r,2);
            if(arr[mid]>key){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return r-1;

    }

    public static void main(String[] args) {
//        int arr[]={1,2,3,4,4,4,6,7};
//        System.out.println(binarySearchRightMost(arr,4));
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long ss=n;
        long total=0;
        if(ss>1) {
            for (int j = 0; j < 100; j++) {
                n/=2;
                //n = (long) Math.floorDiv((long) (long) n, (long) 2);
                total = (long) ((long) total + (long) Math.pow(2, j));
                if (n == 1) {
                    total = (long) ((long) total + (long) Math.pow(2, j + 1));
                    break;
                }
            }
        }
        if(ss==1){
            System.out.println(1);
        }else{
        System.out.println(total);}
//        int k=scanner.nextInt();
//        long arr[]=new long[n];
//        for(int j=0;j<n;j++){
//            arr[j]=scanner.nextLong();
//        }
//        Arrays.sort(arr);
//        int c=0;
//        if(k>0) {
//            for (int j = arr.length - 1; j >= 0; j--) {
//                arr[j] = 0;
//                c++;
//                if (c == k) {
//                    break;
//                }
//            }
//        }
//        long ans=0;
//        for(int j=0;j<arr.length;j++){
//            ans=(long)((long)ans+(long)arr[j]);
//        }
//        System.out.println(ans);
//        int arr[]=new int[b];
//        for(int j=0;j<b;j++){
//            a-=scanner.nextInt();
//            if(a<=0){
//                System.out.println("Yes");
//                break;
//            }
//        }
//        if(a>0){
//            System.out.println("No");
//        }
//        System.out.println(a%b==0?Math.floorDiv(a,b):Math.floorDiv(a,b)+1);
    }
}
