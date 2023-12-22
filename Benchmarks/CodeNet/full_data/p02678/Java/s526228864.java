import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
        	int N = input.nextInt();
        	int M = input.nextInt();
			ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>(N + 1);
        	
        	for (int i = 0; i < N + 1; ++i) {
        		g.add(new ArrayList<Integer>());
        	}
        	
        	for (int i = 0; i < M; ++i){
        		int A = input.nextInt();
        		int B = input.nextInt();
        		
        		g.get(A).add(B);
        		g.get(B).add(A);
        	}
        	
        	int[] nextRoom = new int[N + 1];
        	Arrays.fill(nextRoom, -1);
        	Queue<Integer> q = new LinkedList<Integer>();
        	q.add(1);
        	
        	while (q.isEmpty() == false) {
        		int currentRoom = q.poll();
        		ArrayList<Integer> neighborRoom = g.get(currentRoom);
        		
        		for (int i = 0; i < neighborRoom.size(); ++i) {
        			if (nextRoom[neighborRoom.get(i)] == -1) {
        				nextRoom[neighborRoom.get(i)] = currentRoom;
        				q.add(neighborRoom.get(i));
        			}
        		}
        	}
        	
        	System.out.println("Yes");
        	for (int i = 2; i < nextRoom.length; ++i) {
        		System.out.println(nextRoom[i]);
        	}
        }
	}
}
