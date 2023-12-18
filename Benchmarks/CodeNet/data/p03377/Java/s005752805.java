import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt(),b=sc.nextInt(),x=sc.nextInt();
    long sum=a+b;
   System.out.println(sum-a>=x?"YES":"NO");
}

}