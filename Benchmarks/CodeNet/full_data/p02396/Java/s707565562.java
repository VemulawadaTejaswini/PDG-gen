import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int y=1;
    for(int i=1;y=0;i++){
      int x=sc.nextInt();
      if(x!=0){
        System.out.printf("case %d %d\n",i,x);
      }else{
        y=0;
      }
    }
  }
}