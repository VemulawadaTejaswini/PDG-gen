import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
        static int  PRE,CITY ;
        static int arr[][];
        public static void main (String args[]) throws Exception{
            Scanner sc = new Scanner(System.in);
            PRE = sc.nextInt();
            CITY = sc.nextInt();
            arr = new int[CITY][2];
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i<CITY; i++){
            	arr[i][0]= sc.nextInt();
            	arr[i][1] = sc.nextInt();
            	if (!list.contains(arr[i][0])) {
					list.add(arr[i][0]);
				}
            }
            Collections.sort(list); 
            for(int t = 0; t<list.size(); t++){
	            ArrayList<Integer> tempList = new ArrayList<Integer>();
	            tempList.clear();
	            for(int j = 0;j<arr.length;j++){
	            	if (arr[j][0] == list.get(t)) {
	            		tempList.add(arr[j][1]);
					}
	            }
	            Collections.sort(tempList);
	            for(int j = 0;j<arr.length;j++){
	            	if (arr[j][0] == list.get(t)) {
	            		arr[j][1] = tempList.indexOf(arr[j][1])+1;
					}
	            }
            }
            for (int i = 0; i < arr.length; i++) {
            	 String p = String.format("%6s", arr[i][0]);
            	 String c = String.format("%6s", arr[i][1]);
                 p = p.replaceAll("\\s","0");
                 c = c.replaceAll("\\s","0");
                 System.out.println(p+""+c);
			}
            sc.close();
        }
        
    }