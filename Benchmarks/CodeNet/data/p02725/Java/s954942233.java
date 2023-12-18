import java.util.*;
public class Main {
  
	public static void main(String[] args) {
      
    	Scanner sc = new Scanner(System.in);
      	int k = sc.nextInt();
      	int n = sc.nextInt();
      
        // 目的地点のリスト points を作成
     	List<Integer> points = new ArrayList<Integer>(n);
      	int maxDistance = 0;
      	int newPoint = 0;
      	int lastPoint;
      	int distance;
      	for (int i = 0; i <  n; i++) {
          lastPoint = newPoint;
          newPoint = sc.nextInt();
          if (i == n - 1) lastPoint += k;
          distance = Math.abs(lastPoint - newPoint);
          maxDistance = maxDistance < distance ? distance : maxDistance;
        }
      System.out.println(maxDistance);
    }
 }