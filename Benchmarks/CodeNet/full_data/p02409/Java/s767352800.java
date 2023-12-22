import java.util.Scanner;

class Test {

	static final int BUILDING = 4;
	static final int FLOOR = 3;
	static final int ROOM = 10;

	static int [] room = new int[BUILDING * FLOOR * ROOM];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			update(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		sc.close();
		for(int b = 1;b <= BUILDING;b++){
			for(int f = 1;f <= FLOOR;f++){
				for(int r = 1;r <= ROOM;r++){
					System.out.print(" " + get(b,f,r));
				}
				System.out.println();
			}
			if(b <= BUILDING - 1) System.out.println("####################");
		}
	}

	static void update(int b,int f,int r,int v){
		room[(b - 1) * (FLOOR * ROOM) + (f - 1) * ROOM + (r - 1)] = v;
	}

	static int get(int b,int f,int r){
		return room[(b - 1) * (FLOOR * ROOM) + (f - 1) * ROOM + (r - 1)];
	}

}