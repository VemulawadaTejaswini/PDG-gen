import java.io.*;
import java.util.*;
public class Main {
	BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	String input = null;
	ArrayList<Integer> sleeped = new ArrayList<Integer>(0);
	int time = 0;
	int result = 0;
	int sleeptimerest = 0;
	int awaketimerest = 0;
	int ctime = 0;
	public static void main(String []args){
		Main r = new Main();
	}
	public Main(){
		try{
			input = buff.readLine();
			String get[] = input.split(" ");
			int a = Integer.parseInt(get[0]);
			int b = Integer.parseInt(get[1]);
			int c = Integer.parseInt(get[2]);
			awaketimerest = a;
			ctime = c;
			while(true){
				time++;
				if(60 % (a+b) == 0){//テ」ツ?禿」ツつ古」ツ?ァテ・ツッツ敕ゥツ?偲」ツ?氾」ツ?凖ッツシツ敕」ツ?淌」ツ?ゥテ」ツつ甘ァツ敖?」ツ?妥」ツ?ェテ」ツ??
					ctime--;
					if(awaketimerest == 0 && ctime == 0){//テ」ツ?淌」ツ?ゥテ」ツつ甘ァツ敖?」ツ?妥」ツ?ェテ」ツ??
						result = -1;
						break;
					}else if(awaketimerest > 0 && ctime == 0){//テ」ツ?淌」ツ?ゥテ」ツつ甘ァツ敖?」ツ??」ツ??
						result = time;
						break;
					}else if(ctime == 0){
						ctime = 60;
					}
					if(awaketimerest != 0){
						awaketimerest--;
						if(awaketimerest == 0)sleeptimerest = b;
					}else if(sleeptimerest != 0){
						sleeptimerest--;
						if(sleeptimerest == 0)awaketimerest = a;
					}
				}else{//テ」ツ?淌」ツ?ゥテ」ツつ甘ァツ敖?」ツ?妥」ツつ?
					ctime--;
					if(awaketimerest > 0 && ctime == 0){//テ」ツ?淌」ツ?ゥテ」ツつ甘ァツ敖?」ツ??」ツ??
						result = time;
						break;
					}else if(ctime == 0){
						ctime = 60;
					}
					if(awaketimerest != 0){
						awaketimerest--;
						if(awaketimerest == 0)sleeptimerest = b;
					}else if(sleeptimerest != 0){
						sleeptimerest--;
						if(sleeptimerest == 0)awaketimerest = a;
					}
				}
			}
		}catch(Exception e){
			
		}
		System.out.println(result);
	}
}