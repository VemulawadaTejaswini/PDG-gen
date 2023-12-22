import java.util.*;
class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int X=sc.nextInt(),Y=sc.nextInt();
    boolean f=false;
    for(int y=0;y<=X;y++){
      if(2*(X+y)==Y){
        f=true;
        break;
      }
    }
    System.out.println(f?"Yes":"No");
  }
}