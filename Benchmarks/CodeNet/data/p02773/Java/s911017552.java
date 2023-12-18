import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int n = sc.nextInt();
      	int count = 0;
      	int max = 1;
      	int istack;
      	Integer igstack; 
      	String sstack;
        List wList = new ArrayList<String>();
      	List pList = new ArrayList<Integer>();
      	List aList = new ArrayList<String>();
      	Map<String,Integer> wMap = new HashMap<String,Integer>();
      
      	for(int i = 0;i < n;i++){
          sstack = sc.next();
          if(!wList.contains(sstack)) {
            wList.add(sstack);
            pList.add(1);
            wMap.put(sstack,count);
            count++;
          } else {
            igstack = (Integer)pList.get((Integer)wMap.get(sstack).intValue());
          	istack = igstack.intValue() + 1;
            pList.set((Integer)wMap.get(sstack).intValue(),istack);
            if(istack > max) max = istack;
          }
        }
      	for(int i = 0;i < count;i++){
          	igstack = (Integer)pList.get(i);
        	if(igstack.intValue() == max) aList.add((String)wList.get(i));        	
        }
      	Collections.sort(aList);
      	for(int i = 0;i < aList.size();i++){
          	System.out.println(aList.get(i));
        }      	
        
	}
}
