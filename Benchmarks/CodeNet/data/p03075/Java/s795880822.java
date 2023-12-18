import java.util.Scanner;
import math;
class Main{
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       int e = sc.nextInt();
       int k = sc.nextInt();
       int[] l = {a,b,c,d,e};
       String ans = "Yay!";
       for(int i = 0;i < l;i++){
           for(int x = 1;x < l-1;x++){
               if(math.abs(l[i] - l[x]) > k){
                   ans = ":(";
                   break out;
               }
           }
       }
       out:
       System.out.println(ans);
    }
}