
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String temp= "";
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			for(int i=0; i < str.length(); i++){
				int num = str.charAt(i) - '0';
				if(num >= 0 && num <= 9){
					temp +=num;
					while(i+1 < str.length()){
						i++;
						num = str.charAt(i) - '0';
						if(num >= 0 && num <= 9){
							temp += num;
						}
						else{
							break;
						}
					}
					sum += Integer.parseInt(temp);
					temp = "";
				}

			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}