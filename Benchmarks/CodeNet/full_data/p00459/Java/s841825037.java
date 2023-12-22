// run# 2215108
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int hitnum(int a0, int a1, int r){
		if(a1<=r){
			return a1-a0+1;
		}else if(a0<=r){
			return r-a0+1;
		}else{
			return 0;
		}
	}


	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;
			int m = Integer.parseInt(br.readLine());
			int deck[][][] = new int [m+1][2*m+3][2];
			deck[0][0][0] = 1;
			deck[0][0][1] = n;

			String line[] = br.readLine().split(" ");
			int p = Integer.parseInt(line[0]);
			int q = Integer.parseInt(line[1]);
			int r = Integer.parseInt(line[2]);

			for(int im=0; im<m; im++){
				String query[] = br.readLine().split(" ");
				int x = Integer.parseInt(query[0]);
				int y = Integer.parseInt(query[1]);

				int cntr = 0;
				int i = 0;
				int[] sectiona = {0,0};
				int[] sectionb = {0,0};

				while(cntr < x){
					int nextsize = deck[im][i][1] - deck[im][i][0] + 1;
					if(x-cntr >= nextsize){
						cntr += nextsize;
						i++;
					}else{
						sectiona[0] = deck[im][i][0];
						sectiona[1] = deck[im][i][0] + x-cntr -1;
						deck[im][i][0] += x-cntr;
						cntr = x;
					}
				}
				int memoa = i;
				while(cntr < y){
					int nextsize = deck[im][i][1] - deck[im][i][0] + 1;
					if(y-cntr >= nextsize){
						cntr += nextsize;
						i++;
					}else{
						sectionb[0] = deck[im][i][0];
						sectionb[1] = deck[im][i][0] + y-cntr -1;
						deck[im][i][0] += y-cntr;
						cntr = y;
					}
				}

				int itr = 0;
				while(deck[im][i+itr][0] != 0){
					deck[im+1][itr][0] = deck[im][i+itr][0];
					deck[im+1][itr][1] = deck[im][i+itr][1];
					itr++;
				}
				for(int j=memoa; j<i; j++){
					deck[im+1][itr][0] = deck[im][j][0];
					deck[im+1][itr][1] = deck[im][j][1];
					itr++;
				}
				if (sectionb[1] != 0){
					deck[im+1][itr][0] = sectionb[0];
					deck[im+1][itr][1] = sectionb[1];
					itr++;
				}
				for(int j=0; j<memoa; j++){
					deck[im+1][itr][0] = deck[im][j][0];
					deck[im+1][itr][1] = deck[im][j][1];
					itr++;
				}
				if (sectiona[1] != 0){
					deck[im+1][itr][0] = sectiona[0];
					deck[im+1][itr][1] = sectiona[1];
					itr++;
				}
			}

			int answerq = 0;
			int cnter = 0;
			int i = 0;
			while (cnter < q){
				int nextsize = deck[m][i][1] - deck[m][i][0] + 1;
				if(q-cnter >= nextsize){
					answerq += hitnum(deck[m][i][0],deck[m][i][1], r);
					cnter += nextsize;
					i++;
				}else{
					answerq += hitnum(deck[m][i][0], deck[m][i][0] + q-cnter -1,r);
					cnter = q;
				}
			}

			int answerp = 0;
			cnter = 0;
			i = 0;
			while (cnter < p-1){
				int nextsize = deck[m][i][1] - deck[m][i][0] + 1;
				if(p-1-cnter >= nextsize){
					answerp += hitnum(deck[m][i][0],deck[m][i][1], r);
					cnter += nextsize;
					i++;
				}else{
					answerp += hitnum(deck[m][i][0], deck[m][i][0] + p-1-cnter -1,r);
					cnter = p-1;
				}
			}
			int answer = answerq-answerp;
			System.out.println(answer);
		}
	}
}