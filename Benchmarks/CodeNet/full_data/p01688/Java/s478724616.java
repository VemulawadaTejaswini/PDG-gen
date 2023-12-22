import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int x = sc.nextInt();
		PriorityQueue<DataA> queueA = new PriorityQueue<DataA>();
		PriorityQueue<DataB> queueB = new PriorityQueue<DataB>();
		for(int i = 0; i < x; i++) {
			queueA.add(new DataA(sc.next().charAt(0),sc.nextInt()));
		}
		int y = sc.nextInt();
		for(int i = 0; i < y; i++) {
			String in = sc.next();
			queueB.add(new DataB(in.charAt(0),in.charAt(1),sc.nextInt()));
		}
		int score = 0;
		while(!queueA.isEmpty() && !queueB.isEmpty() && d >= 1) {
			if(queueA.peek().a != 'D') {
				queueA.poll();
				continue;
			}
			if(queueB.peek().b != 'D' || queueB.peek().c != 'D') {
				queueB.poll();
				continue;
			}
			if(queueB.peek().q / 2.0 >= queueA.peek().p) {
				d -= 2;
				score += queueB.poll().q;
				continue;
			}
			else {
				d -= 1;
				score += queueA.poll().p;
				continue;
			}
		}
		if(d != 0) {
			while(!queueA.isEmpty() && queueA.peek().a != 'D') queueA.poll();
			while(!queueB.isEmpty() && (queueB.peek().b != 'D' || queueB.peek().c != 'D')) queueB.poll();
			if(queueA.isEmpty()) {
				while(!queueB.isEmpty() && d >= 2) {
					while(!queueB.isEmpty() && (queueB.peek().b != 'D' || queueB.peek().c != 'D')) queueB.poll();
					score += queueB.poll().q;
					d -= 2;
				}
			}
			if(queueB.isEmpty()) {
				while(!queueA.isEmpty() && d >= 1) {
					while(!queueA.isEmpty() && queueA.peek().a != 'D') queueA.poll();
					score += queueA.poll().p;
					d -= 1;
				}
			}
		}
		System.out.println(score);
		
		
		
		
		
		
		
	}
	static class DataB implements Comparable<DataB> {
		char b;
		char c;
		int  q;
		@Override
		public int compareTo(DataB o) {
			return o.q - this.q;
		}
		DataB(char b, char c, int q) {
			this.b = b;
			this.c = c;
			this.q = q;
		}
		
	}
	static class DataA implements Comparable<DataA> {
		char a;
		int p;
		@Override
		public int compareTo(DataA o) {
			return o.p - this.p;
		}
		DataA(char a, int b) {
			this.a = a;
			this.p = b;
		}
		
		
	}
	
}