import java.util.LinkedList;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] input = new int[9];
		String[] first = s.nextLine().split(" ");
		input[0] = Integer.parseInt(first[0]);
		input[1] = Integer.parseInt(first[1]);
		input[2] = Integer.parseInt(first[2]);

		String[] second = s.nextLine().split(" ");
		input[3] = Integer.parseInt(second[0]);
		input[4] = Integer.parseInt(second[1]);
		input[5] = Integer.parseInt(second[2]);

		String[] three = s.nextLine().split(" ");
		input[6] = Integer.parseInt(three[0]);
		input[7] = Integer.parseInt(three[1]);
		input[8] = Integer.parseInt(three[2]);

		System.out.println(solve(input));
	}

	public static int solve(int[] input) {
		int cnt = 0;
		LinkedList<int[]> queue = new LinkedList<int[]>();
		LinkedList<Integer> cntQueue = new LinkedList<Integer>();
		queue.offer(input);
		cntQueue.offer(0);

		while(! queue.isEmpty()) {
			int[] ban = queue.poll();
			cnt = cntQueue.poll();
			//??????
			if(check(ban))
				break;
			else {
				int zeroIndex = 0;
				for(int i=0 ; i<ban.length ; i++) {
					if(ban[i] == 0)
						zeroIndex = i;
				}

				switch (zeroIndex) {
				//????????????????????´???
				case 0:
					int[] copyArray = ban.clone();
					copyArray[0] = copyArray[1];
					copyArray[1] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[0] = copyArray[3];
					copyArray[3] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);
					break;

				//??????????????????????????´???
				case 1:
					copyArray = ban.clone();
					copyArray[1] = copyArray[0];
					copyArray[0] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[1] = copyArray[4];
					copyArray[4] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[1] = copyArray[2];
					copyArray[2] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);
					break;

				//????????????????????´???
				case 2:
					copyArray = ban.clone();
					copyArray[2] = copyArray[1];
					copyArray[1] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[2] = copyArray[5];
					copyArray[5] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);
					break;

				//?????????????????´???
				case 3:
					copyArray = ban.clone();
					copyArray[3] = copyArray[0];
					copyArray[0] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[3] = copyArray[4];
					copyArray[4] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[3] = copyArray[6];
					copyArray[6] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);
					break;

				//???????????????????????´???
				case 4:
					copyArray = ban.clone();
					copyArray[4] = copyArray[1];
					copyArray[1] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[4] = copyArray[3];
					copyArray[3] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[4] = copyArray[5];
					copyArray[5] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[4] = copyArray[7];
					copyArray[7] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);
					break;

				//?????????????????´???
				case 5:
					copyArray = ban.clone();
					copyArray[5] = copyArray[2];
					copyArray[2] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[5] = copyArray[4];
					copyArray[4] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[5] = copyArray[8];
					copyArray[8] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);
					break;

				//????????????????????´???
				case 6:
					copyArray = ban.clone();
					copyArray[6] = copyArray[3];
					copyArray[3] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[6] = copyArray[7];
					copyArray[7] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);
					break;

				//??????????????????????????´???
				case 7:
					copyArray = ban.clone();
					copyArray[7] = copyArray[6];
					copyArray[6] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[7] = copyArray[4];
					copyArray[4] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[7] = copyArray[8];
					copyArray[8] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);
					break;

				//????????????????????´???
				case 8:
					copyArray = ban.clone();
					copyArray[8] = copyArray[5];
					copyArray[5] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);

					copyArray = ban.clone();
					copyArray[8] = copyArray[7];
					copyArray[7] = 0;
					queue.offer(copyArray);
					cntQueue.offer(cnt+1);
					break;

				default:
					break;
				}
			}
		}
		return cnt;
	}

	public static boolean check(int[] ban) {
		for(int i=0 ; i<ban.length ; i++) {
			if(i!=8 && ban[i]!=(i+1))
				return false;
			if(i==8 && ban[i]!=0)
				return false;
		}
		return true;
	}
}