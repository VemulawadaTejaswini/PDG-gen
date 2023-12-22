import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String scLine = sc.nextLine();
        int result = 0;
        int maxResult = 0;

        for (int i = 0; i < scLine.length(); i++){
        	if(scLine.substring(i,i + 1).equals("R")){
        		result = ++result;
        		if(result > maxResult){
        			maxResult = result;
        		}
        	}
        	else if(scLine.substring(i, i + 1).equals("S")){
        		result = 0;
        	}
        }

        System.out.println(maxResult);
	}
}
