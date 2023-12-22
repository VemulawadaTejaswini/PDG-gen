import java.util.Scanner;

public class Main{
  public static void main(String args[]){
      int a=1,b=1;
      while(a!=0||b!=0){
    Scanner sc = new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
int i,j;

 for(i=0;i<a;i++){
    for(j=0;j<b;j++){
        if((j+i)%2==0){
            System.out.print("#");
        }else System.out.print(".");
    }
   if(b==0) continue;
   else System.out.println("");
 }
 System.out.println("");
}
}
}
