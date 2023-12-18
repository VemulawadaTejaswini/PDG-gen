import java.util.*;
public class Main{
  public static void main (String[] args){
    String [] arr_1 = new String [];
    for (String str : arr_1){ System.out println(str);}
    List<String> list = new ArrayList<String>(Arrays.asList(arr_1));
    list.remove(("0B")||("1B"));
    String[] arr_2 = (String[]) list.toArray(new String [list.size()]);
    for (String str :arr_2) {
      System.out.println(str);
    }
  }
}