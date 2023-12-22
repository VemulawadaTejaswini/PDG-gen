import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_6_C
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    private final static String SPACE = " ";
    private final static String SEPARATOR = "####################";
    
    public static void main(String[] args) {
        try {
            LineNumberReader stdReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            int n = 0;

            
            // ??¬?????????????????§???????????????.
            ArrayList<Room> allRooms = new ArrayList<Room>();
            int[] blocks = { 1, 2, 3, 4 };
            int[] floors = { 1, 2, 3 };
            int[] rooms = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            for (int block : blocks) {
                for (int floor : floors) {
                    for (int room : rooms) {
                        allRooms.add(new Room(block, floor, room));
                    }
                }
            }

            while ((sStr = stdReader.readLine()) != null) {
                
                // ????????????????????????
                if (stdReader.getLineNumber() == 1) {
                    String[] inputs = sStr.split(" ");
                    n = Integer.valueOf(inputs[0]);
                }
                
                // 2????????\??????????????????
                if (stdReader.getLineNumber() > 1) {
                    String[] inputs = sStr.split(SPACE);
                    int b = Integer.parseInt(inputs[0]);
                    int f = Integer.parseInt(inputs[1]);
                    int r = Integer.parseInt(inputs[2]);
                    int v = Integer.parseInt(inputs[3]);
                    
                    // ??´??°????±??????¬?????????????????§????????????????????¨???.
                    Room target = new Room(b, f, r);
                    
                    for (Room room: allRooms) {
                        if (target.equals(room)) {
                            room.updateNumOfRoommate(v);
                        }
                    }
                    
                    if (stdReader.getLineNumber() > n)
                        break;
                }
            }


            // ??¨?????????????????????????????????????????????????????????
            int count = 0;
            for (Room r : allRooms) {
                count ++;
                System.out.print(SPACE + r.getNumOfRoommate());
                if (count % 10 == 0)   System.out.println();
                if (count % 30 == 0 && count !=120)   System.out.println(SEPARATOR);
            }

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
    
    public static class Room {
        private int numOfRoommate=0;
        private int block;
        private int roomNo;
        private int floor;

        /**
         * 
         * @param v ?¢??????°?????\???.
         */
        public void updateNumOfRoommate(int v) {
            this.numOfRoommate = this.numOfRoommate + v;
        }

        @Override
        public String toString() {
            return "Room [block=" + block + ", roomNo=" + roomNo + ", floor="
                    + floor + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + block;
            result = prime * result + floor;
            result = prime * result + roomNo;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Room other = (Room) obj;
            if (block != other.block)
                return false;
            if (floor != other.floor)
                return false;
            if (roomNo != other.roomNo)
                return false;
            return true;
        }

        Room(int block, int floor, int roomNo) {
            this.block = block;
            this.floor = floor;
            this.roomNo = roomNo;
        }
        
        public int getNumOfRoommate() {
            return numOfRoommate;
        }
        public void setNumOfRoommate(int numOfRoommate) {
            this.numOfRoommate = numOfRoommate;
        }
        public int getBlock() {
            return block;
        }
        public void setBlock(int block) {
            this.block = block;
        }
        public int getRoomNo() {
            return roomNo;
        }
        public void setRoomNo(int roomNo) {
            this.roomNo = roomNo;
        }
        public int getFloor() {
            return floor;
        }
        public void setFloor(int floor) {
            this.floor = floor;
        }
    }
}