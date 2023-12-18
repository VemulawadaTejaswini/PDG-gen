import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

private class poor{
  public static void main(String[] args){
    Scanner scan = new Scanner();
    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0;i < 3;i++)
    String str = scan.nextInt();
  }
  if(list.get(0) == list.get(1)){
   	if(list.get(0) != list.get(2)){
      System.out.println("poor");
    }
  }else if(list.get(0) == list.get(2)){
    if(list.get(0) != list.get(1)){
      System.out.println("poor");
    }
  }
}