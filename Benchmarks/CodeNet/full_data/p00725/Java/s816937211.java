import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;


// ??´??°??§?¨?
class Point {
  public int x, y;

  Point(int _x, int _y) {
    x = _x;
    y = _y;
  }

  public Point add(Point p) {
    return new Point(x + p.x, y + p.y);
  }

  public boolean isInRange(int x1, int y1, int x2, int y2) {
    return (x1 <= x && x < x2 && y1 <= y && y < y2);
  }
}

// ????????????????????±
class Cell {

  // ?????????????¨????
  // EMPTY or OBSTACLE
  public int type;

  // ?????????????????????????????????????????¨???????????????????????????????????§?¨?
  // ?§?????????????????????´??????null??§??¨?????????
  public Point left;
  public Point top;
  public Point right;
  public Point bottom;

  public boolean passed;

  Cell(int _type, Point _left, Point _top, Point _right, Point _bottom) {
    type = _type;
    left = _left;
    top = _top;
    right = _right;
    bottom = _bottom;
    passed = false;
  }

  public String debugString() {
    String str = "";
    str += left   != null ? "left:   " + left.x   + ", " + left.y   + "\n" : "left:   null\n";
    str += top    != null ? "top:    " + top.x    + ", " + top.y    + "\n" : "top:    null\n";
    str += right  != null ? "right:  " + right.x  + ", " + right.y  + "\n" : "right:  null\n";
    str += bottom != null ? "bottom: " + bottom.x + ", " + bottom.y + "\n" : "bottom: null\n";
    return str;
  }
}

// ?????¢?????±
class Board {
  public static final int EMPTY = 0;
  public static final int OBSTACLE = 1;
  public static final int START = 2;
  public static final int GOAL = 3;

  private int width, height;
  private Cell[][] cells;
  private Point start, goal;

  // ?????¨????????????????????????????????????????????£?????????????????¢?´¢
  // ??????????????????????????????????????????????????´??????null??????
  // ????????????????????°???????????????????????§?¨??????????
  private static Point searchObstacle(int[][] map, int width, int height, Point current, Point direction, int type) {
    if(type == OBSTACLE) return null;
    Point p = current.add(direction);
    if(!p.isInRange(0, 0, width, height)) return null;
    if(map[p.y][p.x] == OBSTACLE) return null;
    if(map[p.y][p.x] == GOAL) return p;
    Point next = p.add(direction);
    while(next.isInRange(0, 0, width, height)) {
      // System.out.println("x");
      if(map[next.y][next.x] == OBSTACLE) return p;
      if(map[next.y][next.x] == GOAL) return next;
      p = p.add(direction);
      next = next.add(direction);
    }
    // System.out.println("d");
    return null;
  }

  Board(int _width, int _height, int[][] map) {
    width = _width;
    height = _height;

    // ??\???????????????????????¢?????±???????????????
    cells = new Cell[height][width];
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < width; x++) {
        int type = map[y][x];
        if(type == START) {
          start = new Point(x, y);
          type = EMPTY;
        }
        if(type == GOAL) {
          goal = new Point(x, y);
        }
        Point left   = searchObstacle(map, width, height, new Point(x, y), new Point(-1,  0), type);
        Point top    = searchObstacle(map, width, height, new Point(x, y), new Point( 0, -1), type);
        Point right  = searchObstacle(map, width, height, new Point(x, y), new Point( 1,  0), type);
        Point bottom = searchObstacle(map, width, height, new Point(x, y), new Point( 0,  1), type);
        cells[y][x] = new Cell(type, left, top, right, bottom);
        // System.out.println("cells[" + y + "][" + x + "]");
        // System.out.println(cells[y][x].debugString());
      }
    }
  }

  // ???????????¶?????????
  public Point startPosition() {
    return start;
  }

  // Node????§??????????????????????????????????
  private boolean ableToMoveTo(Point to) {
    return to != null && !cells[to.y][to.x].passed;
  }
  public boolean ableToMoveLeft(Node node) {
    return ableToMoveTo(cells[node.y][node.x].left);
  }
  public boolean ableToMoveTop(Node node) {
    return ableToMoveTo(cells[node.y][node.x].top);
  }
  public boolean ableToMoveRight(Node node) {
    return ableToMoveTo(cells[node.y][node.x].right);
  }
  public boolean ableToMoveBottom(Node node) {
    return ableToMoveTo(cells[node.y][node.x].bottom);
  }

  // Node????§?????????????
  // ???????????¶???????¨????
  private Node moveTo(Node node, Point to) {
    cells[to.y][to.x].passed = true;
    return new Node(to.x, to.y, node.count + 1);
  }
  public Node moveLeft(Node node) {
    return moveTo(node, cells[node.y][node.x].left);
  }
  public Node moveTop(Node node) {
    return moveTo(node, cells[node.y][node.x].top);
  }
  public Node moveRight(Node node) {
    return moveTo(node, cells[node.y][node.x].right);
  }
  public Node moveBottom(Node node) {
    return moveTo(node, cells[node.y][node.x].bottom);
  }

  // ???????????¶
  public boolean isFinished(Node node) {
    return node.x == goal.x && node.y == goal.y;
  }
}

// ??¢?´¢??¨????????????
// ??§?¨??????±??¨????????????????????????????????????
class Node extends Point {
  public int count;

  Node(int _x, int _y, int _count) {
    super(_x, _y);
    count = _count;
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

      int map[][] = new int[height][width];
      for(int y = 0; y < height; y++) {
        for(int x = 0; x < width; x++) {
          map[y][x] = sc.nextInt();
        }
      }

      Board board = new Board(width, height, map);

      // ???????????¢?´¢??¨???Queue?????¨???
      int min = -1;
      Queue<Node> queue = new ArrayDeque<Node>();
      queue.add(new Node(board.startPosition().x, board.startPosition().y, 0));
      while(!queue.isEmpty()) {
        Node current = queue.remove();
        // System.out.println(current.x + ", " + current.y + " : " + current.count);

        // ???????????¶
        if(current.count > 10) {
          break;
        }
        if(board.isFinished(current)) {
          min = current.count;
          break;
        }

        // ??????????????¢?´¢
        if(board.ableToMoveLeft  (current)) queue.add(board.moveLeft  (current));
        if(board.ableToMoveTop   (current)) queue.add(board.moveTop   (current));
        if(board.ableToMoveRight (current)) queue.add(board.moveRight (current));
        if(board.ableToMoveBottom(current)) queue.add(board.moveBottom(current));
      }

      System.out.println(min);
      // System.out.println("");
    }
  }
}