import java.util.Scanner;


class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int count=0;
   
   int[] P = new int[N];
   for(int i=0;i<N;i++){
   	P[i] = sc.nextInt();
   }

   for(int a=0;a<N;a++){
   	for(int b=0;b<=a;b++){
     if(P[a]>P[b]){
       break;
     }
      
   }
     count+=1;
   }
   System.out.println(count);
 }
}
