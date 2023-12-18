import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int x = (int)(n/1.08);
    if((x*1.08-n)==0){
      System.out.println(x);
    }
    else if(((x+1)*1.08-n)<1){
      System.out.println(++x);
    }
    else{
      System.out.println(":(");
    }
  }
}