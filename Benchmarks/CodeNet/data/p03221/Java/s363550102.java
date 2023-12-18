import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
        static int  PRE,CITY ;
        public static void main (String args[]) throws Exception{
            Scanner sc = new Scanner(System.in);
            PRE = sc.nextInt();
            CITY = sc.nextInt();
            Map<Integer,Integer>  inputMap = new LinkedHashMap<>();
            TreeMap<Integer, LinkedList<Integer>>  treeMap = new TreeMap<>();
            for(int i = 0; i<CITY; i++){
            	int a = sc.nextInt();
            	int b = sc.nextInt();
            	inputMap.put(b, a);
            	if (!treeMap.containsKey(a)) {
            		LinkedList<Integer> linkedList = new LinkedList<>();
            		linkedList.add(b);
            		treeMap.put(a, linkedList);
				}else {
					treeMap.get(a).add(b);
				}
            }
            for (Integer key : treeMap.keySet()) {
            	Collections.sort(treeMap.get(key));
			}
            for (Map.Entry<Integer, Integer> entry : inputMap.entrySet()) {
            	 String p = String.format("%06d", entry.getValue());
            	 String c = String.format("%06d", treeMap.get(entry.getValue()).indexOf(entry.getKey())+1);
                 System.out.println(p+""+c);
            }
            sc.close();
        }
    }