import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().toCharArray();
		
		int fuchi = 0;
		int water = 0;
		
		Deque<Integer> left = new ArrayDeque<Integer>();
		List<Integer> areasL = new ArrayList<Integer>();
		for(int i = 0; i < ch.length; i++){
			switch(ch[i]){
			case '\\':
				left.addFirst(i);
				break;
				
			case '_':
				break;
				
			case '/':
				try{
					water += i - left.removeFirst();
					if(left.isEmpty()){
						areasL.add(water);
						water = 0;
						fuchi = i;
					}
				} catch(NoSuchElementException e){
				}
				break;
			}
		}
		
		water = 0;
		
		Deque<Integer> right = new ArrayDeque<Integer>();
		List<Integer> areasR = new ArrayList<Integer>();
		for(int i = ch.length - 1; i > fuchi; i--){
			switch(ch[i]){
			case '/':
				right.addFirst(i);
				break;
			
			case '_':
				break;
				
			case '\\':
				try{
					water += right.removeFirst() - i;
					
					if(right.isEmpty()){
						areasR.add(water);
						water = 0;
					}
				} catch(NoSuchElementException e){
				}
				break;
			}
		}
		
		int sum = 0;
		for(int i : areasL) sum += i;
		for(int i : areasR) sum += i;
		
		System.out.println(sum);
		System.out.print((areasL.size() + areasR.size())+ " ");
		
		for(int i = 0; i < areasL.size(); i++){
			System.out.print(areasL.get(i) + " ");
		}
		for(int i = areasR.size() - 1; i >= 0; i--){
			System.out.print(areasR.get(i));
			if(i != 0){
				System.out.print(" ");
			}
		}
	}
}
