import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int D = sc.nextInt();
    if(D<21 || M<4) {
      System.out.println(0);
    }else{
      int D2 = D / 10;
    int D1 = D % 10;
    int tmp;
    int count =0;
    for(int i=2; i<D2; i++){
      tmp=2;
      while(i*tmp<=M){
        count++;
        tmp++;
      }
    }
    for(int j=2;j<D1;j++){
      while(j*D2<=M){
        count++;
      }
    }
    System.out.println(count);
    }
  }
}