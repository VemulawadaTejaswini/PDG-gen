
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	// チェックする順番
	private final String[][] CHECK_ATTRIBUTE = { { "2", "3", "4", "5" },
			{ "3", "4", "5", "1" }, { "4", "5", "1", "2" },
			{ "5", "1", "2", "3" }, { "1", "2", "3", "4" } };

	public static void main(String[] args) throws Exception {
		new Main().execute();
	}

	private void execute() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String line = null;
		while ((line = reader.readLine()) != null) {

			String[] fieldSize = line.split(" ");

			int xField = Integer.parseInt(fieldSize[0]);
			int yField = Integer.parseInt(fieldSize[1]);

			Map<String, List<Monster>> fieldMap = createFieldInfo(reader,
					xField, yField);

			// マップのサイズが不正であるかチェック
			if ((xField < 2 || xField > 1000) || (yField < 0 || yField > 1000)) {
				continue;
			}

			// ゲームクリア不能であるかチェック
			int emptyCount = 0;
			for (int i = 0; i < 5; i++) {
				if (fieldMap.get(String.valueOf(i + 1)).isEmpty()) {
					emptyCount++;
				}
			}

			if (emptyCount >= 2) {
				System.out.println("NA");
				continue;
			}

			Monster start = null;
			Monster goal = null;
			for (Monster monster : fieldMap.get("SG")) {
				if (monster.attribute.equals("S")) {
					start = monster;
				} else {
					goal = monster;
				}
			}

			int i = 0;
			int selectedAttribute = 0;
			int minMovementCount = 0;
			for (String[] attributes : CHECK_ATTRIBUTE) {
				Monster player = new Monster(String.valueOf(++i), start.x,
						start.y);

				int totalMovementCount = 0;

				boolean isEmpty = false;
				for (String attribute : attributes) {

					List<Monster> monsters = fieldMap.get(attribute);
					if (monsters.isEmpty()) {
						isEmpty = true;
						break;
					}

					int nearestMonsterMovementCount = 0;
					int nearestMonsterNumber = 0;

					int j = 0;
					for (Monster monster : monsters) {

						int movementCount = Math.abs(player.x - monster.x)
								+ Math.abs(player.y - monster.y);

						if ((nearestMonsterMovementCount == 0)
								|| (nearestMonsterMovementCount > movementCount)) {
							nearestMonsterMovementCount = movementCount;
							nearestMonsterNumber = j;
						}

						j++;
					}

					totalMovementCount += nearestMonsterMovementCount;
					player.x = monsters.get(nearestMonsterNumber).x;
					player.y = monsters.get(nearestMonsterNumber).y;

				}

				totalMovementCount += Math.abs(player.x - goal.x)
						+ Math.abs(player.y - goal.y);

				if (!isEmpty
						&& ((minMovementCount == 0) || (minMovementCount > totalMovementCount))) {
					selectedAttribute = i;
					minMovementCount = totalMovementCount;
				}
			}

			System.out.println(selectedAttribute + " " + minMovementCount);
		}
	}

	private Map<String, List<Monster>> createFieldInfo(BufferedReader reader,
			int xField, int yField) throws IOException {
		String line;
		List<Monster> fireMonsters = new ArrayList<Monster>();
		List<Monster> iceMonsters = new ArrayList<Monster>();
		List<Monster> woodMonsters = new ArrayList<Monster>();
		List<Monster> mudMonsters = new ArrayList<Monster>();
		List<Monster> waterMonsters = new ArrayList<Monster>();
		List<Monster> others = new ArrayList<Monster>();

		for (int i = 0; i < yField; i++) {
			line = reader.readLine();
			for (int j = 0; j < xField; j++) {
				switch (line.charAt(j)) {
				case '1':
					fireMonsters.add(new Monster("1", j, i));
					break;
				case '2':
					iceMonsters.add(new Monster("2", j, i));
					break;
				case '3':
					woodMonsters.add(new Monster("3", j, i));
					break;
				case '4':
					mudMonsters.add(new Monster("4", j, i));
					break;
				case '5':
					waterMonsters.add(new Monster("5", j, i));
					break;
				case 'S':
					others.add(new Monster("S", j, i));
					break;
				case 'G':
					others.add(new Monster("G", j, i));
					break;
				}
			}
		}

		Map<String, List<Monster>> fieldMap = new HashMap<String, List<Monster>>();
		fieldMap.put("1", fireMonsters);
		fieldMap.put("2", iceMonsters);
		fieldMap.put("3", woodMonsters);
		fieldMap.put("4", mudMonsters);
		fieldMap.put("5", waterMonsters);
		fieldMap.put("SG", others);
		return fieldMap;
	}
}

class Monster {

	public Monster(String attribute, int x, int y) {
		this.attribute = attribute;
		this.x = x;
		this.y = y;
	}

	// 属性
	public String attribute;
	// x座標
	public int x;
	// y座標
	public int y;

}