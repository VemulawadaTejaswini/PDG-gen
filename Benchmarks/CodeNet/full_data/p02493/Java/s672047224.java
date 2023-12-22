import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] box = new int[100];
        int max = sc.nextInt();
        for(int i = 0; i < max; i++){
        	box[i] = sc.nextInt();
        }
        for(int j = max - 1; j >= 0; j--){
        	System.out.print(box[j]);
        	if(j != 0){
        		System.out.print(" ");
        	}else if(j == 0){
        		System.out.printf("\n");
        	}
        }
    }
}