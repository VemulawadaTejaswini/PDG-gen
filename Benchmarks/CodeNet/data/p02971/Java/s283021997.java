import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int max=0, maxnum=0;
    int max2=0;
    for(int x=0; x<num; x++){
      int in=scan.nextInt();
      if(max<=in && max2<=in && max!=in){
        max=in;
        maxnum=x;
      }else if(max>=in && max2<=in){
        max2=in;
      }
    }
    for(int x=0; x<num; x++){
      if(maxnum!=x){
        System.out.println(max);
      }else{
        System.out.println(max2);
      }
    }
  }
}