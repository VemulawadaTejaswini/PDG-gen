import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 回数
      	int times = sc.nextInt() + 1;
      	// 境界値
      	int boundary = sc.nextInt();
  	    // 現在位置
  	    int current = 0;
      	// 現在回数
      	int currentTimes = 0;
      	for (int i=0;i<times;i++) {
      	    int element = sc.nextInt();
      	    currentTimes += 1;
      	    current = current + element * ((i+1)+1);
      	    if (current > boundary) {
      	        break;
      	    }
      	}
      	System.out.println(currentTimes);

	}
}

