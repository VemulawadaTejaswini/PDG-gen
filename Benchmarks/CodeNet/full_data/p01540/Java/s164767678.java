import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[][] map = new int[n][2];
			
			for(int i=0;i<n;i++){
				map[i][0] = sc.nextInt();
				map[i][1] = sc.nextInt();
			}
			
			Arrays.sort(map, new Comparator<int[]>(){
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
                }
            });

			int cnt, a, b, c, d;
			for(int i=0;i<m;i++){
				cnt = 0;
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				
				for(int j=0;j<n;j++){
					if(map[j][0]>=a){
						for(int k=j;k<n;k++){
							if(map[k][0]>c){
								j = n;
								k = n;
							}else if(b<=map[k][1] && map[k][1]<=d){
								cnt++;
							}
						}
						break;
					}
				}
				System.out.println(cnt);
			}
		}	
	}	
}