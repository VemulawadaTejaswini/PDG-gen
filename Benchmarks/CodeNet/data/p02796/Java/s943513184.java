import java.util.*;
import java.lang.Math.*;

class Robot implements Comparable<Robot> {
     
  private int position;
  private int length;
       
  public Robot(int position, int length) {
    this.position = position;
    this.length = length;
  }
 
  public int getPosition() {
    return this.position;
  }
 
  public void setPosition(int position) {
    this.position = position;
  }
 
  public int getLength() {
    return this.length;
  }
 
  public void setLength(int length) {
    this.length = length;
  }
 
  public int compareTo(Robot anotherRobot) {
         
    if(this.length < anotherRobot.length){ 
      return -1; 
    }else{
      return 1;
    }
 
  }
}

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        List<Robot> robots = new ArrayList<Robot>();
        for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
            int l = sc.nextInt();
            Robot robot = new Robot(x, l);
            robots.add(robot);
        }

        Collections.sort(robots);
        
        ArrayList<Integer> left = new ArrayList<Integer>();
      
        for (Robot robot : robots) {
            Integer p = new Integer(robot.getPosition());
            left.add(p);
            Collections.sort(left);
            if (left.size() < 2) {
                continue;
            }
            int index = left.indexOf(robot.getPosition());
            boolean flag = true;
            if (index > 0 &&
                robot.getPosition() - robot.getLength() < left.get(index - 1)) {
                flag = false;
            }
            if (index < left.size() - 1 &&
                robot.getPosition() + robot.getLength() > left.get(index + 1)) {
                flag = false;
            }
            if (flag == false) {
                left.remove(p);
            }
        }

      System.out.println(left.size());
	}
}