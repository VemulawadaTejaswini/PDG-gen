import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int N = scan.nextInt();
			long[] A = new long[N];
			for(int index = 0; index < N; index++) {
				A[index] = scan.nextLong();
			}
			scan.nextLine();
			BigInteger X = BigInteger.ZERO;
			String[] S = scan.nextLine().split("");
			
			X = getSolution(S, A);
			
			if(!X.equals(BigInteger.ZERO)) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}
	public static BigInteger getSolution(String[] S, long[] A) {
		BigInteger X = BigInteger.ONE;
		
		Queue<Number> queue = new LinkedList<Number>();
		boolean found = false;
		queue.add(new Number(BigInteger.ZERO, 0L, Integer.parseInt(S[0])));
		

		while(queue.size() != 0 || found) {

			Number curr = queue.poll();
			BigInteger currA = curr.current;
			long currMoves = curr.numMoves;
			int playerNumber = curr.playerNumber;

			
			if(currA.equals(BigInteger.ZERO) && currMoves == (S.length)) {
				found = true;
				X = BigInteger.ZERO;
				break;
			}
			if(currMoves+1 <= S.length) {
				BigInteger optionOne = currA.xor(BigInteger.valueOf(A[(int) (currMoves)]));
				if(S[(int) currMoves].equals("1")) {
					if(currA.equals(BigInteger.ZERO)) {
						if(!optionOne.equals(BigInteger.ZERO)) {
							queue.add(new Number(optionOne, currMoves+1, Integer.parseInt(S[(int) currMoves])));
						}
					}
					else {
						queue.add(new Number(currA, currMoves+1, Integer.parseInt(S[(int) currMoves])));
					}
				}
				else {
					queue.add(new Number(optionOne, currMoves+1, Integer.parseInt(S[(int) currMoves])));
					queue.add(new Number(currA, currMoves+1, Integer.parseInt(S[(int) currMoves])));
				}
				
				
			}
		}
		
		return X;
	}
}
class Number implements Comparable<Number>{
		public BigInteger current;
		public long numMoves;
		public int playerNumber;

		public Number(BigInteger current, long numMoves, int playerNumber) {
			this.current = current;
			this.numMoves = numMoves;
			this.playerNumber = playerNumber;
		}
		public int compareTo(Number o) {
			return current.compareTo(o.current);
		}
	}
