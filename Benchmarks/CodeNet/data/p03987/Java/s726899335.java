import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner cin=new Scanner(System.in);
        String a = cin.nextLine();
        String[] b = cin.nextLine().split(" ");

        int[] c = new int[Integer.parseInt(a)];

        for(int i = 0; i < c.length; i++){
        	c[i] = Integer.parseInt(b[i]);
        }

        int count = 0;
        int count1 = 0;

        int min = 0;

        long result = 0;
        for(int i = 0; i < c.length; i++){
        	min = c[i];
        	count = 1;
            for(int k = i + 1; k < c.length; k++){
            	if(min > c[k]){
            		count = count + k - i - 1;
            		break;
            	}else if( k == c.length - 1){
            		count = count + k - i;
            	}
            }
            count1 = 1;
            for(int k = i - 1; k > -1; k--){
            	if(min > c[k]){
            		count1 = count1 + i - 1 - k;
            		break;
            	}else if( k == 0){
            		count1 = count1 + i - k;
            	}
            }
            result = result + min * count * count1;
        }


        System.out.println(result);
	}

}