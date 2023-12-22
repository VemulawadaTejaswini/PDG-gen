import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;


class Maze {
  // private static int n = 0;

  // private int id;
  // private int from_id;
  // public Maze from;
  private int width;
  private int height;
  // TODO
  private int px;
  private int py;
  private int length;
  private Cell[][] cells;

  Maze(int _width, int _height) {
    // id = ++n;
    // from_id = 0;
    // from   = null;
    width  = _width;
    height = _height;
    px     = 0;
    py     = 0;
    length = 1;

    cells = new Cell[height][width];
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < width; x++) {
        cells[y][x] = new Cell();
      }
    }
    cell(0, 0).passThrough();
  }

  public void setWallAround() {
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < width; x++) {
        if(x == 0)          { cell(x, y).setLeft();   }
        if(x == width - 1)  { cell(x, y).setRight();  }
        if(y == 0)          { cell(x, y).setTop();    }
        if(y == height - 1) { cell(x, y).setBottom(); }
      }
    }
  }

  public void setWall(int p, int q, int isWall) {
    if(isWall == 0) {
      return;
    }

    int y = p / 2;
    int x = q;

    // vertical wall
    if(p % 2 == 0) {
      cell(x,     y).setRight();
      cell(x + 1, y).setLeft();
    }

    // horizontal wall
    else {
      cell(x, y    ).setBottom();
      cell(x, y + 1).setTop();
    }
  }

  public int getLength() {
    return length;
  }

  private Cell cell(int x, int y) {
    return cells[y][x];
  }

  private Maze dupuricate() {
    Maze dupuricated = new Maze(width, height);
    // dupuricated.from_id = id;
    // dupuricated.from = this;
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < width; x++) {
        dupuricated.cells[y][x] = cells[y][x].dupuricate();
      }
    }
    return dupuricated;
  }

  public Maze moveTop()    { Maze dupuricated = dupuricate(); dupuricated.px = px;     dupuricated.py = py - 1; dupuricated.length = length + 1; dupuricated.cell(dupuricated.px, dupuricated.py).passThrough(); return dupuricated; }
  public Maze moveRight()  { Maze dupuricated = dupuricate(); dupuricated.px = px + 1; dupuricated.py = py;     dupuricated.length = length + 1; dupuricated.cell(dupuricated.px, dupuricated.py).passThrough(); return dupuricated; }
  public Maze moveBottom() { Maze dupuricated = dupuricate(); dupuricated.px = px;     dupuricated.py = py + 1; dupuricated.length = length + 1; dupuricated.cell(dupuricated.px, dupuricated.py).passThrough(); return dupuricated; }
  public Maze moveLeft()   { Maze dupuricated = dupuricate(); dupuricated.px = px - 1; dupuricated.py = py;     dupuricated.length = length + 1; dupuricated.cell(dupuricated.px, dupuricated.py).passThrough(); return dupuricated; }

  public boolean ableToGoTop()    { return cell(px, py).ableToGoTop()    && !cell(px,     py - 1).isPassedThrough(); }
  public boolean ableToGoRight()  { return cell(px, py).ableToGoRight()  && !cell(px + 1, py    ).isPassedThrough(); }
  public boolean ableToGoBottom() { return cell(px, py).ableToGoBottom() && !cell(px,     py + 1).isPassedThrough(); }
  public boolean ableToGoLeft()   { return cell(px, py).ableToGoLeft()   && !cell(px - 1, py    ).isPassedThrough(); }

  public boolean isFinished() {
    return px == width - 1 && py == height - 1;
  }

  public String debugString() {
    String debug = "";
    // debug += "id = " + id + ", ";
    // debug += "from_id = " + from_id + ", ";
    debug += "width = " + width + ", ";
    debug += "height = " + height + ", ";
    debug += "px = " + px + ", ";
    debug += "py = " + py + ", ";
    debug += "length = " + length;
    debug += "\n";
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < width; x++) {
        debug += "cell(" + x + ", " + y + ") = " + cell(x, y).debugString() + "\n";
      }
    }
    return debug;
  }
}

class Cell {
  private boolean top;
  private boolean right;
  private boolean bottom;
  private boolean left;
  private boolean is_passed_through;

  Cell() {
    top               = true;
    right             = true;
    bottom            = true;
    left              = true;
    is_passed_through = false;
  }

  public void setTop()    { top    = false; }
  public void setRight()  { right  = false; }
  public void setBottom() { bottom = false; }
  public void setLeft()   { left   = false; }

  public boolean ableToGoTop()    { return top;    }
  public boolean ableToGoRight()  { return right;  }
  public boolean ableToGoBottom() { return bottom; }
  public boolean ableToGoLeft()   { return left;   }

  public void passThrough() { is_passed_through = true; }
  public boolean isPassedThrough() { return is_passed_through; }

  public Cell dupuricate() {
    Cell dupuricated = new Cell();
    if(!ableToGoTop())     dupuricated .setTop();
    if(!ableToGoRight())   dupuricated .setRight();
    if(!ableToGoBottom())  dupuricated .setBottom();
    if(!ableToGoLeft())    dupuricated .setLeft();
    if( isPassedThrough()) dupuricated .passThrough();
    return dupuricated;
  }

  public String debugString() {
    return "top = " + (top ? "X" : " ") + ", right = " + (right ? "X" : " ") + ", bottom = " + (bottom ? "X" : " ") + ", left = " + (left ? "X" : " ") + ", passed = " + is_passed_through;
  }
}

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int width = sc.nextInt();
      int height = sc.nextInt();
      if(width == 0 && height == 0) {
        break;
      }

      // input wall data
      printDebug("input wall data.");
      Maze maze = new Maze(width, height);
      maze.setWallAround();
      for(int i = 0; i < height * 2 - 1; i++) {
        for(int j = 0; j < width; j++) {
          if(i % 2 == 0 && j == width - 1) {
            continue;
          }
          printDebug(i + ", " + j);
          maze.setWall(i, j, sc.nextInt());
        }
      }
      printDebug(maze.debugString());
      printDebug("");

      // do breadth first search
      int min = 0;
      Maze tail;
      Queue<Maze> queue = new ArrayDeque<Maze>();
      queue.add(maze);
      while(!queue.isEmpty()) {
        Maze current = queue.remove();
        printDebug(current.debugString());

        if(current.isFinished()) {
          tail = current;

          // printDebug("reverse search.");
          // while(tail != null) {
          //   printDebug(tail.px + " ," + tail.py);
          //   tail = tail.from;
          // }
          // printDebug("");

          min = current.getLength();
          break;
        }

        if(current.ableToGoTop())    { queue.add(current.moveTop());    }
        if(current.ableToGoRight())  { queue.add(current.moveRight());  }
        if(current.ableToGoBottom()) { queue.add(current.moveBottom()); }
        if(current.ableToGoLeft())   { queue.add(current.moveLeft());   }
      }

      System.out.println(min);
    }
  }

  static void printDebug(String message) {
    boolean debug = false;
    if(debug) {
      System.out.println(message);
    }
  }
}