import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
boolean ans=false;
		int n = sc.nextInt();
		for(int i=1;i<=9;i++){
			for(int o=1;o<=9;o++){
				if(i*o==n){
ans=true;
break;
				}
			}
			if(ans){
				break;
			}
		}
if(ans){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
	}
}