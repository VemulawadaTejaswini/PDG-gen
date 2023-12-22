import java.util.*;
public class Main {

	int getNumToRoman(char s){
		char [] list = {'I','V', 'X', 'L', 'C', 'D', 'M'};
		int [] num = {1,5,10,50,100,500,100};
		for(int i=0; i < list.length; i++){
			if(list[i] == s){
				return num[i];
			}
		}
		return -1;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.next();
			int len = str.length();
			int pre = getNumToRoman(str.charAt(0));
			int temp;
			int sum = 0;
			for(int i=1; i < len; i++){
				temp = getNumToRoman(str.charAt(i));
				if(pre >= temp){
					sum += pre;
				}
				else{
					sum -= pre;
				}
				pre = temp;
			}
			sum += pre;
			System.out.println(sum);
		}


	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}