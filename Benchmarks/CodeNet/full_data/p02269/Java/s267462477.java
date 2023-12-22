import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int n = sc.nextInt();
		String sta;
		String wo;
		for (int i=0; i<n; i++){
			sta = sc.next();
			wo = sc.next();
			if(sta.equals("insert")){
				insert(list, wo);
			}else{
				find(list, wo);
			}
		}		
	}
	
	public static void insert(List<String> list, String sta){
		list.add(sta);
	}
	
	public static void find(List<String> list, String wo){
		if(list.contains(wo)==true){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}

