import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, k;
		i=0;

		while(i<=n){
            if(i%3==0){
                System.out.printf(" %d",i);
            }else{
                k=i;
                while(k!=0){
                    if(k%10==3){
                        System.out.printf(" %d",i);
                        break;
                    }else{
                        k=k/10;
                    }
                }
            }
            i++;
        }
        System.out.printf("\n");
	}
}