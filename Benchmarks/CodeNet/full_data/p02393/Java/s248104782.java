import java.util.Scanner;
public class aoj_5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int max,min,mid;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b){
			if(a>c){
				max=a;
				if(b>c){
					mid=b;
					min=c;
				}else{
					min=b;
					mid=c;
				}
			}else{
				max=c;
				mid=a;
				min=b;
			}
		}else if(b>c){
			if(c>a){
				mid=c; min=a; max=b;
			}else{
				mid=a; min=c; max=b;
			}
		}
		System.out.print(max+" "+mid+" "+min);
	}
}