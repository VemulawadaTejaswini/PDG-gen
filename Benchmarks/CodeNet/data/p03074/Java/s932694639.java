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
		int cntOne = 0;
		int cntZero = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
		    char c = s.charAt(i);
		    if(pre == '1' && c == '1'){
		        cntOne++;
		    }else if(pre == '1' && c == '0'){
		        list.add(cntOne);
		        cntZero = 1;
		        cntOne = 0;
		        pre = '0';
		    }else if(pre == '0' && c == '0'){
		        cntZero++;
		    }else if(pre == '0' && c == '1'){
		        list.add(cntZero);
		        cntOne = 1;
		        cntZero = 0;
		        pre = '1';
		    }
		}
		if(pre == '0'){
		    list.add(cntZero);
		    list.add(0);
		}else{
		    list.add(cntOne);
		}
		//System.out.println(list.toString());
		
		int loop = min(list.size(), 2*k + 1);
		int temp = 0;
		for(int i = 0; i < loop; i++){
		    temp += list.get(i);
		}
		result = temp;
		for(int i = loop; i < list.size(); i = i + 2){
		    temp += list.get(i);
		    temp += list.get(i + 1);
		    temp -= list.get(i - loop);
		    temp -= list.get(i + 1 - loop);
		    result = max(result, temp);
		}
		
		// 出力
		System.out.println(result);
        
	}
}