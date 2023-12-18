import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Map<String, Integer> map_blue = new LinkedHashMap<>();
    Map<String, Integer> map_red = new LinkedHashMap<>();
    int no = 0;
    int onlyblue = 0;
    int both = 0;
    int ans = 0;

    int n = sc.nextInt();
    String blank = sc.nextLine();
    for(int i = 0 ; i < n; i++){
      String s = sc.nextLine();
      map_blue.put(s, map_blue.getOrDefault(s, 0) + 1);
    }

    int m = sc.nextInt();
    blank = sc.nextLine();
    for(int i = 0 ; i < m; i++){
      String s = sc.nextLine();
      map_red.put(s, map_red.getOrDefault(s, 0) + 1);
    }

    outline:for(String s : map_blue.keySet()){
      for(String ss : map_red.keySet()){
        if(s.equals(ss)){
          onlyblue = 0;
          break outline;
        }else{
          onlyblue = Math.max(map_blue.get(s), onlyblue);
        }
      }
    }

    for(String s : map_blue.keySet()){
      for(String ss : map_red.keySet()){
        if(s.equals(ss) && map_blue.get(s) > map_red.get(ss)){
            int d = map_blue.get(s) - map_red.get(ss);
            both = Math.max(d, both);
        }
      }
    }

    ans = Math.max(both, Math.max(no, onlyblue));
    System.out.println(ans);
  }
}

/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String blank = sc.nextLine();
String s = sc.nextLine();
System.out.println();
System.exit(0)
*/
