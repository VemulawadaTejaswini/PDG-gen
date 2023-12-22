import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int CAC, CWA, CTLE, CRE;
    CAC = CWA =CTLE = CRE = 0;
    
    for(int i = 0; i< sc.nextInt(); i++){
      String str = sc.nextLine();
      if(str.equals("AC"))
        CAC++;
      else if(str.equals("WA"))
        CWA++;
      else if(str.equals("TLE"))
        CTLE++;
      else if(str.equals("RE"))
        CRE++;
      
    }
    
    System.out.println("AC * " + CAC);
    System.out.println("WA * " + CWA);
    System.out.println("TLE * " + CTLE);
    System.out.println("RE * " + CRE);
  }
}