import java.util.Scanner;

class rrr{
  public static void main(String args[]){

    int A;
    int B;
    int K;
    int i;


    Scanner sc=new Scanner(System.in);

    System.out.print("A:");
    A=sc.nextInt();

    System.out.print("B:");
    B=sc.nextInt();

    System.out.print("K:");
    K=sc.nextInt();
    if(0<B-A-2*K){
    for(i=A;i<=A+K-1;i++){
        System.out.println(i);
      }
    for(i=B-K+1;i<=B;i++){
        System.out.println(i);
      }
    }else{
      for(i=A;i<=B;i++){
        System.out.println(i);
      }
    }
  }
}
