import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		String[] line = new String[m];
		sc.nextLine();
		
		for(int i = 0; i < m; i++){
			line[i] = sc.nextLine().replaceAll(" ", "");
		}
		for(int i = 0; i < m; i++){
			char[] dots = new char[line[i].length()];
			for(int j = 0; j < line[i].length(); j++){
				dots[j] = line[i].charAt(j);
			}
			ArrayList<String> trainList = new ArrayList<String>();
			String before = null;
			String rbefore;
			String after = null;
			String rafter;
			for(int j = 0; j < dots.length - 1; j++){
				before = before + dots[j];
				after = null;
				if(j == 0){
					before = before.replaceAll("null", "");
				}
				for(int k = j + 1; k < dots.length; k++){
					after = after + dots[k];
				}
				after = after.replaceAll("null", "");
				if(!trainList.contains(before + after)){
					trainList.add(before + after);
				}
				if(!trainList.contains(after + before)){
					trainList.add(after + before);
				}
				StringBuffer beforesb = new StringBuffer(before);
				StringBuffer aftersb = new StringBuffer(after);
				rbefore = beforesb.reverse().toString();
				rafter = aftersb.reverse().toString();
				if(!trainList.contains(before + rafter)){
					trainList.add(before + rafter); 
				}
				if(!trainList.contains(rafter + before)){
					trainList.add(rafter + before);
				}
				if(!trainList.contains(rbefore + after)){
					trainList.add(rbefore + after);
				}
				if(!trainList.contains(after + rbefore)){
					trainList.add(after + rbefore);
				}
				if(!trainList.contains(rbefore + rafter)){
					trainList.add(rbefore + rafter);
				}
				if(!trainList.contains(rafter + rbefore)){
					trainList.add(rafter + rbefore);
				}
			}
			System.out.println(trainList.size());
		}
		
	}

}