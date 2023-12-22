
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < N; i++){
			
			ArrayList<Character> list = new ArrayList<Character>();
			for(final char in : sc.nextLine().toCharArray()){
				list.add(in);
			}
			
			final int M = Integer.parseInt(sc.nextLine());
			
			int pos = 0;
			
			for(int j = 0; j < M; j++){
				//System.out.println(list);
				
				String[] str = sc.nextLine().split(" ");
				String ops1 = str[0];
				String ops2 = str[1];
				
				if("forward".equals(ops1)){
					if("char".equals(ops2)){
						if(pos < list.size()){
							pos++;
						}
					}else if("word".equals(ops2)){
						boolean flag = false;
						
						for(int k = pos; k < list.size(); k++){
							if(list.get(k) == ' '){
								pos = k;
								flag = true;
								break;
							}
						}
						
						if(!flag){
							pos = list.size();
						}
					}
				}else if("backward".equals(ops1)){
					if("char".equals(ops2)){
						if(pos > 0){
							pos--;
						}
					}else if("word".equals(ops2)){
						boolean flag = false;
						
						for(int k = pos - 1; k >= 0; k--){
							if(list.get(k) == ' '){
								pos = k + 1;
								flag = true;
								break;
							}
						}
						
						if(!flag){
							pos = 0;
						}
					}
				}else if("delete".equals(ops1)){
					if("char".equals(ops2)){
						if(pos < list.size()){
							list.remove(pos);
						}
					}else if("word".equals(ops2)){
						boolean flag = false;
						boolean found = false;
						int del = -1;
						
						for(int k = pos; k < list.size(); k++){
							if(list.get(k) == ' '){
								found = true;
								flag = true;
								del = k - 1;
							}else if(found){
								del = k - 1;
								break;
							}
						}
						
						if(flag){
							for(int k = pos; k <= del; k++){
								list.remove(pos);
							}
						}
					}
				}else if("insert".equals(ops1)){
					char[] input = ops2.replaceAll("\"", "").toCharArray();
					
					for(int k = input.length - 1; k >= 0; k--){
						list.add(pos, input[k]);
					}
				}
			}
			
			for(int j = 0; j < list.size(); j++){
				if(j == pos){
					System.out.print("^");
				}
				System.out.print(list.get(j));
			}
			
			if(list.size() == pos){
				System.out.print("^");
			}
			System.out.println();
		}
		
	}

}