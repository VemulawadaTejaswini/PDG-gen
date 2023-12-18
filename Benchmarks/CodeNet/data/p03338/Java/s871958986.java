import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String blank = sc.nextLine();
    String s = sc.nextLine();
    Set<String> front_set = new HashSet<>();
    Set<String> back_set = new HashSet<>();
    int max = 0;


    for(int i = 0; i < s.length()-1; i++){
      front_set.clear();
      back_set.clear();
      int cnt = 0;

      String front_str = s.substring(0, i+1);
      char[] front_ary = front_str.toCharArray();
      for(char c1 : front_ary){front_set.add(String.valueOf(c1));}
      /*//デバッグ
      System.out.println("front_ary:" + front_ary);
      for(String db1 : front_set){
        System.out.print(db1);
      }
      System.out.println("");*/


      String back_str = s.substring(i+1, s.length());
      char[] back_ary = back_str.toCharArray();
      for(char c2 : back_ary){back_set.add(String.valueOf(c2));}
      //デバッグ
      /*System.out.println("back_ary:" + back_ary);
      for(String db2 : back_set){
        System.out.print(db2);
      }
      System.out.println("");*/


      if(front_set.size() < back_set.size()){
        for(String ss : front_set){
          if(back_set.contains(ss)){cnt++;}
        }
      }else{
        for(String ss : back_set){
          if(front_set.contains(ss)){cnt++;}
        }
      }


      max = Math.max(max, cnt);
      /*System.out.println(max);
      System.out.println("-------------------------");*/
    }

    System.out.println(max);
  }
}
