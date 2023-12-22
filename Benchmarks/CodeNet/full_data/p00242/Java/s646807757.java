import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n_line = stdIn.nextInt();
			if(n_line==0){
				return;
			}
			stdIn.nextLine();
			List<String> words = new ArrayList<String>();
			Map<String, Integer> count = new HashMap<String, Integer>();
			for(int i=0;i<n_line;i++){
				String[] line = stdIn.nextLine().split(" ");
				for(int j=0;j<line.length;j++){
					if(words.contains(line[j])){
						int before = count.get(line[j]);
						count.put(line[j], before+1);
					}
					else{
						words.add(line[j]);
						count.put(line[j], 1);
					}
				}
			}
			Collections.sort(words);
			String target = stdIn.next();
			List<String> result = new ArrayList<String>();
			for(int i=0;i<words.size();i++){
				if(words.get(i).startsWith(target)){
					result.add(words.get(i));
				}
			}

			// テスト------------------
//			System.err.println(words.toString());
//			System.err.println(count.toString());
//
//			if(result.size()==0){
//				System.err.println("NA");
//			}
//			else{
//				System.err.print(result.get(0));
//				for(int i=1;i<result.size();i++){
//					if(i==5){
//						break;
//					}
//					System.err.print(" "+result.get(i));
//				}
//				System.err.println();
//			}
			// テスト----------------------

			// 順序整理
			List<String> result2 = new ArrayList<String>();
			int max = 0;
			for(int i=0;i<result.size();i++){
				int temp = count.get(result.get(i));
				if(temp>max){
					max = temp;
				}
			}
//			System.err.println("max="+max);
			for(int i=max;i>=0;i--){
				for(int j=0;j<result.size();j++){
					int temp = count.get(result.get(j));
					if(temp==i){
						result2.add(result.get(j));
					}
				}
			}

			if(result2.size()==0){
				System.out.println("NA");
			}
			else{
				System.out.print(result2.get(0));
				for(int i=1;i<result2.size();i++){
					if(i==5){
						break;
					}
					System.out.print(" "+result2.get(i));
				}
				System.out.println();
			}
		}
	}
}