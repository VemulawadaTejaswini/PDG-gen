import java.util.Scanner;

import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N =scan.nextInt();
        int[] a = IntStream.range(0,N).map(i->scan.nextInt()).toArray();
        Arrays.sort(a);
        int ans =0;
        for(int i=a.length-1;i>=0;i-=2)ans+=a[i];
        for(int i=a.length-2;i>=0;i-=2)ans-=a[i];
        System.out.println(ans);
    }
}