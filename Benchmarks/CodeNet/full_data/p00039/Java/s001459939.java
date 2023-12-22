import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	
	public static int cal(int a,int b){
		if(b > a){
			return (b - a);
		}else{
			return a;
		}
	}
	
	public static int next(int a,int b){
		if(b > a){
			return 2;
		}else{
			return 1;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			Map<Character,Integer> map = new HashMap<Character,Integer>(7);
			map.put('I', 1);
			map.put('V', 5);
			map.put('X', 10);
			map.put('L', 50);
			map.put('C', 100);
			map.put('D', 500);
			map.put('M', 1000);
			 
			int pos = 0;
			int sum = 0;
			while(true){
				char s1 = ' ';
				char s2 = ' ';
				if(pos < str.length()){
					s1 = str.charAt(pos);
				}else{
					break;
				}
				
				if((pos+1) < str.length()){
					s2 = str.charAt((pos+1));
					int a = map.get(s1);
					int b = map.get(s2);
					sum += cal(a,b);
					pos += next(a,b);
				}else{
					sum += cal(map.get(s1),1);
					pos++;
				}
			}
			
			System.out.println(sum);
				 
		}
	}
}