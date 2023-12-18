import java.util.AbstractMap.SimpleEntry;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		String input = "2 3 4\n" + "100\n" + "600\n" + "400\n" + "900\n" + "1000\n" + "150\n" + "2000\n" + "899\n"
				+ "799";
		Scanner sc = new Scanner(input);
		List<Integer> header = Arrays.stream(sc.nextLine().split(" ")).map(Integer::valueOf)
				.collect(Collectors.toList());

		List<Tatemono> jinjaAndTera = new ArrayList<>();
		new ArrayList<>();
		new ArrayList<>();
		List<Tatemono> mondai = new ArrayList<>();

		List<Tatemono> jinja = read(sc, header.get(0), jinjaAndTera, "jinja");
		List<Tatemono> tera = read(sc, header.get(1), jinjaAndTera, "tera");
		read(sc, header.get(2), mondai, "x");

		// 神社と寺の間の最短距離Map
		Map<Tatemono, Integer> map = new HashMap<>();
		jinjaAndTera.sort(null);
		jinja.sort(null);
		tera.sort(null);

		int iJinja = 0;
		int iTera = 0;
		for (Tatemono tatemono : jinjaAndTera) {
			if ("tera".equals(tatemono.name)) {
				map.put(tatemono, getMinDistance(tatemono, iJinja, jinja));
				iTera++;
				if (tera.size() == iTera) {
					iTera--;
				}
			} else if ("jinja".equals(tatemono.name)) {
				map.put(tatemono, getMinDistance(tatemono, iTera, tera));
				iJinja++;
				if (jinja.size() == iJinja) {
					iJinja--;
				}
			}
		}

		// やっと答えにたどり着いたのか・・・
		for (Tatemono xObj : mondai) {
			SimpleEntry<Tatemono, Tatemono> pair = findNearestTatemono(jinjaAndTera, jinjaAndTera.size() / 2, xObj);

			Tatemono left = pair.getKey();
			Tatemono right = pair.getValue();

			int leftDistance = Math.abs(map.get(left)) + Math.abs(xObj.pos - left.pos);
			int rightDistance = Math.abs(map.get(right)) + Math.abs(xObj.pos - right.pos);

			System.out.println(Integer.min(leftDistance, rightDistance));
		}

	}

	public static SimpleEntry<Tatemono, Tatemono> findNearestTatemono(List<Tatemono> jinjaAndTera, int index,
			Tatemono target) {
		SimpleEntry<Tatemono, Tatemono> nearestTatemonoPair = null;

		if (index + 1 < jinjaAndTera.size() && index != 0) {
			Tatemono tempThis = jinjaAndTera.get(index);
			Tatemono tempAfter = jinjaAndTera.get(index + 1);

			if (tempThis.pos < target.pos && target.pos < tempAfter.pos) {
				nearestTatemonoPair = new SimpleEntry<>(tempThis, tempAfter);
			} else {
				if (target.pos < tempThis.pos) {
					int nextIndex = index - index / 2;
					if (nextIndex == index) {
						nextIndex--;
					}
					nearestTatemonoPair = findNearestTatemono(jinjaAndTera, nextIndex, target);
				} else {
					int nextIndex = index + (jinjaAndTera.size() - index) / 2;
					if (nextIndex == index) {
						nextIndex++;
					}
					nearestTatemonoPair = findNearestTatemono(jinjaAndTera, nextIndex, target);
				}
			}
		} else if (index == 0) {
			nearestTatemonoPair = new SimpleEntry<>(jinjaAndTera.get(0), jinjaAndTera.get(0));
		} else {
			nearestTatemonoPair = new SimpleEntry<>(jinjaAndTera.get(jinjaAndTera.size() - 1),
					jinjaAndTera.get(jinjaAndTera.size() - 1));
		}
		return nearestTatemonoPair;
	}

	public static int getMinDistance(Tatemono tatemono, int i, List<Tatemono> list) {
		Tatemono before;
		Tatemono now;
		Tatemono after;
		int tatemonoPos = tatemono.pos;
		int beforePos = Integer.MAX_VALUE;
		int nowPos = Integer.MAX_VALUE;
		int afterPos = Integer.MAX_VALUE;
		if (i != 0) {
			before = list.get(i - 1);
			beforePos = before.pos;
		}
		now = list.get(i);
		nowPos = now.pos;
		if (i != list.size() - 1) {
			after = list.get(i + 1);
			afterPos = after.pos;
		}

		int minDistance = Integer.min(Math.abs(tatemonoPos - nowPos),
				(Integer.min(Math.abs(tatemonoPos - beforePos), Math.abs(tatemonoPos - afterPos))));
		return minDistance;
	}

	public static class Tatemono implements Comparable<Tatemono> {
		public String name;
		public int pos;

		public Tatemono(String name, int pos) {
			this.name = name;
			this.pos = pos;
		}

		@Override
		public int compareTo(Tatemono o2) {
			return Integer.valueOf(this.pos).compareTo(Integer.valueOf(o2.pos));
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + pos;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Tatemono other = (Tatemono) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (pos != other.pos)
				return false;
			return true;
		}
	}

	public static List<Tatemono> read(Scanner sc, int length, Collection<Tatemono> list, String name) {
		List<Tatemono> inputList = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			Tatemono tatemono = new Tatemono(name, Integer.valueOf(sc.nextLine()));
			list.add(tatemono);
			inputList.add(tatemono);

		}
		return inputList;
	}
}