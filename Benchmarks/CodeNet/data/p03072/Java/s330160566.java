import java.util.Scanner;
public class Main {

	static int[] mountain;
	static int total=0;

	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	mountain=new int[sc.nextInt()];
      	for(int i=0;i<mountain.length;i++) {
      		mountain[i]=sc.nextInt();
      	}

      	for(int i=0;i<mountain.length;i++) {
      		cansee(i);
      	}

		System.out.println(total);
	}

	public static void cansee(int num) {
		int tall=mountain[num];
		for(num--;num>=0;num--) {
			if(mountain[num]>tall)
				return;
		}
		total++;
	}
}