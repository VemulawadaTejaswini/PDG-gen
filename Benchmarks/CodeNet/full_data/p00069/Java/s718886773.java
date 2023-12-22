import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numVerticalLines, vLineSelected, goalLine, dan;
		int[][] horizontalLine = null;
		while((numVerticalLines = sc.nextInt()) != 0){
			vLineSelected = sc.nextInt();
			goalLine = sc.nextInt();
			dan = sc.nextInt();
			horizontalLine = new int[dan][numVerticalLines];
			//get Line data
			for(int i = 0; i < horizontalLine.length; i++){
				String input = sc.next();
				for(int j = 0; j < horizontalLine[0].length - 1; j++){
					horizontalLine[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
				}
			}
			//show result
			System.out.println(solve(vLineSelected, goalLine, horizontalLine));
		}
		sc.close();
	}
	
	public static String solve(int vLineSelected, int goalLine, int[][] horizontalLine){
		if(getPosition(vLineSelected - 1, horizontalLine)[0] == getLineToGoal(goalLine - 1, horizontalLine)[0])
			return "0";
		int[] o = getNewLinePosition(getPosition(vLineSelected - 1, horizontalLine), getLineToGoal(goalLine - 1, horizontalLine), horizontalLine);
		return (o == null)? "1" : ((o[0] + 1) + " " + (o[1] + 1));
	}
	
	private static final int LINE = 1;
	private static final int NO_LINE = 0;
	
	public static int[] getNewLinePosition(int[] pos, int[] goal, int[][] horizontalLine){
		//経路情報を上から参照していく
		for(int dan = 0; dan < pos.length; dan++){
			//隣り合っていて、線を引くことが出来る場合段数を返す
			if(Math.abs(pos[dan] - goal[dan]) == 1){
				int min = Math.min(pos[dan], goal[dan]);
				//既にラインがあれば次の段へ
				if(horizontalLine[dan][min] == LINE)	continue;
				//引くラインの左に線があれば次の段へ
				if(0 < min && horizontalLine[dan][min - 1] == LINE)	continue;
				//引くラインの右に線があれば次の段へ
				if(min < horizontalLine[0].length - 1 && horizontalLine[dan][min + 1] == LINE) continue;
				
				return new int[]{dan, Math.min(pos[dan], goal[dan])};
			}
		}
		return null;
	}
	
	public static int[] getPosition(int n, int[][] horizontalLine){
		int[] pos = new int[horizontalLine.length];
		//横線情報を上から参照していく
		int currentPos = n;
		int tmp;
		for(int d = 0; d < horizontalLine.length; d++){
			tmp = currentPos;
			//左となりの縦線チェック
			if(tmp != 0 && horizontalLine[d][tmp - 1] == LINE){
				currentPos--;
			}
			//右となりの縦線チェック
			else if(tmp != horizontalLine[0].length && horizontalLine[d][tmp] == LINE){
				currentPos++;
			}
			pos[d] = currentPos;
		}
		return pos;
	}

	public static int[] getLineToGoal(int goal, int[][] horizontalLine){
		int[] goalOn = new int[horizontalLine.length];
		//横線情報を下から参照していく
		int currentGoal = goal;
		int tmp;
		for(int d = horizontalLine.length - 1; d >= 0; d--){
			tmp = currentGoal;
			//左となりの縦線チェック
			if(tmp != 0 && horizontalLine[d][tmp - 1] == LINE){
				currentGoal--;
			}
			//右となりの縦線チェック
			else if(tmp != horizontalLine[0].length && horizontalLine[d][tmp] == LINE){
				currentGoal++;
			}
			goalOn[d] = tmp;
		}
		return goalOn;
	}
}