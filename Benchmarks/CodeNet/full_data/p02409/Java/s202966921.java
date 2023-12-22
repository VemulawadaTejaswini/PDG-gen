import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int RESIDENCES = 4;
    private static final int FLOORS = 3;
    private static final int ROOMS = 10;

    protected static String process(String data) {
        ResidenceManager rm = new ResidenceManager();
        StringBuilder sb = new StringBuilder();
        final String[] lines = splitForLines(data);

        // skipping first line
        for (int i = 1; i < lines.length; i++) {
            final int[] ints = split(lines[i]);
            final int residence = ints[0];
            final int floor = ints[1];
            final int room = ints[2];
            final int people = ints[FLOORS];
            rm.getResidence(residence).getFloor(floor).getRoom(room).addPeople(people);
        }

        sb.append(rm);

        return sb.toString();
    }

    static class ResidenceManager {
        List<Residence> residences;

        public ResidenceManager() {
            residences = new ArrayList<Residence>(RESIDENCES);
            for (int i = 0; i < RESIDENCES; i++) {
                residences.add(new Residence());
            }
        }

        Residence getResidence(int num) {
            return residences.get(num - 1);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Residence residence : residences) {
                if (sb.length() > 0) {
                    for (int i = 0; i < 20; i++) {
                        sb.append('#');
                    }
                    sb.append('\n');
                }
                sb.append(residence);
            }
            return sb.toString();
        }
    }

    static class Residence {
        List<Floor> floors;

        Residence() {
            floors = new ArrayList<Floor>(FLOORS);
            for (int i = 0; i < FLOORS; i++) {
                floors.add(new Floor());
            }
        }

        Floor getFloor(int num) {
            return floors.get(num - 1);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Floor floor : floors) {
                sb.append(floor.toString()).append('\n');
            }
            return sb.toString();
        }
    }

    static class Floor {
        List<Room> rooms;

        Floor() {
            rooms = new ArrayList<Room>(ROOMS);
            for (int i = 0; i < ROOMS; i++) {
                rooms.add(new Room());
            }
        }

        public Room getRoom(int num) {
            return rooms.get(num - 1);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Room room : rooms) {
                sb.append(' ').append(room.toString());
            }
            return sb.toString();
        }
    }

    static class Room {
        int people;

        public int getPeople() {
            return people;
        }

        public void addPeople(int num) {
            people += num;
        }

        @Override
        public String toString() {
            return String.valueOf(getPeople());
        }
    }

    private static String readAll(InputStream is) {
        InputStreamReader r = null;
        BufferedReader br = null;

        try {
            r = new InputStreamReader(is);
            br = new BufferedReader(r);
            StringBuilder sb = new StringBuilder();
            String s;

            while ((s = br.readLine()) != null) {
                sb.append(s).append('\n');
            }

            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private static String[] splitForLines(String lines) {
        return lines.split("\\n");
    }

    private static int[] split(String s) {
        final String[] s0 = s.split(" ");
        int[] ia = new int[s0.length];

        for (int i = 0; i < s0.length; i++) {
            ia[i] = Integer.parseInt(s0[i]);
        }

        return ia;
    }

    public static void main(String[] args) {
        System.out.print(process(readAll(System.in)));
    }
}