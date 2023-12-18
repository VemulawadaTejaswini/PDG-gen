import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int people = sc.nextInt();
		int i,j;
		Stop[] stops = new Stop[number];
		
		for(i=0;i<number;i++) {
			Stop target = new Stop(sc.nextInt(),sc.nextInt(),sc.nextInt());
			for(j=i;j>0;j--) {
				if(stops[j-1].place > target.place)
					stops[j] = stops[j-1];
				else {
					stops[j] = target;
					break;
				}
			}
			if(j==0)
				stops[0] = target;
		}
		
		for(i=0;i<people;i++) {
			int start = sc.nextInt();
			for(j=0;j<number;j++) {
				int time =	start+stops[j].place;
				if(time >= stops[j].start && time < stops[j].end) {
					System.out.println(stops[j].place);
					break;
				}
			}
			if(j==number)
				System.out.println(-1);
		}
		sc.close();
	}
}

class Stop{
	int start,end,place;
	Stop(int start,int end,int place){
		this.start = start;
		this.end = end;
		this.place = place;
	}
}