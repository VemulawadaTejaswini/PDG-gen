import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		label:while(true){
			int[] a = new int[5];
			boolean[] b = new boolean[4];
			boolean[] win = new boolean[4];
			int cnt=0;
			for(int i = 0;i<5;i++){
				a[i]=cin.nextInt();
				if(i==0&&a[i]==0){
					break label;
				}
				if(!b[a[i]]){
					b[a[i]]=true;
					cnt++;
				}
			}
			if(cnt==1||cnt==3){
				for(int i = 0;i<5;i++){
					System.out.println(3);
				}
				continue;
			}
			if(b[1]&&b[2]){
				win[1]=true;
				win[2]=false;
			}
			else if(b[2]&&b[3]){
				win[2]=true;
				win[3]=false;
			}
			else if(b[3]&&b[1]){
				win[3]=true;
				win[1]=false;
			}
			for(int i = 0;i<5;i++){
				if(win[a[i]]){
					System.out.println(1);
				}
				else{
					System.out.println(2);
				}
			}
		}

	}

}