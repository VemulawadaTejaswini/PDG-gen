import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int N=stdIn.nextInt();
    int[] n=new int[3];
    for(int i=0;i<3;i++){
      n[i]=N%10;
      n/=10;
    }
    if(n[0]==n[2]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}