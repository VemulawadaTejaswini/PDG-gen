import java.util.*;
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String R;
    if(N>=30){
      R = "Yes";
    }else{
      R = "No";
    }
    System.out.println(R);                     
  }
}