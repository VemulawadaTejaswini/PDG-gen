import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] a={sc.nextInt(),sc.nextInt(),sc.nextInt()};
    Arrays.sort(a);
    int b=a[2]-a[0]+a[2]-a[1];
    if(b%2==0){
      System.out.println(b/2);
    }else{
      System.out.println(b/2+2);
    }
  }
}