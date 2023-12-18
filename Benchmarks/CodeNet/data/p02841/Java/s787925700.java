import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int d = sc.nextInt();
    boolean flag = false;
    
    if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
      if(d==31){
        flag=true;
      }
    }
    
    if(m==4 || m==6 || m==9 || m==11){
      if(d==30){
        flag=true;
      }
    }
    
    if(m==2 && d==28){
      flag=true;
    }
    
    if(flag){
      System.out.println(1);
    }else{
      System.out.println(0);
    }
    
  }
}
