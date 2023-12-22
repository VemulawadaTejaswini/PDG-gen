import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int D=sc.nextInt();
    int T=sc.nextInt();
    int S=sc.nextInt();
    float g=D/S;
    if(g<=(float)T){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}