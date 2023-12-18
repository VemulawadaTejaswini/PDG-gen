import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String ssc = sc.nextLine();
		String[] assc = ssc.split(" ");
		int inn = Integer.parseInt(assc[0]);
		int inm = Integer.parseInt(assc[1]);
		int[][] iainn = new int[inn][inn];
		int sil = 0;
		int sir = 0;
		int retcount = 0;
		int retflag = 0;
		String[] siroot = new String[inm];
		for(int i=0;i<inm;i++){
			ssc = sc.nextLine();
			siroot[i] = ssc;
		}
		for(int ing=0;ing<inm;ing++){
			for(int i=0;i<inm;i++){
				if(ing==i){
					continue;
				}
				ssc = siroot[i];
				assc = ssc.split(" ");
				sil = Integer.parseInt(assc[0]);
				sir = Integer.parseInt(assc[1]);
				sil--;
				sir--;
				iainn[sil][sir] = 1;
				iainn[sir][sil] = 1;
			}
			for(int x=0;x<inn;x++){
				for(int y=0;y<inn;y++){
					for(int z=0;z<inn;z++){
						if(iainn[y][x]>0 && iainn[z][y]>0 && x!=y){
							iainn[x][z] = iainn[x][z] + 1;
							iainn[z][x] = iainn[z][x] + 1;
						}
					}
				}
			}
			for(int j=0;j<inn;j++){
				for(int k=0;k<inn;k++){
					if(j==k){
						continue;
					}
					else if(iainn[j][k]==0){
						retflag++;
					}
					else{
						iainn[j][k] = 0;
					}
				}
			}
			if(retflag!=0){
				retcount++;
				retflag = 0;
			}
		}
		System.out.println(retcount);
    }
}
