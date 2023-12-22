import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0 ; i < n ; i++){
            int[] number = new int[10];
        	String s = input.nextLine();

        	for(int j = 0 ; j < s.length(); j++){
        		number[s.charAt(j)-48]++;
        	}

        	String min = "";

        	for(int j = 0 ; j < number.length ; j++){
        		while(number[j] != 0){
        			min += j;
        			number[j]--;
        		}
        	}

        	String max = "";

        	for(int j = 0 ; j < s.length(); j++){
        		number[s.charAt(j)-48]++;
        	}

        	for(int j = number.length-1 ; j >= 0 ; j--){
        		while(number[j] != 0){
        			max += j;
        			number[j]--;
        		}
        	}
        	System.out.println(Integer.parseInt(max)-Integer.parseInt(min));
        }
    }
}