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

        int max = 0;

        for(int i = 0; i < c.length; i++){
        	if(max < c[i]){
        		max = c[i];
        	}
        }

        int now = max;
        int count = max + 1;
        int numberCount = 0;
        boolean possible = true;
        while(count > 0){
            for(int k = 0; k < c.length; k++){
            	if(c[k] == now){
            		numberCount++;
            	}
            }

            if(numberCount !=  1 && count == 1){
            	possible = false;
            	break;
            }
            if(numberCount !=  2 && count == 2){
            	possible = false;
            	break;
            }
            if(numberCount < 2 && count != 2 && count != 1){
            	possible = false;
            	break;
            }

            count = count - 2;
            numberCount = 0;
            now--;
        }

        if(possible){
        	System.out.println("Possible");
        }else{
        	System.out.println("Impossible");
        }

	}

}