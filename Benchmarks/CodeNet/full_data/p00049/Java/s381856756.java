import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] blood = new int[4];
		while(scan.hasNext()){
			String[] str = scan.nextLine().split(",");
			if(str[1].equals("A")){
				blood[0] += 1;
			}else if(str[1].equals("B")){
				blood[1] += 1;
			}else if(str[1].equals("AB")){
				blood[2] += 1;
			}else if(str[1].equals("O")){
				blood[3] += 1;
			}
		}
		for(int i = 0;i < 4;i++){
			System.out.println(blood[i]);
		}
	}
}