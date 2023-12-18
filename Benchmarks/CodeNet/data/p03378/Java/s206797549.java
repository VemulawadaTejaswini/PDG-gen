import java.util.Scanner;
 
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  int X = sc.nextInt();
   int[] Narray = new int[N+1];
  int to0 =0;
  int toN =0;
  for(int i=0;i<M;i++){
 int tmp = sc.nextInt(); 
    Narray[tmp]=1;
  }  
  for(int i=0;i<X;i++){
  to0 += Narray[i];
  }
   for(int i=N;i>X;i--){
  toN += Narray[i];
  }
  if(to0>toN)
    System.out.print(toN);
  else
    System.out.print(to0);
}
}