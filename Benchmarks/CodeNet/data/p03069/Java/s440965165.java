import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println(recur(arr,0,0,0,0));
//    }
//
//    static long recur(int[] arr,int idx, int r,int g, int b){
//
//        if(idx==arr.length){
//            if( r+b > g && r+g > b && g+b > r  ){
//                return 1;
//            }else{
//                return 0;
//            }
//        }
//        long count = 0;
//        count += recur(arr, idx+1,r+arr[idx],g,b);
//        count += recur(arr, idx+1,r,g+arr[idx],b);
//        count += recur(arr, idx+1,r,g,b+arr[idx]);
//
//        return count%998244353 ;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        String S = sc.next();

        int count =0;
        for (int i = 0; i <N ; i++) {
            char c2  = S.charAt(i);
            if(c2 =='.') count++;
        }


        int w = 0;
        int b = count;

        int min =Integer.MAX_VALUE;

        for (int i = 0; i < N ; i++) {
            char c2  = S.charAt(i);
            if(c2 == '.' ){
                b --;
            }else{
                w ++;

            }
            min=Math.min(min, w+b);
        }
        System.out.println(min);
    }

}
