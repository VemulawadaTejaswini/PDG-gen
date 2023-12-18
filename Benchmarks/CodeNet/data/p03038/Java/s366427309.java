import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int M = sc.nextInt();
     long[] A = new long[N];
     long C,element,ans;
     int index,y,B;
     ans = 0;
     for(int i = 0;i<N;i++){
      A[i] = sc.nextInt();
     }
     for(int x=1;x<N;x++){
         element=A[x];
         y=x-1;
          while(y>=0 && A[y]>element){
            A[y+1]=A[y];
            y--;
            A[y+1]=element;
            }
        }
     for(int j = 0;j<M;j++){
       B = sc.nextInt();
       C = sc.nextInt();
       index = 0;
       while(A[index] < C && index<N-1){
         index++;
       }
       if(index>B){
         for(int i=0;i<index-B;i++){
           A[i]=A[B+i];
         }
         for(int i=index-B;i<index;i++){
           A[i]=C;
         }
       }else{
         for(int i = 0;i<index;i++){
           A[i] = C;
         }
       }
     }
     for(int i=0;i<N;i++){
       ans += A[i];
     }
     System.out.println(ans);
   }
}
