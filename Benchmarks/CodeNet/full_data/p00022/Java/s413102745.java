import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(num!=0){
			int max = 0;
			int[] data = new int[num];
			for(int i=0 ; i<num ; i++)
				data[i] = s.nextInt();
			for(int i=0 ; i<num ; i++){
				for(int j=0 ; j<num ; j++){
					int sum = 0;
					for(int k=i ; k<=j ; k++)
						 sum+=data[k];
					if(max<sum)
						max=sum;
				}
			}
			num = s.nextInt();
			System.out.println(max);
		}
    }
}