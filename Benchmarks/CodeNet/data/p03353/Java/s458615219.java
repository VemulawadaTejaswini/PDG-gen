import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		String s = scanner.next();
		int k = Integer.parseInt(scanner.next());
		
		ArrayList<String> sortList=new ArrayList<String>();
		String subs;
		
		int n = s.length();
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++){
				subs = s.substring(j-1, i+j-1);
				insertList(sortList,subs);
			}
		}		
		System.out.println(sortList.get(k-1));		
	}
	
	public static void insertList(ArrayList<String> sortList, String subs){
		int size = sortList.size();
		if(size==0){
			sortList.add(subs);
			return;
		}
		for(int i =0; i<size; i++){			
			if(sortList.get(i).compareTo(subs)>0){
				sortList.add(i, subs);
				return;
			}else if(sortList.get(i).compareTo(subs)==0){
				return;
			}
		}
		sortList.add(subs);
	}
	
	
}