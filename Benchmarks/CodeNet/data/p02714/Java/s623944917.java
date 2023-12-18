import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();sc.nextLine();
    String str = sc.nextLine();
    int count=0;
    boolean flg[]=new boolean[3];
    for(int i=0;i<len-2;i++){
      flg[get(str.charAt(i))]=true;
      for(int j=i+1;j<len-1;j++){
        if(flg[get(str.charAt(j))]){continue;}
        flg[get(str.charAt(j))]=true;
        for(int k=j+1;k<len;k++){
          if(j-i==k-j){continue;}
          if(flg[get(str.charAt(k))]){continue;}
          count++;
        }
        flg[get(str.charAt(j))]=false;
      }
      flg[get(str.charAt(i))]=false;
    }
    pl(count+"");
  }

  public static int get(char a){
    if(a=='R'){
      return 0;
    }else if(a=='G'){
      return 1;
    }
    return 2;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
