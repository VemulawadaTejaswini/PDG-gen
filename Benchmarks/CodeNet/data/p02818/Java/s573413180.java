import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int A=scanner.nextInt();
    int B=scanner.nextInt();
    int K=scanner.nextInt();
    
    for(int i=0; i<K; i++){
      if(A>=1){
        System.out.println(A-1);
        System.out.println(B);
      }else if(B>0){
        System.out.println(B-1);
      }
    }
   }
 }
  