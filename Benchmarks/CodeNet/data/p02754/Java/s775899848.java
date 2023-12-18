import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String frontBall = input.substring(0,input.indexOf(" "));
    String atFrontBall = input.substring(input.indexOf(" ")+1);
    int atFront = Integer.parseInt(atFrontBall);
    String blue = atFrontBall.substring(0,atFrontBall.indexOf(" "));
    int blueBall = Integer.parseInt(blue);
    String red = input.substring(atFrontBall.indexOf(" ")+1);
    int redBall = Integer.parseInt(red);

    ArrayList<String> balls = new ArrayList<String>();
    for(int i = 0;i < blueBall;i++) {
    	balls.add("b");
    }
    for(int i = 0;i < redBall;i++) {
    	balls.add("r");
    }

    // 切り出して、数える
    int count = 0;
    for(int i = 0;i < atFront;i++) {
    	if(balls.get(i).equals("b")) count++;
    }
    System.out.println(count);

  }
}