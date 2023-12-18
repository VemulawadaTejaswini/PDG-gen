import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0,len=str.length();
    int i=0,j=3,k=0;
    boolean flg=true;
    while(j<len){
      if(flg){
        k=Integer.parseInt(str.substring(i,j));
      }else{
        k=(k*10+Integer.parseInt(str.substring(j,j+1)))%2019;
      }
      if(k==0){
        count++;
        i=j;
        j=i+3;
      }else{
        j++;
      }
    }
    pl(count+"");
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
