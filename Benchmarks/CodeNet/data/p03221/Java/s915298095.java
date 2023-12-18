import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int aTotal = sc.nextInt();
		 int cTotal = sc.nextInt();
		 
		 int arr[][] = new int[cTotal][2]; 
		 int year=0;
		 int area=0;
		 Map map = new HashMap();
		 List list=null;
		 
		 for(int i=0;i<cTotal;i++) {
			 list= new ArrayList();
			 area = sc.nextInt();
			 year = sc.nextInt();
			 arr[i][0]=area;
			 arr[i][1]=year;
			 if(map.get(area)!=null) {
				 list= (List) map.get(area);
			 }
			 list.add(year); 
			 map.put(area, list);
		 }
		 int areaValue=0;
		 int yearVlaue=0;
		 int index=0;
		 int lvY=0;
	     for (int i = 0; i < arr.length; i++) {
	    	 index=0;
	    	 areaValue= arr[i][0];
	    	 yearVlaue = arr[i][1];
	    	 
	    	 list = (List) map.get(areaValue);
	    	 Collections.sort(list);
	    	 for(int j=0;j<list.size();j++) {
	    		 lvY=(int) list.get(j);
	    		 index++;
	    		 if(lvY==yearVlaue) {
	    			break; 
	    		 }
	    	 }
	    	 System.out.println(((1000000+areaValue)+"").substring(1)+((1000000+index)+"").substring(1));
	    	 }
	}
}