import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int change =0;
		int num[] = new int[count];
		for(int i=0; i<count; i++) {
			num[i]=sc.nextInt();
		}

		for(int i=count-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(num[j]>num[j+1]) {
					int tmp =num[j];
					num[j]=num[j+1];
					num[j+1]=tmp;
					change += 1;
				}
			}
		}
		if(count !=1){
		   for(int i = 0;i < count -1;i++){
			      System.out.print(num[i] + " ");
			    }
		}
			    System.out.println(num[count - 1]);
			    System.out.println(change);
	}

}
