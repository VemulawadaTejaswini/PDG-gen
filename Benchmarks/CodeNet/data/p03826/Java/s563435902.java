import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] area = new int[2];
    for(int i=0; i<2; i++){
      int width = sc.nextInt();
      int length = sc.nextInt();
      area[i] = width * length;
    }
    if(area[0]<area[1]){
      System.out.println(area[1]);
    }else{
      System.out.println(area[0]);
    }
  }
}