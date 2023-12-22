import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int playerNum = sc.nextInt();//プレイヤー数
			List<Integer> restPlayer = new ArrayList<Integer>();//残りのプレイヤー
			for(int i=1;i<=playerNum;i++){
				restPlayer.add(i);
			}
			int remarkNum = sc.nextInt();//発言数
			if((playerNum|remarkNum) ==0){
				break;
			}
			String[] remark = new String[remarkNum];
			for(int i=0;i<remarkNum;i++){
				remark[i] = sc.next();
			}
			int nowPlayer = 0;
			for(int i=0;i<remarkNum;i++){
				if((i+1)%15==0){//3と5で割り切れて、発言がFizzBuzzでなければプレイヤーを消す
					if(!(remark[i].equals("FizzBuzz"))){
						restPlayer.remove((Object)restPlayer.get(nowPlayer));
					}
				}else if((i+1)%3==0){//3で割り切れて、発言がFizzでなければプレイヤーを消す
					 if(!remark[i].equals("Fizz")){
						restPlayer.remove((Object)restPlayer.get(nowPlayer));
					 }
				}else if((i+1)%5==0){//5で割り切れて、発言がBuzzでなければプレイヤーを消す
					 if(!remark[i].equals("Buzz")){
						restPlayer.remove((Object)restPlayer.get(nowPlayer));
					 }
				}else if(!((i+1)==Integer.parseInt(remark[i]))){//発言した回数と発言した値が違っていれば、プレイヤーを消す
					restPlayer.remove((Object)restPlayer.get(nowPlayer));
				}
				if(restPlayer.size() == 1){
					break;
				}
				nowPlayer++;//消えたプレイヤーを除いた次のプレイヤーを選択
				if(nowPlayer > restPlayer.size()-1){
					nowPlayer=0;
				}
			}
			Integer[] restPlayerArray = restPlayer.toArray(new Integer[restPlayer.size()]);
			for(int i=0;i<restPlayerArray.length;i++){
				if(i<restPlayerArray.length-1){
					System.out.print(restPlayerArray[i]+" ");
				}else{
					System.out.print(restPlayerArray[i]);
				}
			}
			System.out.println();
		}
	}
}