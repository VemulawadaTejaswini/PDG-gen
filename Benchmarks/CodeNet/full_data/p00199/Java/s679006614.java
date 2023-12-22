import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);
	
	private void doit(){
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			char [] chair = new char[n];
			Arrays.fill(chair, '#');
			for(int ii = 0; ii < m; ii++){
				char c = sc.next().charAt(0);
				switch(c){
				case 'A':
					for(int i = 0; i < n; i++){
						if(chair[i] == '#'){
							chair[i] = 'A';
							break;
						}
					}
					break;
				case 'B':
					boolean isSit = false;
					for(int i = n-1; i >= 0; i--){
						if(chair[i] == '#'){
							if(i == n-1 || chair[i+1] != 'A'){
								if(i == 0 || chair[i-1] != 'A'){
									isSit = true;
									chair[i] = 'B';
									break;
								}
							}
						}
					}
					if(! isSit){
						for(int i = 0; i < n; i++){
							if(chair[i] == '#'){
								chair[i] = 'B';
								break;
							}
						}
					}
					break;
				case 'C':
					int ind = -1;
					for(int i = 0; i < n; i++){
						if(chair[i] != '#'){
							if(i + 1 != n && chair[i + 1] == '#'){
								ind = i;
								chair[i+1] = 'C';
								break;
							}
							else if(i != 0 && chair[i-1] == '#'){
								ind = i;
								chair[i - 1] = 'C';
								break;
							}
						}
					}
					if(ind == -1){
						if(n % 2 == 1){
							chair[(1 + n) / 2 - 1] = 'C';
						}
						else{
							chair[n / 2] = 'C';
						}
					}
					break;
				case 'D':
					int max = -1;
					int ind2 = -1;
					for(int i = 0; i < n; i++){
						if(chair[i] != '#') continue;
						boolean flga = false;
						int disa = 0;
						for(int j = i + 1;; j++){
							if(j == n){
								flga = true;
								break;
							}
							if(chair[j] != '#'){
								break;
							}
							else{
								disa++;
							}
						}
						boolean flgb = false;
						int disb = 0;
						for(int j = i-1;; j--){
							if(j == -1){
								flgb = true;
								break;
							}
							if(chair[j] != '#'){
								break;
							}
							else{
								disb++;
							}
						}
						int res = Math.min(disa, disb);
						if(flga && flgb){
							res = n;
						}
						else if(flga){
							res = disb;
						}
						else if(flgb){
							res = disa;
						}
						if(max < res){
							max = res;
							ind2 = i;
						}
					}
					chair[ind2] = 'D';
					break;
				}
			}
			for(int i = 0; i < n; i++){
				System.out.print(chair[i]);
			}
			System.out.println();
		}
		
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}