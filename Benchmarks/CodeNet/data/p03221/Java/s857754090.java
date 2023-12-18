import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
        static int  PRE,CITY ;
        static int arr[][];
        public static void main (String args[]) throws Exception{
            Scanner sc = new Scanner(System.in);
            PRE = sc.nextInt();
            CITY = sc.nextInt();
            arr = new int[CITY][2];
            TreeMap<Integer, LinkedList<Integer>>  treeMap = new TreeMap<>();
            for(int i = 0; i<CITY; i++){
            	arr[i][0] = sc.nextInt();
            	arr[i][1] = sc.nextInt();
            	if (!treeMap.containsKey(arr[i][0])) {
            		LinkedList<Integer> linkedList = new LinkedList<>();
            		linkedList.add(arr[i][1]);
            		treeMap.put(arr[i][0], linkedList);
				}else {
					treeMap.get(arr[i][0]).add(arr[i][1]);
				}
            }
            for (Integer key : treeMap.keySet()) {
            	Collections.sort(treeMap.get(key));
			}
            for (int i = 0; i < arr.length; i++) {
            	 String p = String.format("%6s", arr[i][0]);
            	 String c = String.format("%6s", treeMap.get(arr[i][0]).indexOf(arr[i][1])+1);
                 p = p.replaceAll("\\s","0");
                 c = c.replaceAll("\\s","0");
                 System.out.println(p+""+c);
			}
            sc.close();
        }
    }