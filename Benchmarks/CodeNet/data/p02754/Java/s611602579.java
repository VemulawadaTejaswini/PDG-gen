import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String frontBall = input.substring(0,input.indexOf(" "));
    String afterFrontBall = input.substring(input.indexOf(" ")+1);
    int Front = Integer.parseInt(frontBall);
    String blue = afterFrontBall.substring(0,afterFrontBall.indexOf(" "));
    String afterBlueBall = afterFrontBall.substring(afterFrontBall.indexOf(" ")+1);
    int blueBall = Integer.parseInt(blue);
    String red = afterBlueBall;
    int redBall = Integer.parseInt(red);

    ArrayList<String> balls = new ArrayList<String>();
    boolean add = true;
    while(add) {
    for(int i = 0;i < blueBall;i++) {
    	balls.add("b");
    	if(balls.size() == Front) add = false;
    }
    for(int i = 0;i < redBall;i++) {
    	balls.add("r");
    	if(balls.size() == Front) add = false;
    }

    }

    // 切り出して、数える
    int count = 0;
    for(int i = 0;i < Front;i++) {
    	if(balls.get(i).equals("b")) count++;
    }
    System.out.println(count);

  }
}