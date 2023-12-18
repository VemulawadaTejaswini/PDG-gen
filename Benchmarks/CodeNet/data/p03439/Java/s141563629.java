import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l=0;int r=n-1;
    System.out.println(0);
    String ot=sc.next();
    boolean lm=ot.equals("Male");
    while(!ot.equals("Vacant")){
      int g=l+(r-l+1)/2;
      System.out.println(g);
      ot=sc.next();
      boolean gm=ot.equals("Male");
      boolean sag=((g-l)&1)==0;
      if(((lm==gm)&&sag)||((lm!=gm)&&!sag)){
        l=g;
        lm=gm;
      }else{
        r=g-1;
      }
    }
  }
}