import java.util.*;
 
class Main{
  public int Num,Dis;
  public int[] Xa,Ya;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Num = sc.nextInt();
    Dis = sc.nextInt();
    for(int i=0;i<Num;i++){
      Xa[i] = sc.nextInt();
      Ya[i] = sc.nextInt();
    }
    int R = 0;
    for(int k=0;k<Num;k++){
      if(check(k))R++;
    }
    System.out.println(""+R);
  }
  
  private static boolean check(int i){
    return Math.pow(Xa[i],2)+Math.pow(Y[i],2)<=Math.pow(Dis,2);
  }
}