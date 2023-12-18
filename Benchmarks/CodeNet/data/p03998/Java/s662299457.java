import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
        String ss[] = {sc.next(),sc.next(),sc.next()};
      	int counts[] = {0,0,0};
      	boolean game = true;
      	int istack;
      	char cstack;
      	Map<Character, Integer> pMap1 = new HashMap<Character, Integer>();
		pMap1.put('a',0);
      	pMap1.put('b',1);
      	pMap1.put('c',2);
      	Map<Integer,Character> pMap2 = new HashMap<Integer,Character>();
		pMap2.put(0,'A');
      	pMap2.put(1,'B');
      	pMap2.put(2,'C');
      	
      	cstack = ss[0].charAt(0);
      	counts[0]++;
      	istack = istack = pMap1.get(cstack);
       	while(game){
          	if(counts[istack] == ss[istack].length()) {
              System.out.println(pMap2.get(istack));
              game = false;
            } else{            	              	
              	cstack = ss[istack].charAt(counts[istack]); 
                counts[istack]++;
              	istack = pMap1.get(cstack);         }
        }
   }
}
