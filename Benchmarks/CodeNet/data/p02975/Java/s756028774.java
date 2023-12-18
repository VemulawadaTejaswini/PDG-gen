
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		List al = new ArrayList();
		
		for(int i = 0; i < N; i++){
          al.add(input.nextInt());
		}
		input.close();
		int count = 0;
		for(int i = 0; i < N; i++){
			for(int j = i+1; j < N; j++){
				int xor = (int)al.get(i)^(int)al.get(j);
					if(al.contains(xor)){
						count++;
						break;
					}
			}
		}
		
		if(count == N-1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
