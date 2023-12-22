import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner imput = new Scanner(System.in);
		int a = imput.nextInt();
		int b = imput.nextInt();
		int c = imput.nextInt();
		int max,mid,min;
		if(a > b){
			if(a > c){
				max = a;
				if(b > c){
					mid = b;
					min = c;
				}else{
					mid = c;
					min = b;
				}
			}else{
				max = c;
				mid = a;
				min = b;
			}
		}else if(a > c){
			max = b;
			mid = a;
			min = c;
		}else{
			min = a;
			if(b > c){
				max = b;
				mid = c;
			}else{
				max = c;
				mid = b;
			}
		}
		System.out.println(min+" "+mid+" "+max);
	}
}