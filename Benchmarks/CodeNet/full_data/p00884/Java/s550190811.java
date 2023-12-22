import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Membership Management
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			Map<String, Group> groups = new HashMap<>();
			String first = null;

			for (int i = 0; i < n; i++) {
				words = br.readLine().replaceAll("\\.", "").split("[:,]");

				String group = words[0];
				String[] members = Arrays.copyOfRange(words, 1, words.length);

				groups.putIfAbsent(group, main.new Group(group));
				for (String member : members) {
					groups.putIfAbsent(member, main.new Group(member));
					groups.get(member).parents.add(groups.get(group));
					groups.get(group).members.add(groups.get(member));
				}
				if (i == 0) first = group;
			}
			//
			int count = 0;
			for (Group group : groups.values()) {
				if (group.belongTo(first)) count++;
			}
			System.out.println(count);
		}
	}

	class Group {
		String name;
		List<Group> parents;
		List<Group> members;

		Group(String name) {
			this.name = name;
			parents = new ArrayList<>();
			members = new ArrayList<>();
		}

		boolean belongTo(String name) {
			boolean ret = false;
			if (parents.size() != 0 && members.size() == 0) {
				Deque<Group> queue = new ArrayDeque<>();

				for (Group parent : parents) queue.offer(parent);
				while (!queue.isEmpty()) {
					Group p = queue.poll();
					if (p.name.equals(name)) {
						ret = true;
						break;
					} else {
						for (Group _p : p.parents) queue.offer(_p);
					}
				}
			}
			return ret;
		}
	}
}