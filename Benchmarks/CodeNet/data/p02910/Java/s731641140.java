import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String[] S=scan.nextLine().split("");
    for(int i=0;i<S.length;i++){
      if(i%2==0){
        if(S[i].equals("R")||S[i].equals("U")||S[i].equals("D")){
          continue;
        }else{
          System.out.println("No");
          System.exit(0);
        }
      }else{
        if(S[i].equals("L")||S[i].equals("U")||S[i].equals("D")){
          continue;
        }else{
          System.out.println("No");
          System.exit(0);
        }
      }
    }
    System.out.println("Yes");
  }
}