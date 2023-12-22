import java.util.Scanner;

public class Main {
    static int n;
    static int state[];
    static int a[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        state = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int m = sc.nextInt();
            boolean f_res = search(0, 0, m);
            if(f_res){
                System.out.println("yes");
            }else{

                System.out.println("no");
            }
        }
    }
    static boolean search(int idx, int sum, int res){
        if(sum == res){
            return true;
        }
        if(idx==n){
            return false;
        }
        //??????
        if(search(idx+1, sum, res)){
            return true;
        }
        //??????
        sum += a[idx];
        if(search(idx+1, sum, res)){
            return true;
        }
        return false;
    }
}