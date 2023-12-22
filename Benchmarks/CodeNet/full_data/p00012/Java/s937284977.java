
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private static final int X = 0;
	private static final int Y = 1;
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Double> p1 = new ArrayList<Double>(2);
		ArrayList<Double> p2 = new ArrayList<Double>(2);
		ArrayList<Double> p3 = new ArrayList<Double>(2);
		ArrayList<Double> pTarget = new ArrayList<Double>(2);
		
		ArrayList<Boolean> results = new ArrayList<Boolean>();
		
		try{
			while(true){
				setInputs(p1, p2, p3, pTarget);
		
				ArrayList<Double> cog = getCenterOfGravity(p1, p2, p3);  
		
				results.add(isInTriangle(p1, p2, p3, cog, pTarget));
				
				p1.clear();
				p2.clear();
				p3.clear();
				pTarget.clear();
				cog.clear();
			}
		}catch(NoSuchElementException e){
			//½àµÈ¢
		}
		
		for(int i = 0; i < results.size(); i++){
			printIsInTriangle(results.get(i));
		}
	}
	
	private static void printIsInTriangle(boolean isInTriangle){
		String result;
		if(isInTriangle){
			result = "YES";
		}
		else{
			result = "NO";
		}
		System.out.println(result);
	}
	
	private static boolean isInTriangle(
			ArrayList<Double> p1,
			ArrayList<Double> p2,
			ArrayList<Double> p3,
			ArrayList<Double> cog,
			ArrayList<Double> pTarget){
		//¼üp1,p2Æ¼üpTarget,cogªð··éêApTargetÍOp`p1p2p3ÌO
		if(isInBiggerArea(p1, p2, pTarget) && !(isInBiggerArea(p1, p2, cog))){
			return false;
		}
		if(!(isInBiggerArea(p1, p2, pTarget)) && isInBiggerArea(p1, p2, cog)){
			return false;
		}
		
		//¼üp2,p3Æ¼üpTarget,cogªð··éêApTargetÍOp`p1p2p3ÌO
		if(isInBiggerArea(p2, p3, pTarget) && !(isInBiggerArea(p2, p3, cog))){
			return false;
		}
		if(!(isInBiggerArea(p2, p3, pTarget)) && isInBiggerArea(p2, p3, cog)){
			return false;
		}
		
		//¼üp1,p3Æ¼üpTarget,cogªð··éêApTargetÍOp`p1p2p3ÌO
		if(isInBiggerArea(p1, p3, pTarget) && !(isInBiggerArea(p1, p3, cog))){
			return false;
		}
		if(!(isInBiggerArea(p1, p3, pTarget)) && isInBiggerArea(p1, p3, cog)){
			return false;
		}
		
		return true;
	}
	
	private static boolean isInBiggerArea(
			ArrayList<Double> p1,
			ArrayList<Double> p2,
			ArrayList<Double> p3){
		double result = (p3.get(Y) - p1.get(Y)) * (p2.get(X) - p1.get(X)) + (p2.get(Y) - p1.get(Y)) * (p1.get(X) - p3.get(X));
		if(result > 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static ArrayList<Double> getCenterOfGravity(
			ArrayList<Double> p1,
			ArrayList<Double> p2,
			ArrayList<Double> p3){
		ArrayList<Double> cog = new ArrayList<Double>(2);
		cog.add((p1.get(X) + p2.get(X) + p3.get(X)) / 3);
		cog.add((p1.get(Y) + p2.get(Y) + p3.get(Y)) / 3);
		return cog;
	}
	
	private static void setInputs(
			ArrayList<Double> p1,
			ArrayList<Double> p2,
			ArrayList<Double> p3,
			ArrayList<Double> p4){
		p1.add(sc.nextDouble());
		p1.add(sc.nextDouble());
		p2.add(sc.nextDouble());
		p2.add(sc.nextDouble());
		p3.add(sc.nextDouble());
		p3.add(sc.nextDouble());
		p4.add(sc.nextDouble());
		p4.add(sc.nextDouble());
	}
}