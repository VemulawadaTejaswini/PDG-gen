import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int[] a = new int[4];
    	int[] b = new int[4];
    	while(input.hasNext()){
        	boolean[] used = new boolean[4];
			for(int i = 0 ; i < 4 ; i++){
				a[i] = input.nextInt();
			}
			for(int i = 0 ; i < 4 ; i++){
				b[i] = input.nextInt();
			}
			int hit = 0;
			int blow = 0;
			for(int i = 0 ; i < 4 ; i++){
				if(a[i] == b[i])hit++;
			}
			
			for(int i = 0 ; i < 4 ; i++){
				for(int j = 0 ; j < 4 ; j++){
					if(!used[j] && a[i] == b[j]){
						used[j] = true;
						blow++;
						break;
					}
				}
			}
			blow -= hit;
			System.out.println(hit+" "+blow);
    	}
    }
}