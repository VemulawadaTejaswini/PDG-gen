import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int S = sc.nextInt();

    int A = S / 100 ; //前2桁
    int B = S % 100 ; //後ろ2桁

    if ( 1 <= A && A <= 12 ){
      if ( 1 <= B && B <= 12 ){
        System.out.println("AMBIGUOUS");
      }else{
        System.out.println("MMYY");
      }
    }else{
      if ( 1 <= B && B <= 12 ){
        System.out.println("YYMM");
      }else{
        System.out.println("NA");
      }
    }
  }
}