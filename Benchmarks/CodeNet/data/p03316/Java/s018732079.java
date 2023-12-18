import java.util.*;
public class Main {
	public static void main(String[] ags){
		Scanner sc = new Scanner(System.in);
		int reg=0;
		int num2 = sc.nextInt();
		int num=num2;
		int reg2=0;
		for(reg=0;num>0;reg++){
			if(num%10==0&&num>=10){
				while(num%10==0){
					num/=10;
				}
			}
			if(num>0){
				num--;
			}
		}
		if(num2%reg==0){
				reg2=1;
		}
		if(reg2==1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}