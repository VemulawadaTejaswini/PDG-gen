import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      int num[]=new int[n];
      for(int i=0;i<n;i++){
      	num[i]=sc.nextInt();
      }
      if(n==1)System.out.println(num[0]);
     else if(n==2)System.out.println(Math.max(num[1],num[0]));
      else{
        max=Math.max(num[n/2+1],num[n/2]);
        System.out.println(max);
      }
        
    }
}