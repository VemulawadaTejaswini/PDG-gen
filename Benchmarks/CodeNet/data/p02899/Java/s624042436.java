import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int mem[]=new int[num];
    int come[]=new int[num];
    for(int a=0;a<num;a++){
      mem[a]=scan.nextInt();
    }
    for(int a=1;a<num+1;a++){
      for(int b=0;b<num;b++){
        if(mem[b]==a){
          come[a-1]=b+1;
        }
      }
    }
    for(int a=0;a<num;a++){
      if(a>0){
        System.out.print(" ");
      }
      System.out.print(come[a]);
    }
  }
}