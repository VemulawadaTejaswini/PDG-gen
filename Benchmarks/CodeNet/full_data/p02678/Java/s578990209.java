import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Main main = new Main();
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	List<Integer> Goal = new ArrayList<>();
    	Map<Integer, Room> roomList = new HashMap<>();
    	for (int i = 0; i < M; i++) {
    		int rootA = sc.nextInt();
    		int rootB = sc.nextInt();
    		if (roomList.containsKey(rootA)) {
    			Room room = roomList.get(rootA);
    			room.setRoot(rootB);
    		} else {
    			if (rootA != 1) {
        			Room room = main.new Room(rootA);
        			room.setRoot(rootB);
        			roomList.put(rootA, room);
        			if (rootB == 1) {
        				Goal.add(rootA);
        			}
    			}
    		}
    		if (roomList.containsKey(rootB)) {
    			Room room = roomList.get(rootB);
    			room.setRoot(rootA);
    		} else {
    			if (rootB != 1) {
        			Room room = main.new Room(rootB);
        			room.setRoot(rootA);
        			roomList.put(rootB, room);
        			if (rootA == 1) {
        				Goal.add(rootB);
        			}
    			}
    		}
    	}
    	inNum(Goal, roomList);
    	for (int i = 2; i < N; i++) {
    		Room room = roomList.get(i);
    		if (room.getHasNum() == 0) {
    			System.out.println("No");
    			System.exit(0);
    		}
    	}
    	StringBuilder sb = new StringBuilder();
    	for (int i = 2; i < N; i++) {
    		Room room = roomList.get(i);
    		sb.append(room.getHasNum() + "\n");
    	}

    	System.out.println(sb);

    }
    
    public static void inNum(List<Integer> Goal, Map<Integer, Room> roomList) {
    		List<Integer> Goal2 = new ArrayList<>();
        	for (int i = 0; i < Goal.size(); i++) {
        		Room room = roomList.get(Goal.get(i));
        		Goal2.add(room.getRoomNum());
        		Set<Integer> root = room.getRoot();
        		for (Integer num : root) {
        			Room next = roomList.get(num);
        			next.setNext(room.getRoomNum());
        		}
        	}
        	inNum(Goal2,roomList);
    }
    
    private class  Room {
    	Set<Integer> root = new HashSet<>();
    	boolean hasGoal = false;
    	int hasNum = 0;
    	int roomNum = 0;
    	
    	public Room(int i) {
    		roomNum = i;
    	}
    	
    	public void setRoot(Integer i) {
    		if (i == 1) {
    			hasGoal = true;
    			hasNum = 1;
    		}
    		root.add(i);
    	}
    	
    	public void setNext(Integer i) {
    			hasGoal = true;
    			hasNum = i;
    	}
    	
    	public Set<Integer> getRoot() {
    		return root;
    	}
    	
    	public Integer getRoomNum() {
    		return roomNum;
    	}
    	
    	public Integer getHasNum() {
    		return hasNum;
    	}
    }
}