import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int r = sc.nextInt();//グーで勝利する場合の加点
    int s = sc.nextInt();
    int p = sc.nextInt();

    String ss = sc.next();

    char[] c = ss.toCharArray();

    int points = 0;

    for(int i=0; i<c.length;i++){
     if(c[i]==0x73){//相手がチョキ
       if(i<k||(i>=k&&c[i-k]!=c[i])){
         points += r;
         //System.out.println(i+"グーで勝利");
       }else{
         c[i] = 0x00;
       }
     }else if(c[i]==0x70){//相手がgu-

       if(i<k||(i>=k&&c[i-k]!=c[i])){
                         //System.out.println(i+"パーで勝利");
         points += s;
       }else{
         c[i] = 0x00;
       }
     }else if(c[i]==0x72){//相手がパー
       if(i<k||(i>=k&&c[i-k]!=c[i])){
         points += p;
                //System.out.println(i+"チョキで勝利");
       }else{
         c[i] = 0x00;
       }
     }
   }

   System.out.println(points);
  }
}