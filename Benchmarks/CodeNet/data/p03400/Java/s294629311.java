import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt(),x = sc.nextInt();
        int[] a = new int[n];
        x += n;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            for(int j=1;j<=d;j++){
                if(j*a[i]+1<=d){
                    x ++;
                } else {
                    break;
                }
            }
        }
        System.out.println(x);
    }
}