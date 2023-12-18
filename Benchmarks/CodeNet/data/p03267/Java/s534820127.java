import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int l = sc.nextInt();
		
		// 計算
		ArrayList<Integer[]> result = new ArrayList<Integer[]>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(l > 1){
		    if(l%2 == 0){
		        l = l/2;
		        list.add(2);
		    }else{
		        l = l - 1;
		        list.add(1);
		    }
		}
		int v = 1;
		int e = 1;
		for(int i = list.size(); i > 0; i--){
		    if(list.get(i-1) == 1){
		        Integer[] edge = {1, v, e};
		        e++;
		        result.add(edge);
		    }else{
		        for(Integer[] edge : result){
		            edge[2] *= 2;
		        }
		        Integer[] edge0 = {v, v+1, 0};
		        Integer[] edge1 = {v, v+1, 1};
		        v++;
		        e++;
		        result.add(edge0);
		        result.add(edge1);
		    }
		}
		
		// 出力
		System.out.println(v + " " + result.size());
		for(Integer[] edge : result){
		    System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
		}
	}
}
