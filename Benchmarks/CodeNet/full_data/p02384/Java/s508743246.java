import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Dice d = new Dice(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
    int q = scanner.nextInt();
    for(int i=0;i<q;i++){
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      System.out.println(d.AnswerRight(a,b));
    }

  }
}

class Dice{
  int top,down,right,left,up,bottom;
  int b_top,b_down,b_right,b_left,b_up,b_bottom;

  Dice(int d1,int d2,int d3,int d4,int d5,int d6){
    this.top=  d1;
    this.down =  d2;
    this.right =  d3;
    this.left =  d4;
    this.up =  d5;
    this.bottom =  d6;

    this.b_top = this.top;
    this.b_down = this.down;
    this.b_right = this.right;
    this.b_left = this.left;
    this.b_up = this.up;
    this.b_bottom = this.bottom;

  }

  public int AnswerRight(int a,int b){

    if((a==4&&b==2)||(a==2&&b==3)||(a==3&&b==5)||(a==5&&b==4)){
      return 1;
    }

    if((a==4&&b==6)||(a==6&&b==3)||(a==3&&b==1)||(a==1&&b==4)){
      return 2;
    }

    if((a==1&&b==2)||(a==2&&b==6)||(a==6&&b==5)||(a==5&&b==1)){
      return 3;
    }

    if((a==2&&b==1)||(a==1&&b==5)||(a==5&&b==6)||(a==6&&b==2)){
      return 4;
    }

    if((a==6&&b==4)||(a==4&&b==1)||(a==1&&b==3)||(a==3&&b==6)){
      return 5;
    }

    if((a==2&&b==4)||(a==4&&b==5)||(a==5&&b==3)||(a==3&&b==2)){
      return 6;
    }

    return 0;

  }

  public void PrintTop(){
    System.out.println(this.top);
  }



  public void E(){
    this.top = this.b_left;
    this.down =  this.b_down;
    this.right =  this.b_top;
    this.left =  this.b_bottom;
    this.up =  this.b_up;
    this.bottom =  this.b_right;

    this.b_top = this.top;
    this.b_down = this.down;
    this.b_right = this.right;
    this.b_left = this.left;
    this.b_up = this.up;
    this.b_bottom = this.bottom;
  }

  public void W(){
    this.top = this.b_right;
    this.down =  this.b_down;
    this.right =  this.b_bottom;
    this.left =  this.b_top;
    this.up =  this.b_up;
    this.bottom =  this.b_left;

    this.b_top = this.top;
    this.b_down = this.down;
    this.b_right = this.right;
    this.b_left = this.left;
    this.b_up = this.up;
    this.b_bottom = this.bottom;
  }

  public void N(){
    this.top = this.b_down;
    this.down =  this.b_bottom;
    this.right =  this.b_right;
    this.left =  this.b_left;
    this.up =  this.b_top;
    this.bottom =  this.b_up;

    this.b_top = this.top;
    this.b_down = this.down;
    this.b_right = this.right;
    this.b_left = this.left;
    this.b_up = this.up;
    this.b_bottom = this.bottom;
  }

  public void S(){
    this.top = this.b_up;
    this.down =  this.b_top;
    this.right =  this.b_right;
    this.left =  this.b_left;
    this.up =  this.b_bottom;
    this.bottom =  this.b_down;

    this.b_top = this.top;
    this.b_down = this.down;
    this.b_right = this.right;
    this.b_left = this.left;
    this.b_up = this.up;
    this.b_bottom = this.bottom;
  }
}

