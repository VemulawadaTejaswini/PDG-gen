import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int count = 0;

	Boolean three;
	Boolean five;
	Boolean seven;
	Boolean flag;
	for(int i = 1; i <= N; i++){
	    three = false;
	    five = false;
	    seven = false;
	    flag = true;

	    int digit = String.valueOf(i).length();
	    int num = i;
	    double diff = 1;
	    for(int j = 0; j < digit; j++){
		int rem = (int)num % 10;
		if(rem == 3){
		    three = true;
		}else if(rem == 5){
		    five = true;
		}else if(rem == 7){
		    seven = true;
		}else{
		    flag = false;
		    if(rem == 0 || rem == 1 || rem == 2){
			diff = 3*Math.pow(10, j) - (i % Math.pow(10, j+1));
		    }else if(rem == 4){
			diff = 5*Math.pow(10, j) - (i % Math.pow(10, j+1));
		    }else if(rem == 6){
			diff = 7*Math.pow(10, j) - (i % Math.pow(10, j+1));
		    }else{
			diff = 13*Math.pow(10, j) - (i % Math.pow(10, j+1));
		    }
		    break;
		}
		num /= 10;
	    }

	    if(three == true && five == true &&
	       seven == true && flag == true)
		count++;

	    i += (diff-1);
	}

	System.out.println(count);
    }
}
