import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int dice=scan.nextInt();
    int in;
    double par[]=new double[num];
    for(int x=0; x<num; x++){
      in=scan.nextInt();
      if(in==1){
        par[x]=1;
      }else{
        par[x]=(1.0+in)/2.0;
      }
    }
    double max=0;
    double spare=0;
    for(int x=0; x<dice; x++){
      max+=par[x];
    }
    spare=max;
    for(int x=0; x<num-dice; x++){
      spare=spare-par[x]+par[x+dice];
      if(max<spare){
        max=spare;
      }
    }
    System.out.println(max);
  }
}