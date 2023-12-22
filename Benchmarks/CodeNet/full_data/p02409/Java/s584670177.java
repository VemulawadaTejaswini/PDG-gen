import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        Town town = new Town();

	    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	        br.readLine(); //1行目は捨てる
            br.lines().forEach(town::refresh);
        }

	    System.out.println(town);
    }

}

class Town {
    private final Map<Integer, Building> town;

    public Town() {
        super();
        town = new HashMap<>();
        IntStream.rangeClosed(1, 4).forEach(i -> town.put(i, new Building()));
    }

    public Building getBuilding(int i) {
        return town.get(i);
    }

    @Override
    public String toString() {
        return town.values().stream()
                .map(Building::toString)
                .collect(Collectors.joining(String.format("%n####################%n")));
    }

    private void refresh(int b, int f, int r, int v) {
        getBuilding(b).getFloor(f).getRoom(r).moveIn(v);
    }

    public void refresh(String s) {
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        refresh(arr[0], arr[1], arr[2], arr[3]);
    }
}

class Building {
    private final Map<Integer, Floor> building;

    public Floor getFloor(int i) {
        return building.get(i);
    }

    public Building() {
        super();
        building = new HashMap<>();
        IntStream.rangeClosed(1, 3).forEach(i -> building.put(i, new Floor()));
    }

    @Override
    public String toString() {
        return building.values().stream()
                .map(Floor::toString)
                .collect(Collectors.joining(String.format("%n")));
    }
}

class Floor {
    private final Map<Integer, Room> floor;

    public Room getRoom(int i) {
        return floor.get(i);
    }

    public Floor() {
        super();
        floor = new HashMap<>();
        IntStream.rangeClosed(1, 10).forEach(i -> floor.put(i, new Room()));
    }

    @Override
    public String toString() {
        return floor.values().stream()
                .map(Room::toString)
                .collect(Collectors.joining(" ", " ", ""));
    }
}

class Room {
    private int memberCount;

    public void moveIn(int i) {
        memberCount += i;
    }

    @Override
    public String toString() {
        return String.valueOf(memberCount);
    }

    public Room() {
        super();
        memberCount = 0;
    }

}
