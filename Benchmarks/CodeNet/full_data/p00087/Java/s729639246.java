import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String[] str = scan.nextLine().split(" ");
			boolean sw = false;
			int target = 0;
			double temp=0;
			while(str.length > 1){
				sw = false;
				for(int i = 2;i < str.length;i++){
					if(str[i].equals("+")){
						temp = Double.parseDouble(str[i-2]) + Double.parseDouble(str[i-1]);
						sw = true;
						target = i-2;
						break;
					}else if(str[i].equals("-")){
						temp = Double.parseDouble(str[i-2]) - Double.parseDouble(str[i-1]);
						sw = true;
						target = i-2;
						break;
					}else if(str[i].equals("*")){
						temp = Double.parseDouble(str[i-2]) * Double.parseDouble(str[i-1]);
						sw = true;
						target = i-2;
						break;
					}else if(str[i].equals("/")){
						temp = Double.parseDouble(str[i-2]) / Double.parseDouble(str[i-1]);
						sw = true;
						target = i-2;
						break;
					}
				}
				if(sw){
					String[] nstr = new String[str.length-2];
					int j = 0;
					for(int i = 0;i < str.length;i++){
						if(i == target + 1 || i == target + 2){
							continue;
						}else if(i == target){
							nstr[j] = String.valueOf(temp);
							j++;
						}else{
							nstr[j] = str[i];
							j++;
						}
					}
					str = new String[nstr.length];
					for(int i = 0;i < nstr.length;i++){
						str[i] = nstr[i];
					}
				}
			}
			System.out.printf("%.6f\n",temp);
		}
	}
}