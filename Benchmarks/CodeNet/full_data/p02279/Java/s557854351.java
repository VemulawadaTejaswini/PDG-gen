import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//Map<?????????????????????, ?????????????????????> ???????????????????????????????????¨?????????????????????????????????????????????
		Map<Integer, Integer> parentMap = new HashMap<Integer, Integer>();
		//Map<?????????????????????,???????????±???(depth)???+ 1>??????????????????????????????????????¨?????????????????±??????????????????
		Map<Integer, Integer> depthMap = new HashMap<Integer, Integer>();
		//????????????????????????????????????????±????????????????????´???????
		//??????????????????????????§??\???????????????????????????????????????????????????????????????????????????????´???????
		Map<Integer, StringBuffer> stringMap = new HashMap<Integer, StringBuffer>();

		int depth = 0;
		
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			//root?????????
			if(i == 0){
				StringBuffer sb = new StringBuffer();
				int node = Integer.parseInt(str[0]);
				int m = Integer.parseInt(str[1]);
				int k = 2;
				sb.append("node " + node + ": parent = " + -1 + ", depth = " + 0 + ", root, [");
				for(int j = 0; j < m; j++){
					parentMap.put(Integer.parseInt(str[k]), node);
					depthMap.put(Integer.parseInt(str[k]), (depth + 1));
					if(j == m - 1){
						sb.append(Integer.parseInt(str[k]) + "]" + "\n");
						stringMap.put( node, sb);
						break;
					}
					sb.append(Integer.parseInt(str[k]) + ", ");
					k++;
				}
				//internal root ?????????
			} else if(str.length != 2){
				StringBuffer sb = new StringBuffer();
				int node = Integer.parseInt(str[0]);
				int m = Integer.parseInt(str[1]);
				int k = 2;
				sb.append("node " + node + ": parent = " +  parentMap.get(node) +  ", depth = " + depthMap.get(node) + ", internal node, [");
				for(int j = 0; j < m; j++){
					parentMap.put(Integer.parseInt(str[k]), node);
					depthMap.put(Integer.parseInt(str[k]), (depthMap.get(node) + 1));
					if(j == m - 1){
						sb.append(Integer.parseInt(str[k]) + "]" + "\n");
						stringMap.put( node, sb);
						break;
					}
					sb.append(Integer.parseInt(str[k]) + ", ");
					k++;
				}
				//leaf?????????
			} else{
				StringBuffer sb = new StringBuffer();
				int node = Integer.parseInt(str[0]);
				sb.append("node " + node + ": parent = " +  parentMap.get(node) +  ", depth = " + depthMap.get(node) + ", leaf, []" + "\n");
				stringMap.put( node, sb);
			}
		}
/*		String ans = "node 0: parent = -1, depth = 0, root, [1, 4, 10]" + "\n";
		 String aa = stringMap.get(0).toString();
		 System.out.print(ans);
		 System.out.print(aa);
		 if(ans.equals(aa)){
		System.out.println("true");
		 }*/
		for(int i = 0; i < n; i++){
			System.out.print(stringMap.get(i));
		}
	}
}