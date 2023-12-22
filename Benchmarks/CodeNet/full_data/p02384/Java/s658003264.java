import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ravel[] = new int[6];
		for(int i = 0; i < 6; i++){
			ravel[i] = scan.nextInt();
		}
		Dice dice = new Dice(ravel);
		int q = scan.nextInt();
		int ans[] = new int[q];
		for(int i = 0; i < q; i++){
			int top = scan.nextInt();
			int front = scan.nextInt();
			ans[i] = dice.Right(top, front);
		}
		scan.close();
		for(int i = 0; i < q; i++){
			System.out.println(ans[i]);
		}
	}

	static class Dice{
		public int ravel[] = new int[6];

		public Dice(int[] _ravel) {
			ravel = _ravel;
		}

		public int Right(int topRavel, int frontRavel) {
			this.ShowSpecifiedTop(topRavel);
			this.ShowSpecifiedFront(frontRavel);
			return ravel[2];
		}

		public void ShowSpecifiedTop(int topRavel){
			int pos = 0;
			for(int i = 0; i < 6; i++){
				if(ravel[i] == topRavel){
					pos = i;
				}
			}
			switch(pos){
			case 0:
				break;
			case 1:
				this.MoveExec('N');
				break;
			case 2:
				this.MoveExec('W');
				break;
			case 3:
				this.MoveExec('E');
				break;
			case 4:
				this.MoveExec('S');
				break;
			case 5:
				this.Move("NN");
				break;
			}
		}

		public void ShowSpecifiedFront(int frontRavel){
			int pos = 1;
			for(int i = 1; i < 4; i++){
				if(ravel[i] == frontRavel){
					pos = i;
				}
			}
			int[] oldRavel = ravel.clone();
			switch(pos){
			case 1:
				break;
			case 2:
				ravel[1] = oldRavel[2];
				ravel[2] = oldRavel[4];
				ravel[4] = oldRavel[3];
				ravel[3] = oldRavel[1];
				break;
			case 3:
				ravel[1] = oldRavel[3];
				ravel[3] = oldRavel[4];
				ravel[4] = oldRavel[2];
				ravel[2] = oldRavel[1];
				break;
			case 4:
				ravel[1] = oldRavel[4];
				ravel[3] = oldRavel[2];
				ravel[4] = oldRavel[1];
				ravel[2] = oldRavel[3];
				break;
			}
		}

		public void Move(String order){
			char ch[] = order.toCharArray();
			for(int i = 0; i < ch.length; i++){
				MoveExec(ch[i]);
			}
		}

		private void MoveExec(char chOrder){
			int[] oldRavel = ravel.clone();
			switch(chOrder){
			case 'E':
				ravel[0] = oldRavel[3];
				ravel[3] = oldRavel[5];
				ravel[5] = oldRavel[2];
				ravel[2] = oldRavel[0];
				break;
			case 'N':
				ravel[0] = oldRavel[1];
				ravel[1] = oldRavel[5];
				ravel[5] = oldRavel[4];
				ravel[4] = oldRavel[0];
				break;
			case 'S':
				ravel[0] = oldRavel[4];
				ravel[4] = oldRavel[5];
				ravel[5] = oldRavel[1];
				ravel[1] = oldRavel[0];
				break;
			case 'W':
				ravel[0] = oldRavel[2];
				ravel[2] = oldRavel[5];
				ravel[5] = oldRavel[3];
				ravel[3] = oldRavel[0];
				break;
			}
		}
	}
}