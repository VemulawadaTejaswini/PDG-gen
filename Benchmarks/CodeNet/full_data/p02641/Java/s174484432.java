import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        if(n==0){
            System.out.println(x);
            System.exit(0);
        }
        int number[] = new int[201];
        Arrays.fill(number,1);
        for(int i=0;i<n;i++){
            int p = sc.nextInt();
            number[p]=0;
        }
        for(int i=0;i<=200;i++){
            if(x-i <= 0)continue;
            if(x+i > 200)continue;
            if(number[x-i]==1){
                System.out.println(x-i);
                System.exit(0);
            }
            if(number[x+i]==1){
                System.out.println(x+i);
                System.exit(0);
            }
        }
        System.out.println(0);//配列全て0で埋まっている
    }
}

class Monmo {
    
}

