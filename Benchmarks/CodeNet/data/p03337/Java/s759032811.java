import java.util.*;
class ex1{
  public static void main (String args[]){
    int A;
    int B;
    Scanner sc = new Scanner(System.in);

    A = sc.nextInt();
    B = sc.nextInt();

    if(((A+B)>(A-B))&&((A+B)>(A*B))){
        System.out.println(A+B);
  }
    if(((A-B)>(A+B))&&((A-B)>(A*B))){
    System.out.println(A-B);
  }
    if(((A*B)>(A-B))&&((A*B)>(A+B))){
    System.out.println(A*B);
  }
    if((A+B)==(A-B)){
      if((A+B)>=(A*B)){
        System.out.println(A+B);
      }
        else{
        System.out.println(A*B);
      }
    }
    if((A+B)==(A*B)){
      if((A+B)>=(A-B)){
        System.out.println(A+B);
      }
        else{
        System.out.println(A-B);
      }
    }
  }
}
