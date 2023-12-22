import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int h = sc.nextInt();
			if(h==0) break;
			Integer[][] map = new Integer[5][h];

			for(int i=0; i<h; i++){
				for(int j=0; j<5; j++){
					map[j][i] = sc.nextInt();
				}
			}

			System.out.println(chainDisappearance(map));
		}
	}

	public static int chainDisappearance(Integer[][] map){
		int score = 0;
		boolean flag = false;
		
		for(int i=map[0].length-1; i>=0; i--){
			if(map[2][i]==0) break;
			if(map[2][i]==map[1][i]){
				if(map[2][i]==map[3][i]){
					score += map[2][i]*3;
					flag = true;
					if(map[2][i]==map[0][i]){
						score += map[2][i];
						map[0][i] = 0;
					}
					if(map[2][i]==map[4][i]){
						score += map[2][i];
						map[4][i] = 0;
					}
					map[1][i] = 0;
					map[2][i] = 0;
					map[3][i] = 0;
				}else{
					if(map[2][i]==map[0][i]){
						score += map[2][i]*3;
						map[2][i] = 0;
						map[1][i] = 0;
						map[0][i] = 0;
						flag = true;
					}
				}
			}else{
				if(map[2][i]==map[3][i] && map[2][i]==map[4][i]){
					score += map[2][i]*3;
					map[2][i] = 0;
					map[3][i] = 0;
					map[4][i] = 0;
					flag = true;
				}
			}
		}

		if(flag){
			for(int i=0; i<5; i++){
				Arrays.sort(map[i], new Comparator<Integer>(){
					public int compare(Integer a, Integer b){
						int temp = 0;
						if(a==0 && b>0) temp = -1;
						return temp;
					}
				});
			}
			score += chainDisappearance(map);
		}

		return score;
	}
}