import java.util.Scanner;
import java.lang.Math;
public class Main{
public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
int row=scan.nextInt();
int col=scan.nextInt(),total=0;
int pro=Math.round(row/2);
for (int i=0;i<col;i++){
  if (row%2==0){
                total+=pro;}
  else{
    total+=(pro-1);
  }
}
  System.out.println(total);
}
}