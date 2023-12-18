package atCoder115;

import java.util.Scanner;
import java.util.*;

class ABC115D {
  public static void main(String args[]) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("数値を入力してください。");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("数値を入力してください。");
        int n = scanner1.nextInt();
        int x = scanner2.nextInt();
        int t[] = new int[n];
        int p[] = new int[n];
        t[0] = 1;
        p[0] = 1;
      
        for(int i = 1;i < n;i++){
          t[i] = t[i-1]*2 + 3;
          p[i] = p[i-1]*2 + 1;
        }

        int sum = 0;
        int counter = t[50];
        for(int i = n;i > 0;i--){
          if(x==1){
            break;
          }else if(x==(t[i]+1)/2){
            x = x + p[i-1]+1;
            break;
          }else if(x==t[50]){
              x = p[i];
            break;
          }else if(x>(t[i-1]+1)){
             x = x + p[i-1]+1;
          }
        }
  }
}

