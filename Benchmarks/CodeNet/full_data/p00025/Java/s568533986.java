import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			try{
				int hit = 0;
				int blow = 0;
				int[] all = new int [10];
				int[] a = new int [4];
				int[] b = new int [4];
				for(int i = 0;i < 4;i++){
					a[i] = in.nextInt();
					all[a[i]] = 1;
				}
				for(int i = 0;i < 4;i++){
					b[i] = in.nextInt();
					if(a[i] == b[i]){
						hit++;
					}else{
						for(int j = 0;j < 4;j++){
							if(a[j] == b[i]){
								blow++;
							}
						}
					}
				}
				System.out.println(hit +" "+blow);
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}