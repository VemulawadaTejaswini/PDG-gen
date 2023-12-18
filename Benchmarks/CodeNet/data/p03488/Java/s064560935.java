import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main
{

  public static void main(String[] args) throws IOException
  {

    class Robot
    {
      Character vector;
      int x;
      int y;

      public Robot(Robot r)
      {
        this.x = r.getX();
        this.y = r.getY();
        vector = r.getVector();
      }

      public Robot(int x, int y, Character v)
      {
        this.x = x;
        this.y = y;
        vector = v;
      }

      public Robot forward()
      {
        switch (vector)
        {
          case '^':
            y++;
            break;
          case 'v':
            y--;
            break;
          case '>':
            x++;
            break;
          case '<':
            x--;
            break;
          default:
            System.out.println("へんなの");
        }
        return this;
      }

      public Robot turnLeft()
      {
        switch (vector)
        {
          case '^':
            vector = '<';
            break;
          case 'v':
            vector = '>';
            break;
          case '>':
            vector = '^';
            break;
          case '<':
            vector = 'v';
            break;
          default:
            System.out.println("へんなの");
        }
        return this;
      }

      public Robot turnRight()
      {
        switch (vector)
        {
          case '^':
            vector = '>';
            break;
          case 'v':
            vector = '<';
            break;
          case '>':
            vector = 'v';
            break;
          case '<':
            vector = '^';
            break;
          default:
            System.out.println("へんなの");
        }
        return this;
      }

      public Character getVector()
      {
        return vector;
      }

      public int getX()
      {
        return x;
      }

      public int getY()
      {
        return y;
      }

      public int getMD(int px, int py)
      {
        return Math.abs(px - x) + Math.abs(py - y);
      }

      @Override
      public String toString()
      {
        return x + "\t" + y + "\t" + vector.toString();
      }

      @Override
      public boolean equals(Object o)
      {
        if(o instanceof Robot)
        {
          return false;
        }
        Robot r = (Robot)o;
        if(x == r.getX() && y == r.getY() && vector.equals(r.getVector()))
        {
          return true;
        }
        return false;
      }
    }

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    ArrayList<Character> command = new ArrayList<Character>();

    for (int i = 0; i < s.length(); i++)
    {
      command.add(s.charAt(i));
    }

    String[] xy = r.readLine().split("[\\s]+");
    int px = Integer.parseInt(xy[0]);
    int py = Integer.parseInt(xy[1]);

    Set<Robot> currentState = new HashSet<Robot>();
    currentState.add(new Robot(0, 0, '>'));

    while(!command.isEmpty())
    {
      Character c = command.remove(0);
      Set<Robot> newState = new HashSet<Robot>();
      switch(c)
      {
        case 'F':
          for(Robot rob : currentState)
          {
            if(command.size() + 1 >= rob.getMD(px, py))
            {
              newState.add(rob.forward());
            }
          }
          break;
        case 'T':
          for(Robot rob : currentState)
          {
            if(command.size() + 1 >= rob.getMD(px, py))
            {
              Robot newrob = new Robot(rob);
              newState.add(newrob.turnLeft());
              newState.add(rob.turnRight());
            }
          }
          break;
        default:
          System.out.println("へんなの");
      }
      currentState = newState;
    }

    //for(Robot a : currentState)
    //{
    //  System.out.println(a);
    //}

    List<Robot> ac = new ArrayList<Robot>();
    for(Robot a : currentState)
    {
      if(a.getX() == px && a.getY() == py)
      {
        System.out.println("Yes");
        System.exit(0);
      }
    }
    System.out.println("No");
  }
}
