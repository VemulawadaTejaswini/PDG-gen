import java.util.*;
public class Main {
	private static boolean debug = false;
	private static String[] board;
	private static int[][] score;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		score = new int[w][h];
		board = new String[h];
		for(int i=0;i<h;i++) {
			board[i] = sc.next();
			sc.nextLine();
		}

		if(debug) {
			for(int i=0;i<h;i++) {
				System.out.println(i + ": " + board[i]);
			}
		}

		int starti = -1;
		int startj = -1;
		int goali = -1;
		int goalj = -1;
		int goalscore = -1;
		for(int i=0;i<h;i++) {
			//if(debug) {System.out.println("i: " + i);}
			for(int j=0;j<w;j++) {
				//if(debug) {System.out.println("j: " + j);}
				char targetc = board[i].charAt(j);

				if(targetc == '.') {
					starti = i;
					startj = j;
				} else {
					continue;
				}
				
				for(int i2=0;i2<h;i2++) {
					//if(debug) {System.out.println("i2: " + i2);}
					for(int j2=0;j2<w;j2++) {
						//if(debug) {System.out.println("j2: " + j2);}
						char targetc2 = board[i].charAt(j);
						if(i2==starti && j2==startj) {
							continue;
						} else if(targetc2 == '.') {
							goali = i2;
							goalj = j2;
						} else {
							continue;
						}


						//再帰処理
						if(debug) {
							System.out.println("starti: " + starti);
							System.out.println("startj: " + startj);
							System.out.println("goali: " + goali);
							System.out.println("goalj: " + goalj);
							System.out.println("go start");
						}

						for(int iidx=0;iidx<h;iidx++) {
							for(int jidx=0;jidx<w;jidx++) {
								score[jidx][iidx] = 0;
							}
						}
						go(starti,startj);
						int tmpgoalscore = score[goalj][goali];
						if(goalscore == -1) {
							goalscore = tmpgoalscore;
						} else if(goalscore < tmpgoalscore) {
							goalscore = tmpgoalscore;
						}
					}
				}
			}
		}
		System.out.println(goalscore);
	}

	private static void go(int i, int j) {
		int w = score.length;
		int h = score[0].length;
		int tmpscore = score[j][i];
		if(i-1>=0 && board[i-1].charAt(j) == '.') {
			if(score[j][i-1] == 0) {
				score[j][i-1] = tmpscore+1;
				if(debug) {System.out.println("goup");}
				go(i-1,j);
			} else if(score[j][i-1] > tmpscore+1) {
				score[j][i-1] = tmpscore+1;
				go(i-1,j);
				if(debug) {System.out.println("goup");}
			} else {
				//nothing
			}
		}
		if(j-1>=0 && board[i].charAt(j-1) == '.') {
			if(score[j-1][i] == 0) {
				score[j-1][i] = tmpscore+1;
				if(debug) {System.out.println("goleft");}
				go(i,j-1);
			} else if(score[j-1][i] > tmpscore+1) {
				score[j-1][i] = tmpscore+1;
				if(debug) {System.out.println("goleft");}
				go(i,j-1);
			} else {
				//nothing
			}
		}
		if(i+1<h && board[i+1].charAt(j) == '.') {
			if(score[j][i+1] == 0) {
				score[j][i+1] = tmpscore+1;
				if(debug) {System.out.println("godown");}
				go(i+1,j);
			} else if(score[j][i+1] > tmpscore+1) {
				score[j][i+1] = tmpscore+1;
				if(debug) {System.out.println("godown");}
				go(i+1,j);
			} else {
				//nothing
			}
		}
		if(j+1<w && board[i].charAt(j+1) == '.') {
			if(score[j+1][i] == 0) {
				score[j+1][i] = tmpscore+1;
				if(debug) {System.out.println("goright");}
				go(i,j+1);
			} else if(score[j+1][i] > tmpscore+1) {
				score[j+1][i] = tmpscore+1;
				if(debug) {System.out.println("goright");}
				go(i,j+1);
			} else {
				//nothing
			}
		}
	}
}
