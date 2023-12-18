import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner ISR = new Scanner(System.in);
    int N = ISR.nextInt();
    String St = ISR.next();
    int R = 0;
    for(int i = 0;i<N;i++){
      if(St.substring(i,i+1).equals("A")){
        i++;
        if(St.substring(i,i+1).equals("B")){
          i++;
          if(St.substring(i,i+1).equals("C")){
            i++;
            R++;
          }
        }
      }
    }
    System.out.println(R);
  }
}