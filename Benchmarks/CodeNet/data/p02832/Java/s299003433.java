import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int count = 1001001001;
        for(int i = 0;i<n;i++){
            int tmp = 0;
            if(a[i]==1){
                int tmpB = 0;
                int j = i+1;
                int k = 2;
                for(int l = j;l<n;l++){
                    if(a[l]==k){
                        tmpB ++;
                        k++;
                    }
                }
                tmp = n-tmpB-1;
                count = Math.min(count,tmp);
            }
        }
        if(count==1001001001){
            count = -1;
        }
        System.out.println(count);
    }
}