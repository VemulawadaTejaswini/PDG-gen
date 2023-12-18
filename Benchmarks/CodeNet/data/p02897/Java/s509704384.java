import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int tall=scan.nextInt();
    int[] talls=new int[num];
    int can=0;
    for(int a=0;a<num;a++){
      talls[a]=scan.nextInt();
      if(talls[a]>=tall){
        can++;
      }
    }
    System.out.println(can);
  }
}