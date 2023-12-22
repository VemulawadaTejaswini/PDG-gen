import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] linearr;
		int T; 
		int inx;
		int i, j, k, l, ij;
		int last;
		int f_reach;
		int[] arr_num;//??°???
		int[][] arr_color;//?????§?????????????????°???
		//int[] arr_color_cnt;
		int set = 0;
		try{
			line = reader.readLine();
			T = Integer.parseInt(line);
			for(i=0; i<T; i++){
				arr_num = new int[9];
				arr_color = new int[3][10];
				int[] arr_color_cnt = {0, 0, 0};
				f_reach = 0;
				set = 0;
				//??°?????????
				line = reader.readLine();
				linearr = line.split(" ");
				for(j=0; j<9; j++){
					arr_num[j] = Integer.parseInt(linearr[j]);
				}
				//?????§?????????
				line = reader.readLine();
				line = line.replace("R", "0");
				line = line.replace("G", "1");
				line = line.replace("B", "2");
				linearr = line.split(" ");
				for(j=0; j<9; j++){
					inx = Integer.parseInt(linearr[j]);
					arr_color[inx][arr_color_cnt[inx]] = arr_num[j];
					arr_color_cnt[inx] ++;
					//System.out.println(inx+", "+arr_color_cnt[inx]);
				}
				//????????????????????????
				for(k=0;k<3;k++){
					for(j=0;j<=arr_color_cnt[k]-1;j++){
						for(ij=arr_color_cnt[k]; ij>j; ij--){
							if(arr_color[k][ij] < arr_color[k][ij-1]){
								int _t = arr_color[k][ij];
								arr_color[k][ij] = arr_color[k][ij-1];
								arr_color[k][ij-1] = _t;
							}
						}
					}
				}
				//??????
				set = 0;
				for(k=0; k<3; k++){
					last = 0;
					f_reach = 0;
					for(j=1, l=arr_color_cnt[k]+1; j<l; j++){
						/*if(arr_color[k][j] == 0){
							System.out.println("none");
							break;
						}*/
						if(last==0){
							last = arr_color[k][j];
						}else if(last == arr_color[k][j] - 1){//??£????????????
							//System.out.println("ren");
							if(f_reach>=2){
								//?????????????????????????¶???????
								f_reach -= 2;
							}
							if(f_reach%2 == 0){
								f_reach += 1;//??£????????????
							}else if(f_reach%2 == 1){//??£???????????????????????£?????????
								//??????
								f_reach = 0;
								set ++;
							}else{
								f_reach -= 1;
							}
						}else if(last == arr_color[k][j]){
							if(f_reach>>1 %2 == 0){
								f_reach += 2;//?????????????????????
							}else if(f_reach>>1 %2 == 1){//???????????????
								//??????
								f_reach = 0;
								set ++;
							}else{
								f_reach -= 2;
							}
						}else{
							f_reach = 0;
						}
						//System.out.println(last+", "+arr_color[k][j]+", "+f_reach+", "+k+", "+j+"::"+set);
						last = arr_color[k][j];
					}
				}
				if(set == 3){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}