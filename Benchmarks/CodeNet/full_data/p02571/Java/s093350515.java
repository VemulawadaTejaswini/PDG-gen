import java.util.Scanner;

public class Main {
	public static void main(String[] args){

        String[] incomingString = new String[2];
        for(int i = 0; i < incomingString.length; i++){
    		Scanner sc = new Scanner(System.in);
            String scLine = sc.nextLine();
            incomingString[i] = scLine;
        }

        int len1 = incomingString[0].length();
        int len2 = incomingString[1].length();
        int result = 0;
        String[] mainarr = incomingString[0].split("");
        String[] subarr = incomingString[1].split("");

        for(int i = 0; i < (len1 - len2 + 1); i++){
            int count = 0;
        	for(int j = 0; j < len2; j++){
                if(!mainarr[i+j].equals(subarr[j])){
                	count++;
                }
        	}
        	if(result == 0){
        		result = count;
        	}
        	else if(count < result){
        		result = count;
        	}
        }
        System.out.println(result);
	}
}
