import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int A = scan.nextInt();
	int B = scan.nextInt();
	int C = scan.nextInt();

	int first, second, third;
	
	if(A >= B){
	    if(A >= C){
		first = A;
		if(C >= B){
		    second = C;
		    third = B;
		}else{
		    second = B;
		    third = C;
		}
	    }else{
		first = C;
		second = A;
		third = B;
	    }
	}else{
	    if(B >= C){
		first = B;
		if(A >= C){
		    second = A;
		    third = C;
		}else{
		    second = C;
		    third = A;
		}
	    }else{
		first = C;
		second = B;
		third = A;
	    }
	}
	
	int len1 = first - second;
	int len2 = first - third;

	int count = 0;
	while(len1 > 0 || len2 > 0){
	    if(len1 % 2 == 0 && len2 % 2 == 0){
		count += len1/2 + len2/2;
		break;
	    }else if(len1 % 2 != 0 && len2 % 2 == 0){
		len1++;
		count++;
	    }else if(len1 % 2 == 0 && len2 % 2 != 0){
		len2++;
		count++;
	    }else{
		count += len1;
		len2 -= len1;
		len1 = 0;
	    }
	}

	System.out.println(count);
    }
}
