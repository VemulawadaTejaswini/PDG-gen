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
    System.out.println(Front);
    System.out.println(blue);
    System.out.println(red);


    ArrayList<String> balls = new ArrayList<String>(Front);
    boolean add = true;
    while(add) {
    for(int i = 0;i < blueBall;i++) {
    	balls.add("b");
    	System.out.println(balls.get(balls.size()-1));
    	System.out.println(balls.size());
    	System.out.println(Front);
    	if(balls.size() == Front) {
    	    add = false;
    	    break;
    	}
    }
    for(int i = 0;i < redBall;i++) {
    	balls.add("r");
    	System.out.println(balls.get(balls.size()-1));
    	System.out.println(balls.size());
    	System.out.println(Front);
    	if(balls.size() == Front) {
    	    add = false;
    	    break;
    }

    }

    // 切り出して、数える
    int count = 0;
    for(int i = 0;i < Front;i++) {
    	if(balls.get(i).equals("b")) count++;
    	System.out.print(balls.get(i));
    }
    System.out.println(count);

  }
}