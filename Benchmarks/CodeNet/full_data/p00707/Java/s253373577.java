import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[70][70];
		int w, h;
		String temp;
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h==0) break;

			for(int i=0; i<h; i++){
				temp = sc.next();
				Arrays.fill(map[i], -1);
				for(int j=0; j<w; j++){
					if(temp.charAt(j)>='0' && temp.charAt(j)<='9'){
						map[i][j] = temp.charAt(j) - '0';
					}
				}
			}
			Arrays.fill(map[h], -1);

			String sum = "", max = "";
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(map[i][j]>0 && map[i][j]<10){
						sum = dfs(map, i, j);

						if(max.length() < sum.length()){
							max = sum;
						}else if(max.length()==sum.length()){
							for(int n=0; n<max.length(); n++){
								if(max.charAt(n)<sum.charAt(n)){
									max = sum;
									break;
								}else if(max.charAt(n)>sum.charAt(n)){
									break;
								}
							}
						}
					}
				}
			}

			System.out.println(max);
		}
	}

	static public String dfs(int[][] map, int i, int j){
		String s1, s2;
		s1 = String.valueOf(map[i][j]%10);
		s2 = s1;
		map[i][j] += 10;

		if(map[i+1][j]!=-1){
			s1 += dfs(map, i+1, j);
		}
		if(map[i][j+1]!=-1){
			s2 += dfs(map, i, j+1);
		}

		if(s1.length() < s2.length()){
			return s2;
		}else if(s1.length()==s2.length()){
			for(int n=0; n<s1.length(); n++){
				if(s1.charAt(n)<s2.charAt(n)){
					return s2;
				}else if(s1.charAt(n)>s2.charAt(n)){
					break;
				}
			}
		}
		return s1;
	}
}