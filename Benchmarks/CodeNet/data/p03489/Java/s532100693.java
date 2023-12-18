import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.imageio.IIOException;

public class Atcoder_goodsequence {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		
		int x = reader.nextInt();
		int[] counter = new int[x];
		List<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < x ; i++){
			list.add(reader.nextInt());
		}
		int count = 0;		
		Set set = new TreeSet();
		int[] vis = new int[x];
		int[] countvis = new int[x];
		for(int i = 0; i<list.size(); i++){
			int temp = list.get(i);
			if(!set.contains(temp)){
				set.add(temp);
				vis[count] = temp; 
				countvis[count] = 1;
						
			}else{
				countvis[count]++;
				count++;
			}
		}
		
		int number = 0;
		for(int i = 0; i<set.size(); i++){
			if(vis[i]!=countvis[i]){
				if(vis[i]<countvis[i]){
					number+=(vis[i]-countvis[i]);
				}
				else{					
					number+=vis[i];
				}
			}
		}
		System.out.println(number);
	}
}
