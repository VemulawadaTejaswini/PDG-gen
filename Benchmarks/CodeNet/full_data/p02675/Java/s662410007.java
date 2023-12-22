import java.util.Scanner;
class Main{
  public static void main(String args[]){
  Scanner input =new Scanner(System.in);
    int num=input.nextInt();
  if(num%10==2||num%10==4||num%10==5||num%10==7||num%10==9){
  System.out.pritnln("hon");
  }
  else if(num%10==0||num%10==1||num%10==6||num%10==8){
  System.out.pritnln("pon");
  }
  
  else if(num%10==3){
  System.out.pritnln("bon");
  }
  }}
