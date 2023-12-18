import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int i = 0;
        while(i!=n&&x>=a[i]){
            x -= a[i];
            i ++;
        }
        if(i!=n-1||(i==n-1&&x<a[n-1])){
            System.out.println(i);
        } else {
            System.out.println(i+1);
        }
    }
}