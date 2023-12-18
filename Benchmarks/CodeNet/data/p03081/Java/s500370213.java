import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] line2 = line.split(" ",0);
		int N = Integer.parseInt(line2[0]);
		int Q = Integer.parseInt(line2[1]);
		String S = scan.nextLine();
		String[] s = S.split("",0);
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int x=0;x<Q;x++){
			String line3 = scan.nextLine();
			String[] line4 = line3.split(" ",0);
			if(map.containsKey(line4[0])){
				if(line4[1].equals("L")){
					map.put(line4[0],map.get(line4[0]) - 1) ;
				}
				else{
					map.put(line4[0],map.get(line4[0]) + 1) ;
				}
			}
			else{
				if(line4[1].equals("L")){
					map.put(line4[0],-1);
				}
				else{
					map.put(line4[0],1);
				}
			}
		}
		int ans = 0;
		for(int y=0;y<N;y++){
			if(map.containsKey(s[y])){
				
			if(-1<map.get(s[y])+y&&map.get(s[y])+y<N){
				ans++;
			}
			else{
				continue;
			}
		}
		else{continue;}
		}
		System.out.println(ans);
	}
}