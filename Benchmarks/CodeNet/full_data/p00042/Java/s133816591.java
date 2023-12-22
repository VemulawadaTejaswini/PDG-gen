package kexanese.aoj;
import java.util.Scanner;

public class Main{
	
	static int maxweight;
	
	public static void main(String[] args){
		int count = 0;
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[,\\s\\n]");		

		while(true){
			int[][] data;

			maxweight = sc.nextInt();
			if(maxweight == 0){
				break;
			}
			count++;

			data = new int[sc.nextInt()][2];

			for(int i = 0; i < data.length; i++){
				data[i][0] = sc.nextInt();
				data[i][1] = sc.nextInt();
			}

			int[] res = solve(data, 0, 0, 0);

			System.out.println("Case " + count + ":");
			System.out.println(res[0]);
			System.out.println(res[1]);	
		}
	}

	static int[] solve(int[][] data, int nowpos,int nowvalue, int nowweight){
		int res[] = new int[2];

		if(nowpos < data.length){
			if(data[nowpos][1] + nowweight > maxweight){
				res = solve(data, nowpos + 1, nowvalue, nowweight);
			}else{
				int[] res1, res2;
				res1 = solve(data, nowpos + 1, nowvalue, nowweight);
				res2 = solve(data, nowpos + 1, nowvalue + data[nowpos][0], nowweight + data[nowpos][1]);

				if(res1[0] > res2[0]){
					res = res1;
				}else{
					if(res1[0] == res2[0]){
						if(res1[1] < res2[1]){
							res = res1;
						}else{
							res = res2;
						}
					}else{
						res = res2;
					}
				} 
			}
		}else{
			res[0] = nowvalue;
			res[1] = nowweight;
		}

		return res;
	}
}