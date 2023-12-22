import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        boolean flag = false;
        int p[] = new int[n];
        if(n==0){
            System.out.println(x);
            return;
        }
        for(int i=0;i<n;i++){
            p[i] = sc.nextInt();
        }
        int min = 999;
        int ans = 999;
        for(int i=0;i<=100;i++){
            flag = false;
            for(int j=0;j<n;j++){
                if(i == p[j]){
                    flag = true;
                    break;
                }
            }
            if(flag)continue;
            if(Math.abs(i-x)<min){
                min = Math.abs(i-x);
                ans = i;
            }
        }
        System.out.println(ans);
    }

}