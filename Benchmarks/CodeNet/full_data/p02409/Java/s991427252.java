import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private ArrayList<Kousha> kousha;

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

	private void disp() {
		for (int b = 0; b < this.kousha.size(); b++) {

			Kousha kousha = this.kousha.get(b);
			for (int f = 0; f < kousha.getFloorCount(); f++) {

				Floor floor = kousha.getFloor(f);
				for (int r = 0; r < floor.getRoomCount(); r++) {
					Room room = floor.getRoom(r);
					System.out.print(" " + room.getNinzu());
				}
				System.out.println("");
			}

			if (b != this.kousha.size() - 1) {
				System.out.println("####################");
			}
		}
	}

	private void init() {
		this.kousha = new ArrayList<Kousha>();

		kousha.add(new Kousha(1));
		kousha.add(new Kousha(2));
		kousha.add(new Kousha(3));
		kousha.add(new Kousha(4));
	}

	private void movePeople(int b, int f, int r, int v) {
		Kousha kousha = this.kousha.get(b - 1);
		Floor floor = kousha.getFloor(f - 1);
		Room room = floor.getRoom(r - 1);

		room.setNinzu(v);
	}

	class Kousha {
		private int num;

		private ArrayList<Floor> floor;

		Kousha(int koushaNo) {
			this.num = koushaNo;

			floor = new ArrayList<Floor>();
			floor.add(new Floor(1));
			floor.add(new Floor(2));
			floor.add(new Floor(3));
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public int getFloorCount() {
			return this.floor.size();
		}

		public Floor getFloor(int floorNo) {
			return floor.get(floorNo);
		}

		public void setFloor(ArrayList<Floor> floor) {
			this.floor = floor;
		}
	}

	class Floor {
		private int num;

		private ArrayList<Room> room;

		Floor(int floorNo) {
			this.num = floorNo;

			room = new ArrayList<Room>();

			room.add(new Room(1));
			room.add(new Room(2));
			room.add(new Room(3));
			room.add(new Room(4));
			room.add(new Room(5));
			room.add(new Room(6));
			room.add(new Room(7));
			room.add(new Room(8));
			room.add(new Room(9));
			room.add(new Room(10));
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public Room getRoom(int roomNo) {
			return room.get(roomNo);
		}

		public void setRoom(ArrayList<Room> room) {
			this.room = room;
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

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public int getNinzu() {
			return ninzu;
		}

		public void setNinzu(int ninzu) {
			this.ninzu += ninzu;

			if (this.ninzu < 0) {
				this.ninzu = 0;
			}
		}
	}
}