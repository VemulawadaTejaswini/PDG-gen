import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long b = 0;
        for(int i=1;i<=a;i++){if(i%3!=0 && i%5!=0){b+=i;
                                                 }
                            }
       
		System.out.println(b);
	}
}
