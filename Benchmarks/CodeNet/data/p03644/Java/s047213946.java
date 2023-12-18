import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int answer =0;
    if(N<2){
      answer =1;
    }else if(N<4){
      answer=2;
    }else if(N<8){
      answer=4;
    }else if(N<16){
      answer=8;
    }else if(N<32){
      answer =16;
    }else if(N<64){
      answer=32;
    }else{
      answer=64;
    }
    System.out.println(answer);
    

      
  }
  

  
}