import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class Rect implements Comparable<Rect>{
		int height, width;
		
		public Rect(int w, int h){
			height = h;
			width = w;
		}

		public int dist(){
			return height * height + width * width;
		}
		
		@Override
		public int compareTo(Rect o) {
			int this_dist = dist();
			int o_dist = o.dist();
			
			if(this_dist != o_dist){
				return this_dist - o_dist;
			}else if(this.height != o.height){
				return this.height - o.height;
			}else{
				return 0;
			}
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + height;
			result = prime * result + width;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Rect other = (Rect) obj;
			if (height != other.height)
				return false;
			if (width != other.width)
				return false;
			return true;
		}
		
		@Override
		public String toString(){
			return this.height + " " + this.width;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Rect> list = new ArrayList<Rect>();
		
		for(int w = 1; w <= 150; w++){
			for(int h = 1; h < w; h++){
				list.add(new Rect(w, h));
			}
		}
		
		Collections.sort(list);
		//System.out.println(list);
		
		while (true) {
			final int h = sc.nextInt();
			final int w = sc.nextInt();
			
			if(h == 0 && w == 0){
				break;
			}
			
			Rect rect = new Rect(w, h);
			
			System.out.println(list.get(Collections.binarySearch(list, rect) + 1));
		}
	}
}