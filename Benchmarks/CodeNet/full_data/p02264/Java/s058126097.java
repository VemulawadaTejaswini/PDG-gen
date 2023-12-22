import java.util.*;
class Queue {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int taskNum=input.nextInt();
		int taskTime=input.nextInt();
		input.nextLine();//?¶??????¢????¬?
		Map<String, Integer> map = new LinkedHashMap<String, Integer>(); 

		String[] taskArr=new String[taskNum];
		int[] timeArr=new int[taskNum];
		for(int i=0;i<taskNum;i++){
			String str=input.nextLine();
			String[] arr = str.split("\\s+");
			taskArr[i]=arr[0];
			timeArr[i]=Integer.valueOf(arr[1]);

		}
		
		int nowTime=0,
			allTime=0;
		for(int i=0;i<timeArr.length;i++){
			allTime+=timeArr[i];
		}
		
		int pointer,
			add=0;

		while(nowTime!=allTime){
			pointer=add%taskNum;

			if(timeArr[pointer]==0){
				add++;
				continue;
			}
			else{
				if(timeArr[pointer]-taskTime>0){
					timeArr[pointer]-=taskTime;
					nowTime+=taskTime;
				}
				else if(timeArr[pointer]-taskTime<=0){
					nowTime+=timeArr[pointer];
					timeArr[pointer]=0;
					map.put(taskArr[pointer], nowTime);
				}
			}
			add++;
		}
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		
		for(Map.Entry<String, Integer> entry: entrySet){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.exit(0);
	}

}