import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ac=0,tle=0,wa=0,re=0;
    for(int i=0;i<n;i++){
      String s=sc.next();
      if(s.equals("AC"))
        ac++;
      if(s.equals("WA"))
        wa++;
      if(s.equals("TLE"))
        tle++;
      if(s.equals("RE"))
        re++;
    }
    System.out.println("AC X "+ac);
    System.out.println("WA X "+wa);
    System.out.println("TLE X "+tle);
    System.out.println("RE X "+re);
  }
}
