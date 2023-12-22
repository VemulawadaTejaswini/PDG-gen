import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean[] cards = new boolean[54];
    int n = sc.nextInt(),num,i;
    String s;
    for(i = 0;i < 54;i++)cards[i] = false;
    for(i = 0;i < n;i++){
      s = sc.next();
      num = sc.nextInt();
      if(s.equals("S"))cards[i] = true;
      if(s.equals("H"))cards[12+i] = true;
      if(s.equals("C"))cards[12*2+i] = true;
      if(s.equals("D"))cards[12*3+i] = true;
    }
    for(i = 0;i < 12;i++){
      if(!cards[i])System.out.println("S " + (i+1));
    }
    for(;i < 12*2;i++){
      if(!cards[i])System.out.println("H " + (i+1-12));
    }
    for(;i < 12*3;i++){
      if(!cards[i])System.out.println("C " + (i+1-12*2));
    }
    for(;i < 12*3;i++){
      if(!cards[i])System.out.println("D " + (i+1-12*3));
    }
    sc.close();
  }
}

