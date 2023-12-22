import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] score = {0, 0};
		for(int i = 0;i < n;i++){
			String[] words = br.readLine().split(" ");
			if(words[0].compareTo(words[1]) > 0){
				score[0] += 3;
			}else if(words[0].compareTo(words[1]) == 0){
				score[0]++;
				score[1]++;
			}else{
				score[1] += 3;
			}
		}
		System.out.printf("%d %d%n", score[0], score[1]);
	}

}