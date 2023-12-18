import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		String s = scanner.next();
		int k = Integer.parseInt(scanner.next());
		
		ArrayList<String> sortList=new ArrayList<String>();
		int size =0;
		String subs;
		
		int n = s.length();
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++){
				subs = s.substring(j-1, i+j-1);		
				if(size==0){
					sortList.add(subs);
					size++;
				}else if(sortList.contains(subs)){
				}else{
					for(int m =0; m<size; m++){			
						if(sortList.get(m).compareTo(subs)>0){
							sortList.add(m, subs);
							size++;
							break;
						}else{
							if(m==size-1){
								sortList.add(subs);
								size++;
							}
						}
					}					
				}
			}
		}		
		System.out.println(sortList.get(k-1));		
	}	
}