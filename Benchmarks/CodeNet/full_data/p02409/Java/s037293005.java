import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < 20;i++){
			sb.append("#");
		}
		String sepalator = sb.toString();
		sb = null;
		
		Building[] buildings = new Building[4];
		for(int i = 0;i < buildings.length;i++){
			buildings[i] = new Building();
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0;i < n;i++){
			String[] tmp = br.readLine().split(" ");
			int building = Integer.parseInt(tmp[0]);
			int floor = Integer.parseInt(tmp[1]);
			int room = Integer.parseInt(tmp[2]);
			int visitor = Integer.parseInt(tmp[3]);
			buildings[--building].add(floor, room, visitor);
		}
		for(int i = 0;i < buildings.length;i++){
			buildings[i].write();
			if(i >= buildings.length - 1)
				break;
			System.out.println(sepalator);
		}
	}

}

class Building {

	Floor[] floors;
	{
		floors = new Floor[3];
		for (int i = 0; i < floors.length; i++) {
			floors[i] = new Floor();
		}
	}

	public void add(int floor, int room, int visitor) {
		floors[--floor].add(room, visitor);
	}
	
	public void write(){
		for(int i = 0;i < floors.length;i++){
			floors[i].write();
		}
	}

	private class Floor {
		int[] people;
		{
			people = new int[10];
			for (int i = 0; i < people.length; i++) {
				people[i] = 0;
			}
		}

		public void add(int room, int visitor) {
			people[--room] += visitor;
		}
		
		public void write(){
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i < people.length;i++){
				sb.append(" ");
				sb.append(people[i]);
			}
			System.out.println(sb.toString());
		}
	}
}