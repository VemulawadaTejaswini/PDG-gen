import java.util.*;
 
public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
      	int discount = sc.nextInt();
      	PriorityQueue<Integer> pq = new PriorityQueue();
      	int temp = 0;
      	long sum = 0;
      	for(int i = 0; i < count; i++){
        	pq.add(sc.nextInt());
        }
      	for(int l = 1; l <= discount; l++){
          	temp = pq.poll();
          	pq.add(temp/2);
        }
      	for(int n = 0; n < count; n++){
        	sum = sum + pq.poll();
        }
      	System.out.println(sum);
	}
}