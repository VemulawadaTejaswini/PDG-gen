import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 跳ねる回数
      	int times = sc.nextInt() + 1;
      	// 境界値
      	int boundary = sc.nextInt();
  	    // 現在位置
  	    int currentPosition = 0;
  	    // 前回要素
  	    int lastElement = 0;
      	// 現在回数
      	int currentTimes = 0;
      	
      	for (int i=0;i<times;i++) {
      	    currentTimes += 1;
      	    if (currentTimes == 1) {
      	        currentPosition = 0;
      	    } else {
      	        currentPosition += lastElement;
      	    }
      	    if (currentPosition == boundary) {
      	        break;
      	    } else if (currentPosition >= boundary) {
      	        currentTimes -= 1;
      	        break;
      	    }
      	    lastElement = sc.nextInt();
      	}
      	System.out.println(currentTimes);

	}
}

