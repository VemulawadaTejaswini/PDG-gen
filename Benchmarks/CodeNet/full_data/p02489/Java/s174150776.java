import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i=0;
	int[] num = new int[10];
	for(i=0;i<10;i++){
		num[i]=sc.nextInt();
		if(num[i]==0){break;}
	}
	for(int j=0;j<i;j++){
		System.out.printf("Case %d: %d\n",j+1,num[j]);}
}
	}