import java.util.*;
class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
    boolean f=false;
    for(int i=1;i<B;i++){
      if((A*i)%B==C){
        f=true;
        break;
      }
    }
    System.out.println(f?"YES":"NO");
  }
}