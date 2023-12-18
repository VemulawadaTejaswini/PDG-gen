import java.util.Scanner;

class Main{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
   
  int N=sc.nextInt();
  if(N>=15){
   System.out.println(800*N-200*(N/15));
  }else{
   System.out.println(800*N);
  }
 }
}