import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] check = new int[3];
		check[0] = int A = scan.nextInt();
      	check[1] = int B = scan.nextInt();
      	check[2] = int C = scan.nextInt();
      	
      	int count_5 = 0;
      	int count_7 = 0;
        for(int i=0; i<check.length; i++){
          if(check[i] == 5){
            count_5++;
          }else if(check[i] == 7){
            count_7++;
          }
          check[i]
        }
      
      	if(count_5 == 2 && count_7 == 1){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
	}
}