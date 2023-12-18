import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] p = new int[n];
        int[] flag = new int[n];
        for(int i=0;i<n;i++){
            p[i] = scn.nextInt();
        }
        check(p,flag,n);
        int sum=0;
        for(int i=0;i<n;i++){
            sum += flag[i];
        }
        System.out.println(sum);
    }
    public static int[] check(int[] p,int[] flag,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(p[j] <= p[i]){
                    flag[j] = 1;
                }
            }
        }
        return flag;
    }
}