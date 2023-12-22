package volume0;

import java.util.Arrays;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int datasetnum = 1;
		while(true) {
			int maxcost = sc.nextInt(); if(maxcost == 0) break;
			int n = sc.nextInt();
			int[] value = new int[n];
			int[] cost = new int[n];
			
			for(int i = 0; i < n; i++) {
				String line = sc.next();
				Scanner scstr = new Scanner(line);
				scstr.useDelimiter(",");
				
				value[i] = scstr.nextInt();
				cost[i] = scstr.nextInt();
				scstr.close();
			}
			
			KnapsackProblem p = new KnapsackProblem(value, cost, maxcost);
			KnapsackSolution sol = p.solve();
			System.out.println("Case " + datasetnum++ + ":");
			System.out.println(p.valueOf(sol));
			System.out.println(p.costOf(sol));
		}
		sc.close();
	}
	
}

class KnapsackSolution{
	private boolean[] solution;
	
	public boolean[] getAsArray() {
		return solution;
	}
	
	public int size() {
		return solution.length;
	}
	
	public KnapsackSolution(boolean [] sol) {
		solution = sol;
	}
	
	public KnapsackSolution add(boolean b) {
		boolean[] result = Arrays.copyOf(solution, solution.length+1);
		result[result.length-1] = b;
		return new KnapsackSolution(result);
	}
	
	public void set(boolean[] sol) {
		this.solution = sol;
	}

	public String toString() {
		String result = "";
		for(boolean b: solution) {
			if(b) result += "1, ";
			else result += "0, ";
		}
		return result;
	}
}

class KnapsackProblem{
	private int[] value;
	private int[] cost;
	private int maxcost;
	private int size;
	private KnapsackSolution presentSol;
	
	public KnapsackProblem(int[] value, int[] cost, int max_cost) {
		this.value = value;
		this.cost = cost;
		this.size = value.length;
		this.maxcost = max_cost;
	}
	
	public int costOf(KnapsackSolution s) {
		if(s == null) return 0;
		boolean[] sol = s.getAsArray();
		int result = 0;
		for(int i = 0; i < s.size(); i++) {
			if(sol[i]) result += cost[i];
		}
		return result;
	}
	
	public int valueOf(KnapsackSolution s) {
		if(s == null) return 0;
		boolean[] sol = s.getAsArray();
		int result = 0;
		for(int i = 0; i < s.size(); i++) {
			if(sol[i]) result += value[i];
		}
		return result;
	}
	
	public int maxValueOf(KnapsackSolution s) {
		if(s == null) return 0;
		boolean[] sol = s.getAsArray();
		int result = 0;
		int i;
		for(i = 0; i < s.size(); i++) {
			if(sol[i]) result += value[i];
		}
		for(; i < size; i++) {
			result += value[i];
		}
		return result;
	}
	
	private boolean isPracticable(KnapsackSolution s) {
		if(costOf(s) <= maxcost) return true;
		else return false;
	}
	
	public KnapsackSolution solve() {
		this.presentSol = new KnapsackSolution(new boolean[0]);
		return solve(new KnapsackSolution(new boolean[0]));
	}
	

	private KnapsackSolution solve(KnapsackSolution s) {
		if(s == null) {
			return null;
			
			
		}else if(s.size() == size){
			if(isPracticable(s) && valueOf(s) > valueOf(presentSol)) {
				presentSol = s;
				return s;
			} else if(isPracticable(s) && valueOf(s) == valueOf(presentSol)) {
				if(costOf(s) < costOf(presentSol)) {
					presentSol = s;
					return s;
				} else return null;
			} else return null;
			
			
		}else {
			KnapsackSolution s_false = s.add(false);
			KnapsackSolution s_true = s.add(true);
			
			if(isPracticable(s_true)) {
				KnapsackSolution subS_false = (maxValueOf(s_false) >= valueOf(presentSol))? solve(s_false): null;
				KnapsackSolution subS_true = (maxValueOf(s_true) >= valueOf(presentSol))? solve(s_true): null;
				if(valueOf(subS_false) > valueOf(subS_true)) return subS_false;
				else if(valueOf(subS_false) < valueOf(subS_true)) return subS_true;
				else return (costOf(subS_false) < costOf(subS_true))? subS_false: subS_true;
				
			}else {
				return (maxValueOf(s_false) >= valueOf(presentSol))? solve(s_false): null;
			}
		}
	}

}