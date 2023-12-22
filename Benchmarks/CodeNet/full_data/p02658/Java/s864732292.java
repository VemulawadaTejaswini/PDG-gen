import java.util.*;

public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long ans = 1;
    long[] array = new long[n];
    boolean flag = false;
   // String bin = Long.toBinaryString(1000000000000000000L);
   // System.out.println(1000000000000000000L);
   // System.out.println(bin);
   // System.out.println("len:"+bin.length());
   // String bin2 = Long.toBinaryString(1000000000000000000L*1000000000000000000L);
   // System.out.println(1000000000000000000L*1000000000000000000L);
   // System.out.println(bin2);
   // System.out.println("len:"+bin2.length());
   // String bin3 = Long.toBinaryString(1000000000000000000L*1000000000000000000L*1000000000000000000L);
   // System.out.println(1000000000000000000L*1000000000000000000L*1000000000000000000L);
   // System.out.println(bin3);
   // System.out.println("len:"+bin3.length());
   // String bin4 = Long.toBinaryString(1000000000000000000L*1000000000000000000L*1000000000000000000L*1000000000000000000L);
   // System.out.println(1000000000000000000L*1000000000000000000L*1000000000000000000L*1000000000000000000L);
   // System.out.println(bin4);
   // System.out.println("len:"+bin4.length());
   for(int i=0; i<n; i++){
     long num = sc.nextLong();
     if(ans>1000000000000000000L/num){
       flag = true;
     }else{
       ans *= num;
     }
     if(num==0){
       flag = false;
     }
   }

   if(flag){
     System.out.println("-1");
   }else{
     System.out.println(ans);
   }

  }
}