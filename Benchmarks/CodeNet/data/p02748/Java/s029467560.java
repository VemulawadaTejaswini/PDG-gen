import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   int m=kbd.nextInt();

   int[] A = new int[a];
   for(int n=0;n<a;n++){
     A[n] = kbd.nextInt();
   }
   int[] B = new int[b];
   for(int n=0;n<b;n++){
     B[n] = kbd.nextInt();
   }

  int[] wari = new int[m];
   for(int i=0;i<m; i++){
     int x = kbd.nextInt();
     int x1=A[x-1];
     int y = kbd.nextInt();
     int y1=B[y-1];
     int z = kbd.nextInt();
     wari[i]=x1+y1-z;
     }

   int am=200000;
   for(int i=0;i<a;i++){
     if(A[i]<am){
       am=A[i];
     }
   }
   int bm=200000;
   for(int i=0;i<b;i++){
     if(B[i]<bm){
       bm=B[i];
     }
   }
    int mab=am+bm;

    int wm=200000;
    for(int i=0;i<m;i++){
      if(wari[i]<wm){
        wm=wari[i];
      }
    }

    if(wm>mab){
      System.out.println(mab);
    }else{
      System.out.println(wm);
    }

}
}