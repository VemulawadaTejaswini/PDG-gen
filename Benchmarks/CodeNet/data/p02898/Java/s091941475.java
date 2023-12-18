import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int tall=scan.nextInt();
    int can=0;
    for(int a=0;a<num;a++){
      int talls=scan.nextInt();
      if(talls>=tall){
        can++;
      }
    }
    System.out.println(can);
  }
}