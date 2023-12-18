import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		Integer[] test = new Integer[number.length() - 1];
		Long result = 0L;
		for (int i = 0; i < test.length; i++) {
			test[i] = i + 1;
		}
	    
		for (int r = 1; r <= test.length; r++) {
			Combinations<Integer> c = new Combinations<>(test, r);
			Iterator<List<Integer>> it = c.iterator();
			while(it.hasNext()){
		    	List<Integer> comb = it.next();
		    	result += Integer.parseInt(number.substring(0, comb.get(0)));
		        for (int i = 1;i < comb.size();i++){
		        	result += Integer.parseInt(number.substring(comb.get(i - 1), comb.get(i)));
		        	// System.out.print(comb.get(i) + " ");
		        }
		        result += Integer.parseInt(number.substring(comb.get(comb.size() - 1)));
		        // System.out.println("");
		    }
		}
		result += Long.parseLong(number);
		System.out.println(result);
	}
}

class Combinations<T> implements Iterator{

    private List<List<T>> combinations;
    private List<T> list;
    private int[] index;
    private boolean[] visited;
    private int r;
    private boolean overHalf;
    private Iterator<List<T>> iterator;

    public Combinations(T[] array, int r) throws IllegalArgumentException {
        if(array.length < 1 || r < 1 || array.length < r){
            throw new IllegalArgumentException();
        }

        this.combinations = new ArrayList<List<T>>();
        this.list = Arrays.asList(array);
        this.r = r;
        if(this.r == array.length){
            this.combinations.add(list);
        }
        else{
            if(this.r > list.size() / 2){
                this.r = list.size() - this.r;
                this.overHalf = true;
            }

            this.index = new int[this.r];
            this.visited = new boolean[list.size()];
            this.compute(0);
        }

        this.iterator = this.combinations.iterator();
    }

    private void compute(int n){
        if(n == this.r){
            List<T> combination = new ArrayList<T>();
            if(overHalf){
                for(int i = 0;i < this.list.size();i++){
                    boolean skip = false;
                    for(int j = 0;j < this.index.length;j++){
                        if(i == this.index[j]){
                            skip = true;
                        }
                    }
                    if(skip){
                        continue;
                    }
                    combination.add(list.get(i));
                }
            }
            else{
                for(int i = 0;i < this.index.length;i++){
                    combination.add(list.get(index[i]));
                }
            }
            this.combinations.add(combination);
        }
        else{
            for(int i = 0;i < this.list.size();i++){
                if(n == 0 || !this.visited[i] && index[n - 1] < i){
                    this.visited[i] = true;
                    this.index[n] = i;
                    this.compute(n + 1);
                    this.visited[i] = false;
                }
            }
        }
    }

    public List<List<T>> getCombinations(){
        return this.combinations;
    }

    public static int count(int n, int r) throws IllegalArgumentException{
        if(n < 1 || r < 1 || n < r){
            throw new IllegalArgumentException();
        }

        int res = 1;
        for(int i = n;i > r;i--){
            res *= i;
        }
        for(int i = n - r;i > 1;i--){
            res /= i;
        }
        return res;
    }

    public List<T> next(){
        return this.iterator.next();
    }

    public boolean hasNext(){
        return this.iterator.hasNext();
    }

    public Iterator<List<T>> iterator(){
        return this.iterator;
    }

    public void remove(){
    }
}