import java.awt.geom.*;
import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			HashSet<String> set = new HashSet<String>();
			for(int i = 0 ; i < n; i++){
				set.add(sc.next());
			}
			int m = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			boolean isclose = true;
			for(int i = 0 ; i < m; i++){
				String s = sc.next();
				if(set.contains(s)){
					if(isclose){
						isclose = false;
						sb.append("Opened by " + s + "\n");
					}
					else{
						isclose = true;
						sb.append("Closed by " + s + "\n");
					}
				}
				else{
					sb.append("Unknown " + s + "\n");
				}
			}
			System.out.print(sb.toString());
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}