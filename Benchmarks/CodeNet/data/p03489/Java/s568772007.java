
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan = new Scanner(System.in);
		int N = scan.nextInt();
		long[] arrays = new long[N];
		for (int i = 0; i < N; i++) {
			arrays[i] = scan.nextLong();
			
		}
		
		Arrays.sort(arrays);
		long tempt = 0;
		long count = 1;
	
		if(arrays.length!=0){
			tempt =  arrays[0];
		}else{
			count = 0;
		}

		if(arrays.length == 1){
			if(count != arrays[0]){
				arrays[0] = -1;
			}
		}else{
			for (int i = 1; i < arrays.length; i++) {
				if(arrays[i] == tempt){
					if(count == arrays[i]){
						tempt =  arrays[i];
						arrays[i] = -1;
					}else{
						count++;
						if(i == arrays.length-1){
							if(count != arrays[i-1]){
								for (int j = 0; j <= i; j++) {
									if(arrays[j]!= -1 && tempt == arrays[j]){
										arrays[j] = -1;
									}
								}
								
							}
						}
						if(arrays[i] != -1){
							tempt =  arrays[i];
						}
					}
				}else{
					if(count != tempt){
						for (int j = 0; j < i; j++) {
							if(arrays[j]!= -1 && tempt == arrays[j]){
								arrays[j] = -1;
							}
						}
						
					}
					
					count = 1;
					tempt = arrays[i];
				}
				
			}
			
		}
		
		
		count = 0;
		for (int i = 0; i < arrays.length; i++) {
			if(arrays[i] == -1){
				count++;
			}
		}
		System.out.println(count);
		
	}

}
