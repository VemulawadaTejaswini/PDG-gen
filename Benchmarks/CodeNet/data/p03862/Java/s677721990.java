import java.util.Scanner;

public class Main {
	static int souwa;//総和
	static int hako[];
	static int tmpHako[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int hakoLen = sc.nextInt();//箱
		souwa = sc.nextInt();
		hako = new int[hakoLen];
		tmpHako = new int[hako.length];
		for(int i=0; i<hakoLen; i++){
			hako[i] = sc.nextInt();
		}
		copy(hako,tmpHako);

		int min=getCnt(0);
		for(int i=1; i<hako.length; i++){
			copy(tmpHako,hako);
			int tmpCnt = getCnt(i);
			if(min > tmpCnt){
				min = tmpCnt;
			}
		}
		System.out.println(min);


	}
	static boolean checkAll(int[] cnt){
		for(int i=0; i<cnt.length-1; i++){
			if(!(cnt[i] + cnt[i+1] <= souwa))
				return false;
		}
		return true;
	}
	static void bigMove(int[] hako,int index){
		hako[(whichBig(hako,index))] -= 1;
	}
	static int whichBig(int[] hako,int index){
		int maxIndex = index;
		for(int i=1; i<hako.length; i++){
			if(hako[maxIndex] < hako[i])
				maxIndex = i;
		}
		return maxIndex;
	}

	static int getCnt(int index){
		int cnt=0;
		while(true){
			if(checkAll(hako)){
				break;
			}
			cnt++;
			bigMove(hako,index);
		}
		return cnt;
	}

	static void copy(int[] moto, int[] saki){
		for(int i=0; i<moto.length; i++){
			saki[i] = moto[i];
		}
	}
}