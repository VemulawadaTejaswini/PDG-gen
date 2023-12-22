import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long a=0,b=0;
    for(;;b++){
      long bf = five(b);
      a = isfive(bf+x);
      if(a!=-1){break;}
      a = isfive(-bf+x);
      if(a!=-1){b*=-1;break;}
    }
    pl(a+" "+b);
  }

  public static long five(long a){
    long k=a*a;
    return k*k*a;
  }

  public static long isfive(long a){
    for(long i=0;;i++){
      long k=five(i);
      if(k==a){
        return i;
      }else if(k>a){
        break;
      }
    }
    return -1;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
