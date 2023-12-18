import java.util.*;

class Main{
  public static void judge(String okikaeruyatu){
    wafter = w.replace(okikaeruyatu,"");
    wlenafter = wafter.length();
    if((wlen - wlenafter) % 2 == 1){
      ugly += 1;
    }
  }
  public static void main(String[] args){
    int ugly = 0;
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    int wlen = w.length();

    String wafter;
    int wlenafter;

    judge("a");judge("b");judge("c");
    judge("d");judge("e");judge("f");
    judge("g");judge("h");judge("i");
    judge("j");judge("k");judge("l");
    judge("m");judge("n");judge("o");
    judge("p");judge("q");judge("r");
    judge("s");judge("t");judge("u");
    judge("v");judge("w");judge("x");
    judge("y");judge("z");
    if(ugly == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
