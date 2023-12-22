import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();

    while (sn.hasNextLine()) {
      String str = sn.nextLine();
      list.add(Integer.parseInt(str));
    }
    
    Map<String, List<String>> grp = list.stream().collect(Collectors.groupingBy(s -> s));
    
    System.out.println("AC" + " x "  +  grp.getOrDefault("AC", Arrays.emptyList()).size() );
    System.out.println("WA" + " x "  +  grp.getOrDefault("WA", Arrays.emptyList()).size() );
    System.out.println("TLE" + " x "  +  grp.getOrDefault("TLE", Arrays.emptyList()).size() );
    System.out.println("RE" + " x "  +  grp.getOrDefault("RE", Arrays.emptyList()).size() );

  }
}