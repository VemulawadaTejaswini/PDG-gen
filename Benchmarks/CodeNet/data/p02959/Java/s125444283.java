import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		List<Long> cityList = new ArrayList();
		for (int i=-1; i<n; i++) {
			cityList.add(scan.nextLong());
		}
		
		List<Long> monsterList = new ArrayList();
		for (int i=0; i<n; i++) {
			monsterList.add(scan.nextLong());
		}
		
		long killedMonster = 0;
		for (int i=0; i<n; i++) {
			long city = cityList.get(i);
			long city2 = cityList.get(i+1);
			long killableMonster = monsterList.get(i);
			long amariMonster = city - killableMonster;
			long amariMonster2 = (city + city2) - killableMonster;
			
			if (amariMonster >= 0) {
				killedMonster += killableMonster;
			} else if (amariMonster2 >= 0) {
				killedMonster += killableMonster;
				cityList.set(i+1, (city2 - (killableMonster - city)));
			} else {
				killedMonster += city + city2;
				cityList.set(i+1, (long) 0);
			}
		}
		
		System.out.println(killedMonster);
	}
}