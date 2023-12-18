import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();
    int root1 = P+Q;
    int root2 = P+R;
    int root3 = Q+R;
    if ((root1<=root2)&&(root1<=root3)){
      System.out.println(root1);
    } else if((root2<=root1)&&(root2<=root3)){
      System.out.println(root2);
    }else{
      System.out.println(root3);
    }
  }
}