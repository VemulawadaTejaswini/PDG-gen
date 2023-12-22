//import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args) throws Exception {
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();

    for(int caves = 0; caves < input1; caves++) {
      int input2 = scan.nextInt();
      int input3 = scan.nextInt();

      ArrayList<Room> room = new ArrayList<>();

      int nowX = 0;
      int nowY = 0;
      while(!(input2 == 0 && input3 == 0)) {
        nowX += input2;
        nowY += input3;
        boolean flag = true;
        for(int i = 0; i < room.size(); i++) {
          Room r = room.get(i);
          if(nowX==r.x && nowY==r.y) {
            flag = false;
            break;
          }
        }
        if(flag) {
          room.add(new Room(nowX,nowY));
        }

        input2 = scan.nextInt();
        input3 = scan.nextInt();
      }

      int max = 0;
      int maxX = 0;
      int maxY = 0;
      for(int i = 0; i < room.size(); i++) {
        Room r = room.get(i);
        int length = r.x*r.x+r.y*r.y;
        if(max<length) {
          max = length;
          maxX = r.x;
          maxY = r.y;
        }else if(max == length) {
          if(maxX < r.x) {
            max = length;
            maxX = r.x;
            maxY = r.y;
          }
        }
      }

      System.out.println(maxX+" "+maxY);
    }
  }
}

class Room{
  int x,y;
  Room(int _x, int _y) {
    x = _x;
    y = _y;
  }
}