import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int areaTotal = sc.nextInt();
		 int cityTotal = sc.nextInt();
		 
		 int array[][] = new int[cityTotal][2]; 
		 int arraySore[][] = new int[cityTotal][2]; 
		 int year=0;
		 int area=0;
		 for(int i=0;i<cityTotal;i++) {
			 area = sc.nextInt();
			 year = sc.nextInt();
			 array[i][0]=area;
			 array[i][1]=year;
			 arraySore[i][0]=area;
			 arraySore[i][1]=year;
		 }
		 sort(arraySore, new int[] {0,1});   //先根据第一列比较，若相同则再比较第二列  
		 int areaValue=0;
		 int yearVlaue=0;
		 int areaIndex=0;
		 
		 int soreAreaValue=0;
		 int soreYearVlaue=0;
		 boolean flag = true;
	     for (int i = 0; i < array.length; i++) { 
	    	 flag=true;
	    	 areaValue = array[i][0];
	    	 yearVlaue = array[i][1];
	    	 for(int j = 0; j < arraySore.length&&flag; j++) {
	    		 areaIndex=0;
	    		 soreAreaValue = arraySore[j][0];
	    		 if(areaValue==soreAreaValue)
		    		 for(int z = j; z < arraySore.length; z++) {
		    			 areaIndex++;
		    			 soreYearVlaue=arraySore[z][1];
		    			 if(yearVlaue==soreYearVlaue) {
		    				 flag=false;
		    				 break;
		    			 }
			    	 }
	    	 	}
	    	 System.out.println(((1000000+areaValue)+"").substring(1)+((1000000+areaIndex)+"").substring(1));
	    	 }
	}
	 public static void sort(int[][] ob, final int[] order) { 
		
         Arrays.sort(ob, new Comparator<Object>() {    
             public int compare(Object o1, Object o2) {    
                 int[] one = (int[]) o1;    
                 int[] two = (int[]) o2;    
                 for (int i = 0; i < order.length; i++) {    
                     int k = order[i];    
                     if (one[k] > two[k]) {    
                         return 1;    
                     } else if (one[k] < two[k]) {    
                         return -1;    
                     } else {    
                         continue;  
                     }    
                 }    
                 return 0;    
             }    
         });   
     }
}