import java.util.Scanner;
  
class Main{
 public static void main(String[] arge){
    
 Scanner sc=new Scanner(System.in);
  
 int w=sc.nextInt();
 int h=sc.nextInt();
 int x=sc.nextInt();
 int y=sc.nextInt();
 int r=sc.nextInt();


if((x+r<=w && x-r>=0) && (y+r<=h && y-r>=0)){

System.out.println("Yes");}

else{
System.out.println("No");}

}}


