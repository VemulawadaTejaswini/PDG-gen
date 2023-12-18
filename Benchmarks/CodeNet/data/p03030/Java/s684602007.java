import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   	int n = sc.nextInt();
    String shops[] = new String[n];
    String shops2[] = new String[n];
    String names[] = new String[n];
    String points[] = new String[n];
    String[] stack;
    String[] stack2;
    List<Integer> pList;
    Map<String, Integer> rank = new HashMap<String, Integer>();
    int start;
    int end;
    
    for(int i = 0;i < n;i++){
      names[i] = sc.next();
      points[i] = sc.next();
      shops[i] = names[i] + " " + points[i] + " ";
      shops2[i] = shops[i];
      rank.put(names[i] + " " + points[i] + " ",i + 1);
    }
    
    Arrays.sort(shops2);
    
    stack = shops2[0].split(" ");
    names[0] = stack[0];
    pList =  new ArrayList<Integer>();
    pList.add(Integer.parseInt(stack[1]));
    start = 0;
    
    for(int i = 1;i < n; i++) {
      	stack2 = shops2[i].split(" ");
      	names[i] = stack2[0];
    	if(stack[0].equals(stack2[0]) && i != n-1){
        	pList.add(Integer.parseInt(stack2[1]));
        } else if(i != n-1){
          Collections.sort(pList);
          for(int j = 0; j < i - start;j++) points[start + j] = String.valueOf(pList.get(i - start -j -1));
          start = i;
          pList =  new ArrayList<Integer>();
          pList.add(Integer.parseInt(stack2[1]));
        } else if(i == n-1){
          pList.add(Integer.parseInt(stack2[1]));
          Collections.sort(pList);
          for(int j = 0; j < i + 1 - start;j++) {
            points[start + j] = String.valueOf(pList.get(i - start -j));
            
          }
        }
      	stack = stack2;
    }
	
    for(int i = 0;i < n;i++){
      System.out.println(rank.get(names[i] + " " + points[i] + " "));
    }
    
  }
}
