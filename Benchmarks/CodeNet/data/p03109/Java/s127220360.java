import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    String str=scan.next();
    int y=Integer.parseInt(str.substring(0,4));
    int m=Integer.parseInt(str.substring(6,8));
    int d=Integer.parseInt(str.substring(9,11));
    if((y>2019)||((y=2019)&&(m>=5))){
      System.out.println("TBD");
    }else{
      System.out.println("Heisei");
    }
  }
}