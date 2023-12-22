
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static final int LEFT = 0;
	private static final int RIGHT = 1;
	private static final int EndOfDirection = 2;
	
	private static ArrayList<Integer> a = new ArrayList<Integer>(10);
	private static ArrayList<Integer> left = new ArrayList<Integer>(10);
	private static ArrayList<Integer> right = new ArrayList<Integer>(10);
	private static ArrayList<String> result = new ArrayList<String>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int numDataSet = sc.nextInt();
		for(int i = 0; i < numDataSet; i++){
			pushBallsToA();
			if(popBallsAscendingOrder()){
				result.add("YES");
			}
			else{
				result.add("NO");
			}
		}
		
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
	
	public static void setA(ArrayList<Integer> a) {
		Ball.a = a;
	}
	
	public static void pushBallsToA(){
		a.clear();
		for(int i = 0; i < 10; i++){
			a.add(sc.nextInt());
		}
	}
	
	public static boolean popBallsAscendingOrder(){
		left.clear();
		right.clear();
		for(int directionBall1 = LEFT; directionBall1 < EndOfDirection; directionBall1++){
			for(int directionBall2 = LEFT; directionBall2 < EndOfDirection; directionBall2++){
				for(int directionBall3 = LEFT; directionBall3 < EndOfDirection; directionBall3++){
					for(int directionBall4 = LEFT; directionBall4 < EndOfDirection; directionBall4++){
						for(int directionBall5 = LEFT; directionBall5 < EndOfDirection; directionBall5++){
							for(int directionBall6 = LEFT; directionBall6 < EndOfDirection; directionBall6++){
								for(int directionBall7 = LEFT; directionBall7 < EndOfDirection; directionBall7++){
									for(int directionBall8 = LEFT; directionBall8 < EndOfDirection; directionBall8++){
										for(int directionBall9 = LEFT; directionBall9 < EndOfDirection; directionBall9++){
											for(int directionBall10 = LEFT; directionBall10 < EndOfDirection; directionBall10++){
												popBall(directionBall1, 0);
												popBall(directionBall2, 1);
												popBall(directionBall3, 2);
												popBall(directionBall4, 3);
												popBall(directionBall5, 4);
												popBall(directionBall6, 5);
												popBall(directionBall7, 6);
												popBall(directionBall8, 7);
												popBall(directionBall9, 8);
												popBall(directionBall10, 9);
												/*
												System.out.print("left:");
												for(int i = 0; i < left.size(); i++){
													System.out.print(left.get(i) + " ");
												}
												System.out.println();
												System.out.print("right:");
												for(int i = 0; i < right.size(); i++){
													System.out.print(right.get(i) + " ");
												}
												System.out.println();
												*/
												if(isAscendingOrder(left) && isAscendingOrder(right)){
													return true;
												}
												left.clear();
												right.clear();
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}		
		return false;
	}
	
	private static void popBall(int direction, int indexBall){
		switch(direction){
		case LEFT:
			left.add(a.get(indexBall));
			break;
		case RIGHT:
			right.add(a.get(indexBall));
			break;
		}
	}
	
	public static boolean isAscendingOrder(ArrayList<Integer> list){		
		for(int i = 0; i < list.size() - 2; i++){
			if(list.get(i) > list.get(i + 1)){
				return false;
			}
		}
		return true;
	}
}