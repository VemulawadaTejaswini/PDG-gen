import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int o=0;
		int t=0;
		int tt=0;
		int f=0;
		for(int i = 0; i<3; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==1 || b==1){
				o++;
			}
			if(a==2 || b==2){
				t++;
			}
			if(a==3 || b==3){
				tt++;
			}
			if(a==4 || b==4){
				f++;
			}
		}
		if(o==0 || t==0 || tt==0 || f==0 || o>=3 || t>=3 || tt>=3 || f>=3){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	}
}