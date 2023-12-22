import java.util.*;
class Main{
public void yatary() {
	Scanner sc = new Scanner(System.in);
	int i;
	int x = sc.nextInt();
	int [] num = new int [x];
	for(i=0; i<x; i++){
		num[i] = sc.nextInt();
	}
	for(i=x-1; i>=0; i--){
		if(i != 0){
		System.out.print(num[i] + " ");
		}else{
			System.out.println(num[i]);
		}
	}
}
public static void main(String[]args){
	new Main().yatary();
}
}