import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int num[]=new int[4];
      for(int i=0;i<4;i++){
      	num[i]=sc.nextInt();
      }
      int x=num[2]-num[0];
      int y=num[3]-num[1];
        System.out.print((num[2]-y)+" "+(num[3]+x)+" ");
      System.out.println((num[0]-y)+" "+(num[1]+x));
    }
}