
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// posList to record the position for the left side of every valley
		LinkedList<Integer> posList = new LinkedList<Integer>();
		// areaList to record the area for every valley
		LinkedList<Record> areaList = new LinkedList<Record>();
		
		// sum to record whole area, area to record the area for every valley
		int sum = 0, area=0;
		
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split("");
		sc.close();
		for (int i=0; i<input.length; i++) {
			if ("\\".equals(input[i])) {
				posList.add(i);
			} else if ("/".equals(input[i]) && (!posList.isEmpty())) {
				Integer leftPos = posList.removeLast();
				sum += i - leftPos;
				area = i - leftPos;
				
				// while to sum up all the area for the deep valley that includes small valleys
				// like "\\/\//", there are two floors to assemble the whole area
				// areaList push the area of first "\/", then push the second "\/", then include the area of the second floor "\   /"
				while (!areaList.isEmpty() && areaList.getLast().getPos()>leftPos) {
					area += areaList.removeLast().getArea();
				}
				areaList.add(new Record(leftPos, area));
			}
		}
		
		System.out.println(sum);
		System.out.print(areaList.size());
		while (!areaList.isEmpty()) {
			System.out.print(" " + areaList.removeFirst().getArea());
		}
		System.out.println();
		
	}
	
	

}

class Record {
	private int pos;
	private int area;
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Record(int pos, int area) {
		super();
		this.pos = pos;
		this.area = area;
	}
	
}
