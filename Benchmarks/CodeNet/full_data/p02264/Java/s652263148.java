import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int  time = scanner.nextInt();//要素数
		int[] array = new int[num];
		String[] pro = new String[num];
		
		//配列作り
		for(int i = 0; i < num; i ++ ){
			pro[i] = scanner.next();		//マーク
			array[i] = scanner.nextInt();	//数字
		}
		
		Queue(pro, array,num,time);
		
		scanner.close();
	}

	public static void Queue( String[] pro, int[] array,int num,int time){
		int sub;
		int i;
		int end_count = 0;
		int end_count_now;
		int time_count = 0;
		boolean judge_end = false;
		
		//ラウンドロビンスケジューリング
		while( end_count < num  ){										//全部終わったら終わり
			end_count_now = 0;
			judge_end = false;
			
			for( i = 0; i < num - end_count; i ++ ){
				sub = array[i] - time;
				if(sub <= 0){
					time_count += array[i];								//時間分だけ足す
					System.out.println(pro[i] +  " " + time_count);		//時間内なら出力
					end_count_now ++;									//今回っている中での終わった数
					judge_end = true;									//終わったものがある示唆
				}else{
					array[i] -= time;									//処理したので要素から引く
					time_count += time;									//合計時間には足す
					if(judge_end) {										//終わってるものがあれば
						array[i - end_count_now] = array[i];			//終わってる数だけ前へ
						pro[i - end_count_now] = pro[i];				//マークも一緒に
					}
				}
				continue;
			}
			end_count += end_count_now;									//今回終わった数を出す
		}
	}
}
