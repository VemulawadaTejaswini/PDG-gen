import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0,len=str.length();
    for(int i=0;i<len-3;i++){
      int k=Integer.parseInt(str.substring(i,i+4))%2019;
      for(int j=i+4;j<len;j++){
        k=(k*10+Integer.parseInt(str.substring(j,j+1)))%2019;
        if(k==0){
          count++;
          i=j-1;
          break;
        }
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
