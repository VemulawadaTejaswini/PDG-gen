import java.util.*;
class Main{
  static final long mmod = 1000000007;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0,len=str.length();
    for(int i=0;i<len-3;i++){
      int k = Integer.parseInt(str.substring(i,i+4))%2019;
      if(k==0){count++;}
      for(int j=i+4;j<len;j++){
        k=(k*10+Integer.parseInt(str.substring(j,j+1)))%2019;
        if(k==0){count++;}
      }
    }
    pl(count+"");
  }


  public static long get(long a){
    return a%mmod;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
