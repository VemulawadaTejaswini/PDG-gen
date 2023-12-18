import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = Integer.parseInt(sc.next());
       ArrayList<Robot> robotList = new ArrayList<>();
       for(int i=0;i<N;i++){
           Robot robot = new Robot();
           int X = Integer.parseInt(sc.next());
           int L = Integer.parseInt(sc.next());
           robot.rangeMin = X - L;
           robot.rangeMax = X + L;
           robotList.add(robot);
       }
        robotList.sort((s1,s2) -> s1.rangeMax - s2.rangeMax);
        ArrayList<Robot> res = new ArrayList<>();
        res.add(robotList.get(0));
        for(int i=1;i<N;i++){
            Robot robot1 = robotList.get(i);
            Robot robot2 = res.get(res.size() - 1);
            if(robot1.rangeMin >= robot2.rangeMax){
                res.add(robot1);
            }
        }
        System.out.println(res.size());
    }
}

class Robot{
    public int rangeMin;
    public int rangeMax;
}