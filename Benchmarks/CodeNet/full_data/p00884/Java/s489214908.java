// Membership Management
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			String[][] data = new String[n][];
			for(int i=0;i<n;i++){
				String str = scanner.next().replace(".", "");
				data[i] = str.split("[:,]");
			}
			Queue<String> queue = new LinkedList<String>();
			Set<String> result = new HashSet<String>();
			queue.add(data[0][0]);
			while(!queue.isEmpty()){
				String group = queue.poll();
				for(int i=0;i<n;i++){
					if(data[i][0].equals(group)){
						for(int j=1;j<data[i].length;j++){
							for(int k=0;k<n;k++){
								if(data[i][j].equals(data[k][0])){
									queue.add(data[i][j]);
									break;
								} else if(k == n-1){
									result.add(data[i][j]);
								}
							}
						}
					}
				}
			}
			System.out.println(result.size());
		}
		scanner.close();
	}
}