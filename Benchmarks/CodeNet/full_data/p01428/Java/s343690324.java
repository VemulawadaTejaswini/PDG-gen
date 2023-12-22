
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String[] s = new String[8];
		int[][] map = new int[8][8];
		boolean turn = true;
		boolean[] skip = {true, true};
		int[] dx = {1,1,1,0,-1,-1,-1,0};
		int[] dy = {1,0,-1,-1,-1,0,1,1};
		for(int i=0;i<8;i++){
			s[i] = sc.next();
			for(int j=0;j<8;j++){
				if(s[i].charAt(j)=='.'){
					map[i][j] = -1;
				}
				else if(s[i].charAt(j)=='o'){
					map[i][j] = 0;
				}
				else{
					map[i][j] = 1;
				}
			}
		}

		while(true){
			if(turn){
				skip[0] = true;
				skip[1] = true;
			}
			int nextmax = 0;
			int count = 0;
			int nextx = -1;
			int nexty = -1;
			if(turn){
				for(int i=0;i<8;i++){
					for(int j=0;j<8;j++){
						count = 0;
						if(map[i][j]==-1){
							for(int k=0;k<8;k++){
								if(i+dx[k]<0 || i+dx[k]>7){
									continue;
								}
								if(j+dy[k]<0 || j+dy[k]>7){
									continue;
								}
								if(map[i+dx[k]][j+dy[k]]==1){
									for(int l=2;l<8;l++){
										if(i+l*dx[k]<0 || i+l*dx[k]>7){
											break;
										}
										if(j+l*dy[k]<0 || j+l*dy[k]>7){
											break;
										}
										if(map[i+l*dx[k]][j+l*dy[k]]==-1){
											break;
										}
										if(map[i+l*dx[k]][j+l*dy[k]]==0){
											count += l - 1;
											break;
										}
									}
								}
							}
							if(nextmax<count){
								nextx = i;
								nexty = j;
								nextmax = count;
							}
						}
					}
				}
				if(nextx==-1){
					skip[0] = false;
				}
				else{
					for(int k=0;k<8;k++){
						if(nextx+dx[k]<0 || nextx+dx[k]>7){
							continue;
						}
						if(nexty+dy[k]<0 || nexty+dy[k]>7){
							continue;
						}
						if(map[nextx+dx[k]][nexty+dy[k]]==1){
							for(int l=2;l<8;l++){
								if(nextx+l*dx[k]<0 || nextx+l*dx[k]>7){
									break;
								}
								if(nexty+l*dy[k]<0 || nexty+l*dy[k]>7){
									break;
								}
								if(map[nextx+l*dx[k]][nexty+l*dy[k]]==-1){
									break;
								}
								if(map[nextx+l*dx[k]][nexty+l*dy[k]]==0){
									for(int m=0;m<l;m++){
										map[nextx+m*dx[k]][nexty+m*dy[k]] = 0;
									}
									break;
								}
							}
						}
					}
				}
			}
			else{
				nextmax=1;
				for(int i=0;i<8;i++){
					for(int j=0;j<8;j++){
						count = 0;
						if(map[i][j]==-1){
							for(int k=0;k<8;k++){
								if(i+dx[k]<0 || i+dx[k]>7){
									continue;
								}
								if(j+dy[k]<0 || j+dy[k]>7){
									continue;
								}
								if(map[i+dx[k]][j+dy[k]]==0){
									for(int l=2;l<8;l++){
										if(i+l*dx[k]<0 || i+l*dx[k]>7){
											break;
										}
										if(j+l*dy[k]<0 || j+l*dy[k]>7){
											break;
										}
										if(map[i+l*dx[k]][j+l*dy[k]]==-1){
											break;
										}
										if(map[i+l*dx[k]][j+l*dy[k]]==1){
											count += l - 1;
											break;
										}
									}
								}
							}
							if(nextmax<=count){
								nextx = i;
								nexty = j;
								nextmax = count;
							}
						}
					}
				}
				if(nextx==-1){
					skip[1] = false;
				}
				else{
					for(int k=0;k<8;k++){
						if(nextx+dx[k]<0 || nextx+dx[k]>7){
							continue;
						}
						if(nexty+dy[k]<0 || nexty+dy[k]>7){
							continue;
						}
						if(map[nextx+dx[k]][nexty+dy[k]]==0){
							for(int l=2;l<8;l++){
								if(nextx+l*dx[k]<0 || nextx+l*dx[k]>7){
									break;
								}
								if(nexty+l*dy[k]<0 || nexty+l*dy[k]>7){
									break;
								}
								if(map[nextx+l*dx[k]][nexty+l*dy[k]]==-1){
									break;
								}
								if(map[nextx+l*dx[k]][nexty+l*dy[k]]==1){
									for(int m=0;m<l;m++){
										map[nextx+m*dx[k]][nexty+m*dy[k]] = 1;
									}
									break;
								}
							}
						}
					}
				}
			}

			if(!skip[0] && !skip[1]){
				break;
			}
			boolean flag = true;
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(map[i][j]==-1)
						flag = false;
				}
			}
			if(flag){
				break;
			}
			turn = !turn;
			
		}
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(map[i][j]==-1){
					System.out.print(".");
				}
				else if(map[i][j]==0){
					System.out.print("o");
				}
				else{
					System.out.print("x");
				}
			}
			System.out.println();
		}

	}
}

