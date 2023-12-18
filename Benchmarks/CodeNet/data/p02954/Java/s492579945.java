import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		char[] s = (sc.next()).toCharArray();
		int[] result = new int[s.length];
		float r = 1;
		int l_i = 0;
		float l = 0;
		for(int i = 0; i < s.length; i++){
		    if(i > 0 && s[i - 1] == 'R' && s[i] == 'R'){
		        result[i - 1] = 0;
		        r = r + 1;
		    }else if(i > 0 && s[i - 1] == 'R' && s[i] == 'L'){
		        result[i - 1] = (int)ceil(r/2);
		        result[i] = 1 + (int)floor(r/2);
		        r = 0;
		        l_i = i;
		    }else if(i > 0 && s[i - 1] == 'L' && s[i] == 'R'){
		        result[l_i - 1] = result[l_i - 1] + (int)ceil(l/2);
		        result[l_i] = result[l_i] + (int)floor(l/2);
		        r = 1;
		        l = 0;
		    }else if(i > 0 && s[i - 1] == 'L' && s[i] == 'L'){
		        result[i] = 0;
		        l = l + 1;
		    }
		}
		result[l_i - 1] = result[l_i - 1] + (int)ceil(l/2);
		result[l_i] = result[l_i] + (int)floor(l/2);
		
		// 計算

		// 出力
		for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
		}
		
	}
}
