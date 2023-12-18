import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] sArray = sc.next().split("");
		int[] rList = new int[n+1];
		int[] gList = new int[n+1];
		int[] bList = new int[n+1];
		long redCount = 0;
		long greenCount = 0;
		long blueCount = 0;
		for(int i =0;i < sArray.length;i++) {
			if(sArray[i].equals("R")) {
				redCount++;
				rList[i+1]++;
			}
			if(sArray[i].equals("G")) {
				greenCount++;
				gList[i+1]++;
			}
			if(sArray[i].equals("B")) {
				blueCount++;
				bList[i+1]++;
			}
		}
		long answer = redCount * greenCount * blueCount;
		if(answer == 0) {
			System.out.println(0);
			return;
		}
		for(int red =1;red <= n;red++) {
			if(rList[red] ==0) {
				continue;
			}
			for(int green =1;green <= n;green++) {
				if(gList[green] ==0) {
					continue;
				}
				if(red > green) {
					if(red + (red -green)<=n) {
						if(bList[(red + (red -green))] == 1) {
							answer--;
						}
					}
					if(green - (red -green)>0) {
						if(bList[(green - (red -green))] == 1) {
							answer--;
						}
					}
				}else {
					if(green + (green -red)<=n) {
						if(bList[(green + (green -red))] == 1) {
							answer--;
						}
					}
					if(red - (green -red)>0) {
						if(bList[(red - (green -red))] == 1) {
							answer--;
						}
					}

				}
				if((red + green)%2 ==0 ) {
					if(bList[((red +green)/2)] == 1) {
						answer--;
					}
				}
			}
		}

		System.out.println(answer);
	}

}