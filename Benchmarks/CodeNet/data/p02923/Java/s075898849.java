import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int count = 0;
        int max = 0;
        h[0] = sc.nextInt();
        for(int i =1;i<n;i++){
            h[i] = sc.nextInt();
            if(h[i]<=h[i-1]){
                count ++;
            } else {
                max = Math.max(max,count);
                count = 0;
            }
        }
      	max = Math.max(max,count);
        System.out.println(max);
}
}
