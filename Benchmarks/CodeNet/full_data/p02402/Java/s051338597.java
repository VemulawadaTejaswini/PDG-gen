
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//整数の数nを受け取る
		String s1 = sc.next();
	    int n = Integer.parseInt(s1);
	    int a[] = new int[n];
	    long sum = 0;
	    
	    //n回、整数を読み取り、配列に入れる
	    for(int i = 0; i <= n-1; i++){
	    	String s2 = sc.next();
		    int j = Integer.parseInt(s2);
		    a[i] = j;
	    }
	    
	    //配列の０番目に大きな数、最後に小さな数が来るように並べ変える
	    for(int i = 0; i <= a.length-1; i++){
	    	for(int j = 0; j <= a.length-2; j++){
	    		if(a[j] < a[j+1]){
	    			int w = a[j];
	    			a[j] = a[j+1];
	    			a[j+1] = w;
	    		}
	    	}
	    }
	    
	    //配列に格納されている整数の合計を計算
	    for(int i = 0; i < a.length; i++){
	    	sum = sum + (long)a[i];
	    }
	    
	    //最小値、最大値、合計を表示
	    System.out.println(a[a.length-1] + " " + a[0] + " " + sum);
	}
}