import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int ANS=0;
    
    for(int i=0;i<N;i++){
      Long NEXT=sc.nextLong();
      while(NEXT%2==0){
        NEXT=NEXT/2;
        ANS++;
      }
    }
    
    System.out.println(ANS);
  }
}