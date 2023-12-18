import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int x  = sc.nextInt();
    int y  = sc.nextInt();
    int flg = 0;
    double menmin = 0.0;
    double menmin2 = 0.0;
    double men1 = 0.0;
    double men2 = 0.0;
    if(x==0|x==W){
      men1 = W*y;
      men2 = W*(H-y);
        if(men1>men2) menmin = men2;
        else menmin = men1;
    }else if(y==0|y==H){
      men1 = x*H;
      men2 = (W-x)*H;
      if(men1>men2) menmin = men2;
        else menmin = men1;
    }else{
      men1 = W*y;
      men2 = W*(H-y);
      if(men1>men2) menmin = men2;
        else menmin = men1;
      men1 = x*H;
      men2 = (W-x)*H;
      if(men1>men2) menmin2 = men2;
        else menmin2 = men1;
      if(menmin<menmin2) menmin = menmin2;
      else if(menmin==menmin2) flg = 1;
    }
    System.out.println(menmin+" "+flg);
  } 
}