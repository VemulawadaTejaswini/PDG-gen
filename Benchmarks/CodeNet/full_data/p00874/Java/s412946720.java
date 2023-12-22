
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true){
			int w = Integer.parseInt(stdIn.next());
			int d = Integer.parseInt(stdIn.next());
			if(w==0 && d==0){
				break;
			}
			int count = 0;
			PriorityQueue<Integer> front = new PriorityQueue<Integer>();
			PriorityQueue<Integer> side = new PriorityQueue<Integer>();
			for(int i=0;i<w;i++){
				front.add(Integer.parseInt(stdIn.next()));
			}
			for(int i=0;i<d;i++){
				side.add(Integer.parseInt(stdIn.next()));
			}

			while(!front.isEmpty() || !side.isEmpty()){
				if(front.peek() == side.peek()){
					count += front.poll();
					side.poll();
				}
				else if(side.isEmpty() || (!front.isEmpty() && front.peek() < side.peek())){
					count += front.poll();
				}
				else if(front.isEmpty() || (!side.isEmpty() && side.peek() < front.peek())){
					count += side.poll();
				}
			}

			out.println(count);
			out.flush();
		}
	}
}