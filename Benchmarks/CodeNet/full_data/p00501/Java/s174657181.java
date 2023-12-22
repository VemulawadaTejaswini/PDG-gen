import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int count = 0;
		int s = 0;
		char name[]=in.next().toCharArray();
		int cnt[] = new int [name.length];
		char yobi[][] = new char [k][];
		for(int i = 0;i < k;i++){
			yobi[i]=in.next().toCharArray();
		}
		for(int i = 0;i < k;i++){
			s = 0;
			for(int j=0; j<yobi[i].length; j++){
				if(name[0]==yobi[i][j]){
					if(yobi[i].length - j < 4)break;
					if(s == 1) break;
					int v = 0;
					while(true){
						cnt[v]=j;
						if(name.length-1 <= v){
							for(int m=0; m+2<name.length; m++){
								if(cnt[m+1]-cnt[m] != cnt[m+2]-cnt[m+1]){
									break;
								}
							}
							count++;
							s++;
							break;
						}
						if(v == yobi[i].length){
							break;
						}
						v++;
					}
				}
			}
		}
		System.out.println(count);
	}
}