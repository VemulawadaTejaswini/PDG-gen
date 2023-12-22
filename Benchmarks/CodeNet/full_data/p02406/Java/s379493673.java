import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num;
        for(int i=1; i<= x; ++i){
		if(output1(i) != 0){
            System.out.printf(" %d", output1(i));
		}

		else if(output2(i) != 0){
		System.out.printf(" %d", output2(i));
		}
        }

        System.out.printf("\n");

    }
    private static int output1(int i){
        if((i % 3) == 0){
            return i;
        }
        else if(i>10 && output2(i/10) != 0){
		return i;
	}
	else{
		return 0;
	}
}

	private static int output2(int i){
        if((i % 10) == 3){
            return i;
        }
        else if( i>10 && output2(i/10) != 0){
            return i;
        }
        else{
            return 0;
         }
    }
}