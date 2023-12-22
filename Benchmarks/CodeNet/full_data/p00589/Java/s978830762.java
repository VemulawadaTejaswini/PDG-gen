import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[]{0,5,6,6,6,6,6,8,6,8};
		char[][] c = new char[10][];
		c[1] = new char[]{'\'', ',', '.', '!', '?'};
		int cnt = 97;
		for(int i=2;i<10;i++){
			c[i] = new char[n[i]];
			for(int j=0;j<n[i]/2;j++){
				c[i][j] = (char)cnt;
				c[i][j+n[i]/2] = (char)(cnt-32);
				cnt++;
			}
		}
		
		while(sc.hasNext()){
			String s = sc.next() + "0";
			char[] cc = s.toCharArray();
			
			cnt = 0;
			for(int i=1;i<cc.length;i++){
				if(cc[i]==cc[i-1]){
					if(cc[i-1]=='0') System.out.print(' ');
					else cnt++;
				}else{
					if(cc[i-1]!='0'){
						int m = cc[i-1]-48;
						System.out.print(c[m][cnt%n[m]]);
						cnt = 0;
					}
				}
			}
			System.out.println();
		}
	}

}