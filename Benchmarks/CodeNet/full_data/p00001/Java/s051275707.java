import java.util.Scanner;

public class Main {
  public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	
	int a[] = new int[10];

	//???????????????
	for(int i = 0;i < 10;i++){
		a[i] = s.nextInt();
	}
	int top = 0;
	int second =0;
	int thard = 0;
	
	for(int i = 0;i < 10;i++){
		if(top < a[i]){
			top = a[i];
		}
	}
	for(int i = 0;i < 10;i++){
		if(second < a[i] && top > a[i]){
			second = a[i];
		}
	}
	for(int i = 0;i < 10;i++){
		if(thard < a[i] && second > a[i]){
			thard = a[i];
		}
	}
	System.out.println(top);
	System.out.println(second);
	System.out.println(thard);
  	
  }
}