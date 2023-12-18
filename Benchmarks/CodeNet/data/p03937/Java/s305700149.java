import java.util.Scanner;

public class Main {
	static String map[][];
	static int h, w;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		w = sc.nextInt();
		map = new String[h][];
		for(int i = 0;i < h;i++){
			map[i] = sc.next().split("");
		}

		if(search(0, 0) == w+h-1){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}

	}

	static int search(int a, int b){
		if(a == h-1 && b == w-1)return 1;

		int res = 0;
		if(a+1 < h && map[a+1][b].equals("#")){
			res += search(a+1, b)+1;
		}
		if(b+1 < w && map[a][b+1].equals("#")){
			res = search(a, b+1)+1;
		}

		return res;
	}
}