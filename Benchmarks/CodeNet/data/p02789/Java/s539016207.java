import java.util.Scanner;


class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int N = Integer.parseInt(sc.next());
   int count=0;
   
   int[] P = new int[N];
   for(int i=0;i<N;i++){
   	P[i] = Integer.parse(sc.nextInt());
   }

   for(int a=0;a<N;a++){
   	for(int b=0;b<=a;b++){
     if(P[a]>P[b]){
       count=count+1;
       break;
     }
      
   }
     
   }
   System.out.println(N-count);
 }
}
