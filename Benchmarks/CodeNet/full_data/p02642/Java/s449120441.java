import java.util.*;

public class Main {
	public static void main(String[] args) {
			Scanner scan =  new Scanner(System.in);
			int N = scan.nextInt();
			ArrayList<Integer> al = new ArrayList<>();
			for(int i=0;i<N;i++){
				al.add(scan.nextInt());
			}
			Collections.sort(al);
			int i = 0;
			int ans = 0;
			boolean drawflg = true;
			while(true){
				boolean flg = true;
				if(i==al.size())break;
				for(int p = 0;p<i;p++){
					if(al.get(i) % al.get(p) == 0){
						flg = false;
						if(al.get(i) / al.get(p) == 1){
							if(drawflg)ans--;
							drawflg = false;
						}else{
							drawflg = true;
						}
					}
				}
				if(flg){
					ans++;
				}else{
					al.remove(i);
					i--;
				}
				i++;
			}
			System.out.println(ans);
	}
}
