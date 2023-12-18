import java.util.Scanner;

class Wari{
  int a1;
  int b1;
  int c1;
  int m1;
}
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

   Wari[] wari = new Wari[m];
   Wari temp;
   for(int i=0;i<m; i++){
     int x = kbd.nextInt();
     int x1=A[x-1];
     int y = kbd.nextInt();
     int y1=B[y-1];
     int z = kbd.nextInt();
     temp = new Wari();
     temp.a1= x1;
     temp.b1 = y1;
     temp.c1 = z;
     wari[i] = temp;
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

    for(int i=0;i<m;i++){
      wari[i].m1=wari[i].a1+wari[i].b1-wari[i].c1;
    }
    int wm=200000;
    for(int i=0;i<m;i++){
      if(wari[i].m1<wm){
        wm=wari[i].m1;
      }
    }

    if(wm>mab){
      System.out.println(mab);
    }else{
      System.out.println(wm);
    }

}
}