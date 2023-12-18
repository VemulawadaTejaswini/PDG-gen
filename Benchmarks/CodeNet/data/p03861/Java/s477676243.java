import java.util.*;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		Long x = sc.nextLong();
		Long count = (long) 0;
		for(Long i=(long) 0;a<=b;i++){			
			if((a)%x==0){
				count=count+1;
			}
			a=a+1;
		}
		System.out.print(count);
		
	}

}
