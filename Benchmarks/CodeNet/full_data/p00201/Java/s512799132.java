import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Wrought Gold Master
public class Main{

	public static int[] price;
	public static int[] opt;
	public static Map<String, Integer> ref;
	public static int[][] list;
	public static boolean[] mark;

	public static int get(int k){
		if(opt[k]!=Integer.MAX_VALUE){
			mark[k] = false;
			return opt[k];
		}
		if(mark[k]){
			mark[k] = false;
			return opt[k] = price[k];
		}
		mark[k] = true;
		if(list[k].length==0){
			mark[k] = false;
			return opt[k] = price[k];
		}
		int p = 0;
		for(int i=0;i<list[k].length;i++){
			p += get(list[k][i]);
		}
		mark[k] = false;
		return opt[k] = p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			price = new int[n];
			opt = new int[n];
			list = new int[n][0];
			mark = new boolean[n];
			Arrays.fill(opt, Integer.MAX_VALUE);
			int id = 0;
			ref = new HashMap<String, Integer>();
			for(int i=0;i<n;i++){
				ref.put(sc.next(), id);
				price[id++] = sc.nextInt();
			}
			int m = sc.nextInt();
			while(m--!=0){
				int i = ref.get(sc.next());
				int k = sc.nextInt();
				list[i] = new int[k];
				for(int j=0;j<k;j++){
					list[i][j] = ref.get(sc.next());
				}
			}
			for(int i=0;i<n;i++)opt[i]=price[i];
			boolean f = true;
			while(f){
				f = false;
				for(int i=0;i<n;i++){
					if(list[i].length!=0){
						int p = 0;
						for(int k=0;k<list[i].length;k++){
							p += opt[list[i][k]];
						}
						if(p < opt[i]){
							f = true;
							opt[i] = p;
						}
					}
				}
			}
			System.out.println(get(ref.get(sc.next())));
		}
	}
}