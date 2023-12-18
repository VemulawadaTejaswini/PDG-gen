import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int h = sc.nextInt();
			int w = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int [] count = new int[4];
			count[0] = (h % 2) * (w / 2);
			count[1] = (h / 2) * (w % 2);
			count[2] = (h / 2) * (w / 2);
			count[3] = (h % 2) * (w % 2);
			
			int aa = Math.max(a - count[0], 0);
			int bb = Math.max(b - count[1], 0);
			if(((aa + aa % 2) / 2) + ((bb + bb % 2) / 2) > count[2]){
				System.out.println("NO");
				continue;
			}
			
			int aaa = a - aa;
			int bbb = b - bb;
			int [] sq = new int[2];
			sq[0] = a - aa;
			sq[1] = b - bbb;
			StringBuilder total = new StringBuilder();
			for(int i = 0; i < h / 2; i++){
				StringBuilder sb1 = new StringBuilder();
				StringBuilder sb2 = new StringBuilder();
				for(int j = 0; j < w /2; j++){
					if(aa >= 2){
						aa -= 2;
						sb1.append("<>");
						sb2.append("<>");
					}
					else if(bb >= 2){
						bb -= 2;
						sb1.append("^^");
						sb2.append("vv");
					}
					else if(aa == 1){
						aa -= 1;
						sb1.append("<>");
						sb2.append("..");
					}
					else if(bb == 1){
						bb -= 1;
						sb1.append("^.");
						sb2.append("v.");
					}
					else{
						sb1.append("..");
						sb2.append("..");
					}
				}
				if(count[1] > 0){
					count[1]--;
					if(bbb > 0){
						bbb--;
						sb1.append("^");
						sb2.append("v");
					}
					else{
						sb1.append(".");
						sb2.append(".");
					}
				}
				total.append(sb1.toString() + "\n");
				total.append(sb2.toString() + "\n");
			}
			
			for(int i = 0; i < count[0]; i++){
				if(aaa > 0){
					total.append("<>");
					aaa--;
				}
				else{
					total.append("..");
				}
			}
			if(count[3]> 0){
				total.append(".");
			}
			if(h%2 == 1){
				total.append("\n");
			}
			System.out.println("YES");
			System.out.print(total);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
