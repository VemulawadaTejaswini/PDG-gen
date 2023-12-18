import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int S,L;
    int Ri=0;
    if(A>B){
      L=A;
      S=B;
    }else{
      L=B;
      S=A;
    }
    int X = L%S;
    for(int i = 1;i<=S;i++){
      if((i*L)%S==0){
        Ri = i;
        i = S+1;
      }
    }
    System.out.println(Ri*L);
   }
  
}