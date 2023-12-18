import java.util.*;
 
public class Main {
	
	private static List<Integer> group1List = new ArrayList<Integer>();
	private static List<Integer> group2List = new ArrayList<Integer>();
	private static List<Integer> group3List = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		createGroup();
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] inArray = in.split(" ");
		int a = Integer.parseInt(inArray[0]);
		int b = Integer.parseInt(inArray[1]);
		
		if ((isGroup1(a,b)) || (isGroup2(a,b)) || (isGroup3(a,b))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			
		}
		
		
		sc.close();
	}
	
	private static void createGroup() {
		int[] group1 = {1,3,5,7,8,10,12};
		int[] group2 = {4,6,9,11};
		int[] group3 = {2};
		
		
		for (int i = 0; i < group1.length; i++){
			Integer in1 = new Integer(group1[i]);
			group1List.add(in1);
		}
		for (int j = 0; j < group2.length; j++) {
			Integer in2 = new Integer(group2[j]);
			group2List.add(in2);
		}
		for (int k = 0; k < group3.length; k++) {
			Integer in3 = new Integer(group3[k]);
			group3List.add(in3);
		}
	}
	
	private static boolean isGroup1(int a , int b ) {
		Integer ao = new Integer(a);
		Integer bo = new Integer(b);
		if ((group1List.contains(ao)) && (group1List.contains(bo))){
			return true;
		}
		return false;
	}
	private static boolean isGroup2(int a , int b ) {
		Integer ao = new Integer(a);
		Integer bo = new Integer(b);
		if ((group2List.contains(ao)) && (group2List.contains(bo))){
			return true;
		}
		return false;
	}
	
	private static boolean isGroup3(int a , int b ) {
		Integer ao = new Integer(a);
		Integer bo = new Integer(b);
		if ((group3List.contains(ao)) && (group3List.contains(bo))){
			return true;
		}
		return false;
	}
	
	
}
