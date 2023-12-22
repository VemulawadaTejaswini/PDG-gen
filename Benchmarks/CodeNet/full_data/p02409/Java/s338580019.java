import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private ArrayList<Building> building;

	final int BUILDING = 4;
	final int FLOOR = 3;
	final int ROOM = 10;

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    Main main = new Main();
	    main.init();

	    int n = Integer.parseInt(br.readLine());

	    for (int i = 0; i < n; i++) {
		    String line = br.readLine();
		    // ?£?
		    int b = Integer.parseInt(line.split(" ")[0]);
		    // ???
		    int f = Integer.parseInt(line.split(" ")[1]);
		    // ??¨?±???????
		    int r = Integer.parseInt(line.split(" ")[2]);
		    // ?¢?????????°
		    int v = Integer.parseInt(line.split(" ")[3]);

		    main.movePeople(b, f, r, v);
	    }
	    main.disp();
	}

	private void init() {
		this.building = new ArrayList<Building>();

		for (int i = 1; i <= BUILDING; i++) {
			building.add(new Building(i));
		}
	}

	private void disp() {
		for (int b = 0; b < this.building.size(); b++) {

			Building building = this.building.get(b);
			for (int f = 0; f < building.getFloorCount(); f++) {

				Floor floor = building.getFloor(f);
				for (int r = 0; r < floor.getRoomCount(); r++) {
					Room room = floor.getRoom(r);
					System.out.print(" " + room.getNinzu());
				}
				System.out.println("");
			}

			if (b != this.building.size() - 1) {
				System.out.println("####################");
			}
		}
	}

	private void movePeople(int b, int f, int r, int v) {
		Building building = this.building.get(b - 1);
		Floor floor = building.getFloor(f - 1);
		Room room = floor.getRoom(r - 1);

		room.setNinzu(v);
	}

	class Building {
		private int num;

		private ArrayList<Floor> floor;

		Building(int buildingNo) {
			this.num = buildingNo;

			floor = new ArrayList<Floor>();
			for (int i = 1; i <= FLOOR; i++) {
				floor.add(new Floor(i));
			}
		}

		public int getFloorCount() {
			return this.floor.size();
		}

		public Floor getFloor(int floorNo) {
			return floor.get(floorNo);
		}
	}

	class Floor {
		private int num;

		private ArrayList<Room> room;

		Floor(int floorNo) {
			this.num = floorNo;

			room = new ArrayList<Room>();
			for (int i = 1; i <= ROOM; i++) {
				room.add(new Room(i));
			}
		}

		public Room getRoom(int roomNo) {
			return room.get(roomNo);
		}

		public int getRoomCount() {
			return this.room.size();
		}
	}

	class Room {
		private int num;

		private int ninzu;

		Room(int roomNo) {
			this.num = roomNo;
		}

		public int getNinzu() {
			return ninzu;
		}

		public void setNinzu(int ninzu) {
			this.ninzu += ninzu;

			if (this.ninzu < 0) this.ninzu = 0;
		}
	}
}