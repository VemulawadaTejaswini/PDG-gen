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

        long count = 0;

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < c.length; i++){
        	min = Integer.MAX_VALUE;
            for(int k = i; k < c.length; k++){
            	if(min > c[k]){
            		count = count + c[k];
            		min = c[k];
            	}else{
            		count = count + min;
            	}
            }
        }
        System.out.println(count);
	}

}