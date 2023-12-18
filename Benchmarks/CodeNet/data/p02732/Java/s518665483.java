package abc159;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProblemD {

	public static void main(String[] args) {
		Solver.getInstance().solve();
	}
	
	static class Solver {
		private static Solver solver = new Solver();
		
		public static Solver getInstance() {
			return solver;
		}
		
		private BallStorage ballStorage;
		private Operator operator;
		
		public Solver() {
			this.ballStorage = new BallStorageImpl();
			this.operator = new Operator();
		}
		
		public void solve() {
			List<Ball> balls = ballStorage.getBalls();
			operator.arrange(balls);
			for(Ball ball : balls) operator.calcCombinationWithout(ball);
			operator.submitAnswer();
		}
	}
	
	static interface BallStorage {
		public List<Ball> getBalls();
	}
	
	static class BallStorageImpl implements BallStorage {
		private List<Ball> balls;
		
		public BallStorageImpl() {
			Scanner sc = new Scanner(System.in);
			int numOfBalls = sc.nextInt();
			this.balls = new ArrayList<>();
			for(int index=1;index<=numOfBalls;index++) balls.add(new Ball(index,sc.nextInt()));
			sc.close();
		}
		
		@Override
		public List<Ball> getBalls() {
			return this.balls;
		}
	}
	
	static interface AnswerSheet {
		public void writeDown(int answer);
		public void submit();
	}
	
	static class AnswerSheetImpl implements AnswerSheet{
		private List<Integer> answers;
		
		public AnswerSheetImpl() {
			this.answers = new ArrayList<>();
		}
		
		@Override
		public void writeDown(int answer) {
			answers.add(answer);
		}

		@Override
		public void submit() {
			for(int answer : answers) System.out.println(answer);
		}
		
	}
	
	static class Operator {
		private Map<Integer,BallBox> ballBoxes;
		private int sumOfCombinationOfAllBalls;
		private AnswerSheet answerSheet;
		
		public Operator() {
			this.ballBoxes = new HashMap<>();
			this.sumOfCombinationOfAllBalls = 0;
			this.answerSheet = new AnswerSheetImpl();
		}
		
		public void arrange(List<Ball> balls) {
			for(Ball ball : balls) {
				if(ballBoxes.containsKey(ball.getNumber())) ballBoxes.get(ball.getNumber()).add(ball);
				else ballBoxes.put(ball.getNumber(), BallBox.getNewBox(ball));
			}
			for(BallBox ballBox : ballBoxes.values()) {
				this.sumOfCombinationOfAllBalls += ballBox.getCombinationOfAllBalls();
			}
		}
		
		public void calcCombinationWithout(Ball ball) {
			int combinationWithoutSpecificBall = sumOfCombinationOfAllBalls 
					- ballBoxes.get(ball.getNumber()).getCombinationOfAllBalls()
					+ ballBoxes.get(ball.getNumber()).getCombinationOfMinusOneBalls();
			answerSheet.writeDown(combinationWithoutSpecificBall);
		}
		
		public void submitAnswer() {
			answerSheet.submit();
		}
	}
	
	
	static class BallBox {
		static public BallBox getNewBox(Ball ball) {
			BallBox box = new BallBox(ball.getNumber());
			box.add(ball);
			return box;
		}
		
		private int number;
		private List<Ball> balls;
		private boolean isCalculated;
		private int combinationOfAllBalls;
		private int combinationOfMinusOneBalls;
		
		public BallBox(int number) {
			this.number = number;
			this.balls = new ArrayList<>();
			this.isCalculated = false;
			this.combinationOfAllBalls = 0;
			this.combinationOfMinusOneBalls = 0;
		}
		
		public void add(Ball ball) {
			balls.add(ball);
		}
		
		public int getCombinationOfAllBalls() {
			if(isCalculated) return combinationOfAllBalls;
			else {
				if(!isCalculated) calcCombination();
				return combinationOfAllBalls;
			}
		}
		
		public int getCombinationOfMinusOneBalls() {
			if(isCalculated) return combinationOfMinusOneBalls;
			else {
				if(!isCalculated) calcCombination();
				return combinationOfAllBalls;
			}
		}
		
		private void calcCombination() {
			isCalculated = true;
			if(balls.size()>1) {
				combinationOfAllBalls = CalcUtil.nCk(balls.size(), 2, 100000007);
			}
			if(balls.size()>2) {
				combinationOfMinusOneBalls = CalcUtil.nCk(balls.size()-1, 2, 100000007);
			}
		}
	}
	
	static class Ball {
		private int index;
		private int number;
		
		public Ball(int index,int number) {
			this.index = index;
			this.number = number;
		}
		
		public int getIndex() {
			return this.index;
		}
		
		public int getNumber() {
			return this.number;
		}
		
	}
	
	static class CalcUtil {
		private static long pow(long a,long b,int M) {
			long ret = 1;
			long tmp = a;
			while(b>0) {
				if((b&1)==1) ret = (ret * tmp) % M;
				tmp = (tmp * tmp) % M;
				b = b>>1;
			}
			return ret;
		}
		
		public static int nCk(int n,int k,int M) {
			long ret = 1;
			int min = Math.min(k, n-k);
			for(int i=1;i<=min;i++) {
				ret = (ret * pow(i,M-2,M)) % M;
			}
			for(int i=n-min+1;i<=n;i++) {
				ret = (ret * i) % M;
			}
			return (int)ret;
		}
	}
	

}
