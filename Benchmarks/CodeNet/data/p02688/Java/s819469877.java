import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),k=sc.nextInt();
    int count=0;
    boolean flg[]=new boolean[n];
    for(int i=0;i<k;i++){
      int d = sc.nextInt();
      for(int j=0;j<d;j++){
        flg[sc.nextInt()-1] = true;
      }
    }
    for(int i=0;i<n;i++){
      if(!flg[i]){count++;}
    }
    pl(count+"");
  }

  public static int aa(int n){
    if(n>0){return 1;}
    return 0;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
