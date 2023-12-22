import java.util.*;

public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   long ans = 1;
   long[] array = new long[n];
   boolean flag = false;
   boolean flag_z = false;

   for(int i=0; i<n; i++){
     long num = sc.nextLong();
     if(num==0){
       flag_z = true;
     }
     ans *= num;
     if(ans<=0||ans>1000000000000000000L){
       flag = true;
     }

     //System.out.println("ans:"+ans);
   }

   if(flag_z){
    System.out.println(0);
  }else{
    if(flag){
      System.out.println("-1");
    }else{
      System.out.println(ans);
    }
  }



   // System.out.println(900000000000000000L*900000000000000000L);
   //
   // String bin = Long.toBinaryString(1000000000000000000L);
   // System.out.println(bin);
   // System.out.println(bin.length());

   // for(long i=1000000000000000000L; i>1e17; i--){
   //   System.out.println(i*1000000000000000000L);
   //   if(i*1000000000000000000L<1000000000000000000L&&i*1000000000000000000L>0){
   //     System.out.println("i"+i);
   //     break;
   //   }
   // }
   //999999999999999988
  }
}