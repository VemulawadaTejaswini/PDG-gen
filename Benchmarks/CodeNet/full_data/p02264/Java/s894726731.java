import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int  time = scanner.nextInt();//要素数
		int[] array = new int[num];
		String[] pro = new String[num];
		
		for(int i = 0; i < num; i ++ ){
			pro[i] = scanner.next();
			array[i] = scanner.nextInt();
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
		int judge[] = new int[num];
		boolean judge_end = false;
		
		while( end_count < num ){
			end_count_now = 0;
			for( i = 0; i < num; i ++ ){
				if( judge[i] != 1 ){
					sub = array[i] - time;
					if(sub <= 0){
						time_count += array[i];
						System.out.println(pro[i] +  " " + time_count);		//出力
						judge[i] = 1;
						end_count ++;
						end_count_now ++;
					}else{
						array[i] -= time;
						time_count += time;
						if(judge_end) {
							array[i - end_count_now] = array[i];
						}
					}
				}
				continue;
			}
		}
	}
}
