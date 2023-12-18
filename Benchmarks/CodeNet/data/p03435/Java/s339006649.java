import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int[][] c_ = new int[3][3];
	for(int i = 0; i < 3; i++){
	    for(int j = 0; j < 3; j++){
		c_[i][j] = scan.nextInt();
	    }
	}
	int one_max = Integer.MIN_VALUE;
	int two_max = Integer.MIN_VALUE;
	int three_max = Integer.MIN_VALUE;
	for(int i = 0; i < 3; i++){
	    for(int j = 0; j < 3; j++){
		if(i == 0){
		    if(c_[j][i] > one_max)
			one_max = c_[j][i];
		}else if(i == 1){
		    if(c_[j][i] > two_max)
			two_max = c_[j][i];
		}else{
		    if(c_[j][i] > three_max)
			three_max = c_[j][i];
		}
	    }
	}
	
	int[][] a_ = new int[3][3];
	int[][] b_ = new int[3][3];
	boolean[] flag_ = {false, false, false};
	for(int one = 0; one <= one_max; one++){
	    for(int two = 0; two <= two_max; two++){
		for(int three = 0; three <= three_max; three++){
		    flag_[0] = false;
		    flag_[1] = false;
		    flag_[2] = false;
		    for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
			    switch(j){
			    case 0 :
				b_[i][j] = one;
				break;
			    case 1:
				b_[i][j] = two;
				break;
			    case 2:
				b_[i][j] = three;
				break;
			    }
			    a_[i][j] = c_[i][j] - b_[i][j];
			}
			if(a_[i][0] == a_[i][1] &&
			   a_[i][0] == a_[i][2]){
			    flag_[i] = true;
			}else{
			}
		    }
		}
	    }
	}

	if(flag_[0] == true &&
	   flag_[1] == true &&
	   flag_[2] == true){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
