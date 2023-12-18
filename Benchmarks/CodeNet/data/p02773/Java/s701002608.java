import java.util.Scanner;
import java.util.*;
class Main{ //start class
	public static void main(String[] args) { // start main
		Scanner scan = new Scanner(System.in);
      	String n = scan.next();
      	List<String> list = new ArrayList<>();
      	Set<String> set = new HashSet<>();
    	while(scan.hasNext()) {
          String str = scan.next();
          list.add(str);
          set.add(str);
        }
      	int max = 0;
      	List<String> maxStrList = new ArrayList<>();
      	for(String str : set) {
          int cnt = 0;
          for(String listStr : list) {
            if(listStr.equals(str)) {
              cnt++;
            }
          }
          if(max < cnt) {
            maxStrList.clear();
            max = cnt;
		    maxStrList.add(str);
          } else if(max == cnt) {
            maxStrList.add(str);
          }
        }
      	Collections.sort(maxStrList);
      	for(String s : maxStrList) {
          System.out.println(s);
        }
    }
}