import java.util.Scanner;
class Main{
    public static void main(String[] args){
    String str = new Scanner(System.in).nextLine();
    String[] strs = str.split(" ");
    int W = Integer.parseInt(strs[0]);
    int H = Integer.parseInt(strs[1]);
    int x = Integer.parseInt(strs[2]);
    int y = Integer.parseInt(strs[3]);
    int r = Integer.parseInt(strs[4]);
    if(x<r || x+r>W || y<r || y+r>H) {
      System.out.println("No");
    }else {
      System.out.println("Yes");
    }
  }
    }

