import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=""+sc.nextInt();
		int k=sc.nextInt();

	
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<k;i++) {
			al.add(sc.nextInt());
		}
		ArrayList<String> alList=new ArrayList<>();
		for(int i=0;i<10;i++) {
			if(!al.contains(i)) {
				
				alList.add(""+i);
			}
		}Collections.sort(alList);
		

	String sb="";
		
		int i=0;
	while(i<n.length()) {
		for(String s:alList) {
			if(Integer.parseInt(""+s)>=Integer.parseInt(""+n.charAt(i))){
				sb+=s;
			i++;
			break;
			}
		}
		
	
	
		
}
	System.out.println(sb);
		
		
	}
	
	static void readArray(int[] arr,Scanner sc) { 
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	
	

}
