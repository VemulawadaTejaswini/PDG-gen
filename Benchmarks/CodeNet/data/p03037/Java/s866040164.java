import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m= sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        int count = 0;
        boolean[] test = new boolean[n+1];
        for(int i =0;i<m;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            for(int j =0;j<l[i];j++){
                test[j]=true;
            }
            for(int j=r[i]+1;j<=n;j++){
                test[j] = true;
            }
        }
        for(int i=0;i<=n;i++){
            if(!test[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}