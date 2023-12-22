import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] menu=new int[5];
		int min;
		for(int i=0;i<5;i++){
			menu[i]=sc.nextInt();
		}
		min=menu[0]+menu[3];
		if(min>menu[0]+menu[4]){
			min=menu[0]+menu[4];
		}
		if(min>menu[1]+menu[3]){
			min=menu[1]+menu[3];
		}
		if(min>menu[1]+menu[4]){
			min=menu[1]+menu[4];
		}
		if(min>menu[2]+menu[3]){
			min=menu[2]+menu[3];
		}
		if(min>menu[2]+menu[4]){
			min=menu[2]+menu[4];
		}
		System.out.println(min-50);
	}
}