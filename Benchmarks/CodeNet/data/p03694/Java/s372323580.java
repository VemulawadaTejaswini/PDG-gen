import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    int tmp;
    for(int i=0;i<n;i++){
      tmp=sc.nextInt();
      min=Math.min(tmp,min);
      max=Math.max(tmp,max);
    }
    System.out.println(max-min);
  }
}
