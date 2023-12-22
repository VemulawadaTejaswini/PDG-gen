package volume0.prob0042;

import java.util.Scanner;

public class Main {
	public int[] v;
	public int[] w;
	public int wMax;
	public int n;
	public int[][] memo;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int iocase = 1;
		Main m = new Main();
		m.wMax = sc.nextInt();
		while(m.wMax != 0){
			m.n = sc.nextInt();
			m.memo = new int[m.n + 1][m.wMax + 1];
			m.v = new int[m.n];
			m.w = new int[m.n];
			sc.nextLine();
			for(int i = 0; i < m.n; i++){
				String str = sc.nextLine();
				String[] split = str.split(",");
				m.v[i] = Integer.parseInt(split[0]);
				m.w[i] = Integer.parseInt(split[1]);
			}
			int max = 0;
			for(int i = m.n - 1; i >= 0; i--){
				for(int j = 0; j <= m.wMax; j++){
					if(j + m.w[i] > m.wMax){
						m.memo[i][j] = m.memo[i + 1][j];
					}else{
						m.memo[i][j] = Math.max(m.memo[i + 1][j], m.memo[i + 1][j + m.w[i]] + m.v[i]);
					}
				}
			}
			System.out.println("Case " + iocase +":");
			System.out.println("" + m.memo[0][0]);
			for(int i = 0; i < m.wMax; i++){
				if(m.memo[0][0] != m.memo[0][i + 1]){
					System.out.println("" + (m.wMax - i));
					break;
				}
			}
	//		System.out.println("" + m.proc(0, 0));
			iocase++;
			m.wMax = sc.nextInt();
		}
		
		sc.close();
	}
	public int proc(int i, int j){
		int result = 0;
		if(memo[i][j] > 0){
			result = memo[i][j];
		}else if(i == n){
			result = 0;
		}else if(j + w[i] > wMax){
			result = proc(i + 1, j);
		}else{
			result = Math.max(proc(i + 1, j), proc(i + 1, j + w[i]) + v[i]);
		}
		memo[i][j] = result;
		return result;
	}
}