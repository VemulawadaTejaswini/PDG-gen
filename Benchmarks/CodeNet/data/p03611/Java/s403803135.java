import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
	public static void main(String[] args) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			line = br.readLine();

			StringTokenizer st0 = new StringTokenizer(line, "");
			int cnt0=Integer.parseInt(st0.nextToken());
			
			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			
			String s = "";
			Map<String,Integer> stringMap = new HashMap<String,Integer>();
			int[] hairetu=new int[cnt0];
			int hairetuMax=0;
			for (int i = 0; i < cnt0;i++) {
				
				s= st.nextToken();
				hairetu[i]=Integer.parseInt(s);
				//System.out.println(s);
				if (stringMap.get(s)==null) {
					stringMap.put(s, 1);
				} else {
					stringMap.put(s, stringMap.get(s)+1);
				}
				if(hairetuMax<hairetu[i]) {
					hairetuMax=hairetu[i];
				}
				
			}
			
			int max=0;
			int maxSuji=0; // maxになったときの0-8の数字
			int temp=0;
			
			for (int j=1;j < hairetuMax;j++) {
				temp=0;
				
				if (j==1) {
					
					if (stringMap.get("1")!=null) {
						temp=temp+stringMap.get("1");	
						
					}
					if (stringMap.get("2")!=null) {
						temp=temp+stringMap.get("2");	
					}
					
				} else if (j==9) {
					if (stringMap.get("8")!=null) {
						temp=temp+stringMap.get("8");	
					}
					if (stringMap.get("9")!=null) {
						temp=temp+stringMap.get("9");	
						System.out.println(temp);
					}
				} else {
					if (stringMap.get(String.valueOf(j-1))!=null) {
						temp=temp+stringMap.get(String.valueOf(j-1));	
					}
					if (stringMap.get(String.valueOf(j))!=null) {
						temp=temp+stringMap.get(String.valueOf(j));	
					}
					if (stringMap.get(String.valueOf(j+1))!=null) {
						temp=temp+stringMap.get(String.valueOf(j+1));	
					}
				}
				if (temp > max) {
					//System.out.println(temp + " " + max);
					//System.out.println(j);
					max=temp;
					maxSuji=j;
				}
			}
			
			int x = 0;
			for (int i = 0; i < cnt0;i++) {
				//System.out.println(hairetu[i]);
				if (maxSuji-1 ==hairetu[i] || maxSuji ==hairetu[i] || maxSuji+1 ==hairetu[i]) {
					x++;
				}
			}
			
			
			
			
			//String tempS = st.nextToken();

			//int k = Integer.parseInt(tempK);
			//int s = Integer.parseInt(tempS);
			
			//String result="";
            /*StringBuffer sb = new StringBuffer();
            
			for (int i =0;i<s.length();i++) {
				if (i % 2 == 0) {
					//result = result + s.charAt(i);
                    sb.append(s.charAt(i));
				}
			}
			System.out.println(sb.toString());
			*/
			System.out.println(x);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
