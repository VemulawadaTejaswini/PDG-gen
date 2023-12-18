import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Solver.getInstance(new BallStorageImpl(), new AnswerSheetImpl()).solve();
	}
	
	static class Solver {
		private static Solver solver;
		
		public static Solver getInstance(BallStorage ballStorage, AnswerSheet answerSheet) {
			if(solver==null) solver = new Solver(ballStorage, answerSheet);
			return solver;
		}
		
		private final BallStorage ballStorage;
		private final AnswerSheet answerSheet;
		
		public Solver(BallStorage ballStorage, AnswerSheet answerSheet) {
			this.ballStorage = ballStorage;
			this.answerSheet = answerSheet;
		}
		
		public void solve() {
			List<Ball> balls = ballStorage.getBalls();
			CalcStrategy strategy = new GeniusStrategy(balls);
			for (int i = 0; i < balls.size(); i++) {
				answerSheet.writeDown(strategy.calcCombinationWithout(balls.get(i)));
			}
			answerSheet.submit();
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
			balls = new ArrayList<>();
			for(int index=1;index<=numOfBalls;index++) balls.add(new Ball(sc.nextInt()));
			sc.close();
		}
		
		@Override
		public List<Ball> getBalls() {
			return balls;
		}
	}
	
	static interface AnswerSheet {
		public void writeDown(long answer);
		public void submit();
	}
	
	static class AnswerSheetImpl implements AnswerSheet{
		private List<Long> answers;
		
		public AnswerSheetImpl() {
			answers = new ArrayList<>();
		}
		
		@Override
		public void writeDown(long answer) {
			answers.add(answer);
		}

		@Override
		public void submit() {
			for(long answer : answers) System.out.println(answer);
		}
		
	}

	static class BallBox {
		static public BallBox getNewBox(Ball ball) {
			BallBox box = new BallBox();
			box.add(ball);
			return box;
		}
		
		private List<Ball> balls;
		private boolean isCalculated;
		private long combinationOfAllBalls;
		private long combinationOfMinusOneBalls;
		
		public BallBox() {
			balls = new ArrayList<>();
			isCalculated = false;
			combinationOfAllBalls = 0;
			combinationOfMinusOneBalls = 0;
		}
		
		public void add(Ball ball) {
			balls.add(ball);
		}
		
		public long getCombinationOfAllBalls() {
			if(!isCalculated) calcCombination();
			return combinationOfAllBalls;
		}
		
		public long getCombinationOfMinusOneBalls() {
			if(!isCalculated) calcCombination(); 
			return combinationOfMinusOneBalls;
		}
		
		private void calcCombination() {
			if(balls.size()>1) {
				combinationOfAllBalls = CalcUtil.nC2(balls.size());
			}
			if(balls.size()>2) {
				combinationOfMinusOneBalls = CalcUtil.nC2(balls.size()-1);
			}
			isCalculated = true;
		}
	}
	
	static class Ball {
		private int number;
		
		public Ball(int number) {
			this.number = number;
		}
		
		public int getNumber() {
			return number;
		}
		
	}
	
	static class CalcUtil {
		public static long nC2(int n) {
			return (long)n * (long)(n-1) / 2;
		}
	}

	static interface CalcStrategy {
		public long calcCombinationWithout(Main.Ball ball);
	}
	static public class NaiveStrategy implements CalcStrategy {
		private final List<Ball> balls;

		public NaiveStrategy(List<Ball> balls) {
			this.balls = balls;
		}

		@Override
		// O(N)
		public long calcCombinationWithout(Main.Ball ballToExclude) {
			/*
			 here you can implement the logic naively
			 	- Group by number in O(N)
			 	- sum up nC2 for each group
			 */
			return 0;
		}
	}

	static public class GeniusStrategy implements CalcStrategy {
		private final List<Ball> balls;
		private final Map<Integer,BallBox> ballBoxes;
		private long sumOfCombinationOfAllBalls;

		public GeniusStrategy(List<Ball> balls) {
			this.balls = balls;
			ballBoxes = new HashMap<>();
			sumOfCombinationOfAllBalls = 0;
			this.prepareForFastCalculation();
		}

		// O(N)
		private void prepareForFastCalculation() {
			for(Ball ball : balls) {
				if(ballBoxes.containsKey(ball.getNumber())) ballBoxes.get(ball.getNumber()).add(ball);
				else ballBoxes.put(ball.getNumber(), BallBox.getNewBox(ball));
			}
			for(BallBox ballBox : ballBoxes.values()) {
				sumOfCombinationOfAllBalls += ballBox.getCombinationOfAllBalls();
			}
		}

		// O(1)
		@Override
		public long calcCombinationWithout(Main.Ball ball) {
			return sumOfCombinationOfAllBalls
					- ballBoxes.get(ball.getNumber()).getCombinationOfAllBalls()
					+ ballBoxes.get(ball.getNumber()).getCombinationOfMinusOneBalls();
		}
	}
}