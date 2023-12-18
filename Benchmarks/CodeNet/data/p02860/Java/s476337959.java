import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String li[] = S.split("");
    boolean judge = true;
    if(N%2==1){
      judge = false;
    }else{
      for(int i=0;i<N/2;i++){
        if(!li[i].equals(li[N/2+i])){
          judge = false;
        }
      }
    }
    if(judge){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}               