import java.util.Scanner;

    public class Main{
	public static void main(String[] args){
            int i,x,n;
            Scanner sc = new Scanner(System.in);

            n = sc.nextInt();

            for(i=1;i<=n;i++){
		if(i%3==0){
                    System.out.printf(" %d",i);
                    continue;
		}else if(i%10==3){
                    System.out.printf(" %d",i);
		}
            }
            System.out.printf("\n");
	}
    }