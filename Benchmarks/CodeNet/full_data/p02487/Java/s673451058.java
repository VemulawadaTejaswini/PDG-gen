import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

       while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i, j;
 
            if(a==0 && b==0) break;
 
            for(i = 0; i < a; i++){
				if(i == 0 || i == a-1){
                	for(j = 0; j < b; j++){
                    	System.out.printf("#");
                	}
				}
				else{
					for(j = 0; j< b; j++){
						if(j == 0 || j == b - 1){
							System.out.printf("#");
						}
						else{
							System.out.printf(".");
						}
					};
            }
            System.out.printf("\n");
			}
		}
	}
}