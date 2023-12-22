import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int nodenum = sc.nextInt();
			int qnum = sc.nextInt();
			if(nodenum == 0 && qnum == 0){
				break;
			}
			initData(nodenum);

			for(int i = 2; i <= nodenum; i++){
				setParent(i, sc.nextInt());
			}
			sc.nextLine();

			Stack<int[]> op = new Stack<int[]>();
			for(int i = 0; i < qnum; i++){
				char[] d = sc.nextLine().toCharArray();
				int n = 0;
				for(int j = d.length - 2; j >= 2; j--){
					int power = 1;
					for(int k = j ; k < d.length - 1; k++){
						power = power * 10;
					}
					n = n + (new Integer(d[j] - '0')) * power;
				}
				switch(d[0]){
					case 'M':
						int[] t = {0, n, getParent(n)};
						op.push(t);
						mark(n);
						break;
					case 'Q':
						int[] f = {1, n};
						op.push(f);
						break;		
				}
			}

			int res = 0;
			while(!op.empty()){
				int[] o = op.pop();
				switch(o[0]){
					case 0:
					//case 'M':
						setParent(o[1], o[2]);
						break;
					case 1:
					//case 'Q':
						res = res + gmRoot(o[1]);
				}
			}

			System.out.println(res);
		}
	}

	static int gmRoot(int node){
		int res = -2;
		int p = getParent(node);

		if(p == 0){
			res = node;			
		}else{
			res = gmRoot(p);
			setParent(node, res);
		}

		return res;
	}
	
	static int[] data;
	static void initData(int nodenum){
		data = new int[nodenum];
		data[0] = -1;
	}
	static int getParent(int node){
		return data[node - 1] + 1;
	}
	static void setParent(int node, int parent){
		data[node - 1] = parent - 1;
	}
	static void mark(int node){
		data[node - 1] = -1;
	}
}