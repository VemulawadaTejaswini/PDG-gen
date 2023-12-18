import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		
		// 計算
		int result = 0;
		char pre = '1';
		int cntOneL = 0;
		int cntZero = 0;
		int cntOneR = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
		    char c = s.charAt(i);
		    if(pre == '1' && c == '1'){
		        cntOneR++;
		    }else if(pre == '1' && c == '0'){
		        if(cntZero != 0){
		            list.add(cntOneL + cntZero + cntOneR);
		            list2.add(cntOneL);
		        }
		        cntOneL = cntOneR;
		        cntZero = 1;
		        cntOneR = 0;
		        pre = '0';
		    }else if(pre == '0' && c == '0'){
		        cntZero++;
		    }else if(pre == '0' && c == '1'){
		        cntOneR++;
		        pre = '1';
		    }
		}
		list.add(cntOneL + cntZero + cntOneR);
		list2.add(cntOneL);
		
		//System.out.println(list.toString());
		//System.out.println(list2.toString());
		
		int loop = min(list.size(), k);
		for(int i = 0; i < list.size() - loop + 1; i++){
		    int temp = 0;
		    for(int j = 0; j < loop; j++){
		        if(j == 0){
		            temp += list.get(i + j);
		        }else{
		            temp += list.get(i + j) - list2.get(i + j);
		        }
		    }
		    result = max(result, temp);
		}
		
		
		// 出力
		System.out.println(result);
        
	}
}