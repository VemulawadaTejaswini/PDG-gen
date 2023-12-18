import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for(int i = 0; i < q; i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		String[] process = new String[s.length() + 1];
		int[] level = new int[s.length() + 1];
		
		int[] currentLevel = new int[s.length() + 1];
		String current = "";
		process[0] = "";
		level[0] = 0;
		for(int i = 0; i < s.length(); i++){
			int startLength = current.length();
			current += s.charAt(i);
			while(current.length() > 1 && current.charAt(current.length() - 2) == current.charAt(current.length() - 1)){
				char c = current.charAt(current.length() - 1);
				current = current.substring(0, current.length() - 2);
				if(c != 'z'){
					c++;
					current += ((char) c);
				}
			}
			for(int j = current.length() + 1; j <= startLength; j++){
				currentLevel[j]++;
			}
			process[i + 1] = current;
			level[i + 1] = currentLevel[current.length()];
		}
		for(int i = 0; i < q; i++){
			if(process[l[i] - 1].equals(process[r[i]]) && (level[l[i] - 1] == level[r[i]]) || process[r[i]].equals("z")){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}