import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=(sc.nextInt())-1;
		int Y=(sc.nextInt())-1;
		int ans[]=new int[N-1];

		for(int start=0;start<N-1;start++) {
			for(int goal=start+1;goal<N;goal++) {
				if(start<=X) {
				if(goal<=X) {
					ans[goal-start-1]++;
				}else {
					if((X+Y+1)/2>=goal) {
						ans[goal-start-1]++;
					}else {
						//System.out.println("a");
						ans[X-start+Math.abs(goal-Y)]++;
					}
				}}else {
					if(start-X+Math.abs(goal-Y)+1<=goal-start) {
						ans[start-X+Math.abs(goal-Y)]++;
					}else {
						ans[goal-start-1]++;
					}
				}

			}
		}
		for(int i=0;i<N-1;i++) {
			System.out.println(ans[i]);
		}

	}
}
