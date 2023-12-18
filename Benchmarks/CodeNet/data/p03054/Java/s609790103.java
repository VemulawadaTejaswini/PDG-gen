import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();

		int Sr = sc.nextInt();
		int Sc = sc.nextInt();

		// 文字列の入力
		String s = sc.next();
		String[] S = s.split("");
		String t = sc.next();
		String[] T = t.split("");

		int scnt = 0;
		int tcnt = 0;

		int dstL = Sc;
		int dstR = h-Sc+1;
		int dstU = Sr;
		int dstD = w-Sr+1;

		for(int i=0;i<n;i++){
			switch(S[scnt]){
				case "L":
					if(dstL<dstR){
						dstL--;
						dstR++;
					}
					break;
				case "R":
					if(dstR<dstL){
						dstR--;
						dstL++;
					}
					break;
				case "U":
					if(dstU<dstD){
						dstU--;
						dstD++;
					}
					break;
				case "D":
					if(dstD<dstU){
						dstD--;
						dstU++;
					}
					break;
				default:break;
			}
			if(dstL==0||dstR==0||dstU==0||dstD==0){
				System.out.println("YES");
				break;
			}

			switch(T[tcnt]){
				case "L":
					if(dstL>dstR){
						dstL--;
						dstR++;
					}
					break;
				case "R":
					if(dstR>dstL){
						dstR--;
						dstL++;
					}
					break;
				case "U":
					if(dstU>dstD){
						dstU--;
						dstD++;
					}
					break;
				case "D":
					if(dstD>dstU){
						dstD--;
						dstU++;
					}
					break;
				default:break;
			}
		}

		// 出力
		System.out.println("NO");
	}
}