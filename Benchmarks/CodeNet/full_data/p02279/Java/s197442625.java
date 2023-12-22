import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		//?????¨????????¢???????????????????????§????????????
		//Map<?????????????????????, ?????????????????????> ????????????????????????????????§?????????????????????????????¨??????
		Map<Integer, Integer> parentMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> depthMap = new HashMap<Integer, Integer>();
		int depth = 0;
		
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			//root?????????
			if(i == 0){
				int node = Integer.parseInt(str[0]);
				int m = Integer.parseInt(str[1]);
				int k = 2;
				sb.append("node " + node + ": parent = -1" + ", depth = 0" + ", root, [");
				for(int j = 0; j < m; j++){
					parentMap.put(Integer.parseInt(str[k]), node);
					depthMap.put(Integer.parseInt(str[k]), (depth + 1));
					if(j == m - 1){
						sb.append(Integer.parseInt(str[k]) + "]" + "\n");
						break;
					}
					sb.append(Integer.parseInt(str[k]) + ",");
					k++;
				}
			} else if(str.length != 2){
				int node = Integer.parseInt(str[0]);
				int m = Integer.parseInt(str[1]);
				int k = 2;
				sb.append("node " + node + ": parent = " +  parentMap.get(node) +  ", depth = " + depthMap.get(node) + ", internal node, [");
				for(int j = 0; j < m; j++){
					parentMap.put(Integer.parseInt(str[k]), node);
					depthMap.put(Integer.parseInt(str[k]), (depthMap.get(node) + 1));
					if(j == m - 1){
						sb.append(Integer.parseInt(str[k]) + "]" + "\n");
						break;
					}
					sb.append(Integer.parseInt(str[k]) + ",");
					k++;
				}
			} else{
				int node = Integer.parseInt(str[0]);
				sb.append("node " + node + ": parent = " +  parentMap.get(node) +  ", depth = " + depthMap.get(node) + ", leaf, []" + "\n");
			}
		}
		System.out.print(sb.toString());
	}
}
 