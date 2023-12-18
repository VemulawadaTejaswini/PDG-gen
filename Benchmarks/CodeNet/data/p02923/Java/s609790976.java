import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int count = 0;
        for(int i =0;i<n;i++){
            h[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            int j = i;
            int tmp = 0;
            while(j+1<n&&h[j]>=h[j+1]){
                j = j+1;
                tmp ++;
            }
            count = Math.max(count,tmp);
        }
        System.out.println(count);
}
}
