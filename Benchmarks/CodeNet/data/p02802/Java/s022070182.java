import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] p=new int[N+1];
      int ac=0, pena=0,n;
      String res;
      for(int i=0;i<M;i++){
        n = sc.nextInt();
        res = sc.next();
        if(res.equals("AC")){
          if(p[n]!=1){
            p[n]=1;
            ac++;
          }
        }else{
          if(p[n]!=1){
            pena++;
          }
        }
      }
     System.out.print(ac);
     System.out.print(" ");
     System.out.println(pena);
   }
}
