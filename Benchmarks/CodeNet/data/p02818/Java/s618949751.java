import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int A=scanner.nextInt();
    int B=scanner.nextInt();
    int K=scanner.nextInt();
    
    for(int i=0; i<K; i++){
      if(A>0){
        A=A-1;
      }else if(B>0){
        B=B-1;
      }else{
        A=A;
        B=B;
    }
   }System.out.println(A);
    System.out.println(B);
 }
}