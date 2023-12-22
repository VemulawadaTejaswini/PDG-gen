import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int input[] = new int[3];
		for(int i=0;i<3;i++){
			input[i] = a.nextInt();
		}
		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++){
				if(input[i]>input[j]){
					int r = input[i];
					input[i] = input[j];
					input[j] = r;
				}
			}
		}
		for(int i=0;i<3;i++){
			if(i==2)System.out.println(input[i]);
			else System.out.print(input[i]+" ");
		}
	}

}