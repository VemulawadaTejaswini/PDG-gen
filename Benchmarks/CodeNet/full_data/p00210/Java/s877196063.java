
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
	
	public static class Person{
		public static final int EAST = 0;
		public static final int NORTH = 1;
		public static final int WEST = 2;
		public static final int SOUTH = 3;
		
		public static final int[][] look = new int[][]{
			{1, 0}, {0, -1}, {-1, 0}, {0, 1}
		};
		
		public static final int[][][] move = new int[][][]{
			{{0, 1}, {1, 0}, {0, -1}, {-1, 0}},
			{{1, 0}, {0, -1}, {-1, 0}, {0, 1}},
			{{0, -1}, {-1, 0}, {0, 1}, {1, 0}},
			{{-1, 0}, {0, 1}, {1, 0}, {0, -1}}
		};
		
		public static final int[][] move_dir = new int[][]{
			{SOUTH, EAST, NORTH, WEST},
			{EAST, NORTH, WEST, SOUTH},
			{NORTH, WEST, SOUTH, EAST},
			{WEST, SOUTH, EAST, NORTH}
		};
		
		int x, y;
		int dir;
		boolean move_wait;
		
		public Person(int x, int y, int dir) {
			super();
			this.x = x;
			this.y = y;
			this.dir = dir;
			move_wait = false;
		}
		
		public String toString(){
			return this.x + " " + this.y + " " + this.dir;
		}
	}
	
	public static final int WALL = 0;
	public static final int FLAT = 1;
	public static final int EXIT = 2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(W == 0 && H == 0){
				break;
			}
			
			int map[][] = new int[H][W];
			ArrayList<Person> people = new ArrayList<Person>();
			
			for(int i = 0; i < H; i++){
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < W; j++){
					switch(input[j]){
					case '#':
						map[i][j] = WALL;
						break;
					case '.':
						map[i][j] = FLAT;
						break;
					case 'X':
						map[i][j] = EXIT;
						break;
					case 'E':
						people.add(new Person(j, i, Person.EAST));
						map[i][j] = FLAT;
						break;
					case 'W':
						people.add(new Person(j, i, Person.WEST));
						map[i][j] = FLAT;
						break;
					case 'N':
						people.add(new Person(j, i, Person.NORTH));
						map[i][j] = FLAT;
						break;
					case 'S':
						people.add(new Person(j, i, Person.SOUTH));
						map[i][j] = FLAT;
						break;	
					}
				}
			}
			
			boolean over = true;
			int count = 1;
			while(count < 180){
				//System.out.println(people);
				for(Iterator<Person> iter = people.iterator(); iter.hasNext(); ){
					Person person = iter.next();
					
					for(int j = 0; j < 4; j++){
						int[] move  = Person.move[person.dir][j];
						
						if(person.x + move[0] < 0 || person.x + move[0] >= W || person.y + move[1] < 0 || person.y + move[1] >= H){
							continue;
						}else if(map[person.y + move[1]][person.x + move[0]] == WALL){
							continue;
						}else{
							boolean flag = false;
							for(Person p2 : people){
								if(p2 == person){
									continue;
								}else if(person.x + move[0] == p2.x && person.y + move[1] == p2.y){
									flag = true;
									break;
								}
							}
							
							if(flag){
								continue;
							}
							
							person.dir = Person.move_dir[person.dir][j];
							break;
						}
					}
				}
				
				for(Iterator<Person> iter = people.iterator(); iter.hasNext(); ){
					Person person = iter.next();
					int nx = person.x + Person.look[person.dir][0];
					int ny = person.y + Person.look[person.dir][1];
				
					if(nx < 0 || nx >= W || ny < 0 || ny >= H){
						continue;
					}else if(map[ny][nx] == WALL){
						continue;
					}
					
					int rev = (person.dir + 2) % 4;
					
					boolean flag = true;
					for(Person p2 : people){
						if(p2 == person){
							continue;
						}
						
						//System.out.println(person + " " + p2);
					
						for(int dir = 0; dir < rev; dir++){
							if(nx + Person.look[dir][0] < 0 || nx + Person.look[dir][0] >= W || ny + Person.look[dir][1] < 0 || ny + Person.look[dir][1] >= H){
								continue;
							}else if(p2.x == nx + Person.look[dir][0] && p2.y == ny + Person.look[dir][1]){
								flag = false;
								break;
							}
						}
					}
				
					if(flag){
						person.move_wait = true;
					}
				}
				
				for(Iterator<Person> iter = people.iterator(); iter.hasNext(); ){
					Person person = iter.next();
					if(person.move_wait){
						person.move_wait = false;
						int nx = person.x + Person.look[person.dir][0];
						int ny = person.y + Person.look[person.dir][1];
						
						person.x = nx;
						person.y = ny;
					}
				}
				
				for(Iterator<Person> iter = people.iterator(); iter.hasNext(); ){
					Person person = iter.next();
					
					if(map[person.y][person.x] == EXIT){
						iter.remove();
					}
				}
				
				if(people.isEmpty()){
					over = false;
					break;
				}
				count++;
			}
			
			if(over){
				System.out.println("NA");
			}else{
				System.out.println(count);
			}
		}
		
	}

}