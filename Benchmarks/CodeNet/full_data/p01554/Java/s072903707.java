import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayDeque<String> list = new ArrayDeque<String>();
		
		for(int i=0;i<n;i++) list.push(sc.next());
		
		int m = sc.nextInt();
		String s = "";
		boolean flag = false;
		for(int i=0;i<m;i++){
			s = sc.next();
			if(list.contains(s)==true){
				if(flag==false){
					System.out.println("Opend by " + s);
					flag = true;
				}else{
					System.out.println("Closed by " + s);
					flag = false;
				}
			}else{
				System.out.println("Unknown " + s);
			}
		}
	
	}	
}