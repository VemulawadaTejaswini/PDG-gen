import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		int ans=0;
		while(money>0) {
			if(money>=59049) {
				money-=59049;
				ans++;
				continue;
			}else if(money>=46656) {
				money-=46656;
						ans++;
						continue;
			}else if(money>=7776) {
				money-=7776;
				ans++;
				continue;
	}else if(money>=6561) {
		money-=6561;
		ans++;
		continue;
}else if(money>=1296) {
	money-=1296;
	ans++;
}else if(money>=729) {
	money-=729;
	ans++;
	continue;
}else if(money>=216) {
	money-=216;
	ans++;
	continue;
}else if(money>=81) {
	money-=81;
	ans++;
	continue;
}else if(money>=36) {
	money-=36;
	ans++;
	continue;
}else if(money>=9) {
	money-=9;
	ans++;continue;
}else if(money>=6) {
	money-=6;
	ans++;
	continue;
}else {
	ans+=money;
	money=0;
	continue;
}
		}
		System.out.println(ans);
	}
}