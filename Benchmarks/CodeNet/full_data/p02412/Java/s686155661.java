import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=1,x=1;
        while(n != 0 || x != 0){
            n = sc.nextInt();
            x = sc.nextInt();
            if(n == 0 && x == 0) break;
            int cnt = 0;
            for(int i=1;i<=n-2;i++){
                for(int j=i+1;j<=n-1;j++){
                    for(int k=j+1;k<=n;k++){
                        if(i+k+j == x){
                            cnt++;
                        }
                    }
                }
            }
            System.out.printf("%d%n",cnt);
        }
        
        sc.close();
    }
}

