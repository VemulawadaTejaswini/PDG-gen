
import java.io.*;
import java.security.acl.Group;
import java.util.*;

//@2207Problem D: ³µÈPÊn
public class Main {

	// 1 km = 10^3 m ÌÆ« kmÌsisuª0Å mª-3ÉÈé
	static class Tani {
		String name;
		int sisu;
		public Tani(String name, int sisu) {
			this.name = name;
			this.sisu = sisu;
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for(;;) {
			List<Map<String, Tani>> group = new ArrayList<Map<String, Tani>>();
		
			String s = reader.readLine();
			int n = Integer.parseInt(s);
			if (n == 0)
				break;
			
			boolean mujun = false;
			for(int i = 0; i < n; i++) {
				s = reader.readLine();
				String reg = "1 ([a-z]+) = 10\\^(-?[0-9]*) ([a-z]+)";
				String a = s.replaceAll(reg, "$1");
				String b = s.replaceAll(reg, "$3");
				int sisu = Integer.parseInt(s.replaceAll(reg, "$2"));
//				System.out.printf("%s\n", a);
//				System.out.printf("%s\n", b);
//				System.out.printf("%d\n", sisu);

				Tani ta = null;
				Tani tb = null;
				Map<String, Tani> mapa = null;
				Map<String, Tani> mapb = null;
				for(int j = 0; j < group.size(); j++) { // SO[v©ç
					mapa = group.get(j);
					ta = mapa.get(a);
					if (ta != null)
						break;
				}
				for(int j = 0; j < group.size(); j++) { // SO[v©ç
					mapb = group.get(j);
					tb = mapb.get(b);
					if (tb != null)
						break;
				}
				
				if (ta == null && tb == null) {
					// VKo^
					Map<String, Tani> map = new HashMap<String, Tani>();
					map.put(a, new Tani(a, 0));
					map.put(b, new Tani(b, -sisu));
					group.add(map);
				}
				else if (tb == null) {
					// aªo^ÏÝ
					mapa.put(b, new Tani(b, -sisu + ta.sisu));
				}
				else if (ta == null) {
					// bªo^ÏÝ
					mapb.put(a, new Tani(a, sisu + tb.sisu));
				}
				else  { // ¼ûo^ÏÝ
					if (mapa == mapb) { // ¯êO[v
						if (ta.sisu - tb.sisu != sisu) { 
							mujun = true;
						}
					}
					else { // O[v¹
						for(Map.Entry<String, Tani> entry: mapb.entrySet()) {
							Tani t = entry.getValue();
							mapa.put(t.name, t);
							t.sisu += ta.sisu - tb.sisu - sisu;
						}
						group.remove(mapb);
					}
				}
			}
			System.out.printf("%s\n", mujun ? "No" : "Yes");
			
//			System.out.printf("group num=%d\n", group.size());
//			for(Map.Entry<String, Tani> entry: group.get(0).entrySet()) {
//				Tani t = entry.getValue();
//				System.out.printf("%s %d\n", t.name, t.sisu);
//			}
		}		
		
		reader.close();
	}

}