import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String[] fh = s.substring(0,  s.length()/2).split("");
		String[] sh = s.substring(s.length()/2,  s.length()).split("");
		int ans = 0;
		Map<String, Boolean> map = new HashMap<>();

		for(int i = 0; i < fh.length; i++) {
			if(map.get(fh[i]) == null) map.put(fh[i], false);
		}
		for(int j = 0; j < sh.length; j++) {
			if(map.get(sh[j]) == null) {
				map.put(sh[j], false);
			} else if(map.get(sh[j]) == false){
				map.put(fh[j], true);
			}
		}

		for(Boolean value: map.values()) {
			if(value == true) ans++;
		}
		System.out.println(ans);
	}

}
