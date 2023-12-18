import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long A = sc.nextLong(); 
    Long B = sc.nextLong(); 
    Long C = sc.nextLong(); 
    Long D = sc.nextLong(); 

    Long BC =B/C;
    Long BD =B/D;
    Long BCD = B/(C*D/syori(C,D));
    Long B_ans = B + BCD - BC - BD;

    Long AC =(A-1)/C;
    Long AD =(A-1)/D;
    Long ACD = (A-1)/(C*D/syori(C,D));
    Long A_ans = A -1 + ACD - AC - AD;
    System.out.println(B_ans - A_ans);
  
  }

  public static Long syori(Long C, Long D){
    if(C>=D){
      if(C%D==0){ 
        return D;
      }else{
        return syori(D,C%D);
      }
    }else{
      if(D%C==0){ 
        return C;
      }else{
        return syori(C,D%C);
      }
    }
  }

  
}

