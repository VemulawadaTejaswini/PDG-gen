import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("");
		int s1,s2,s3;
		do {
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		}while(!((s1==0 || s1 ==1) 
				&& (s2==0 || s2==1) && (s3==0 || s3==1)));
		int count=0;
		if(s1 ==1 )
			count++;
		if(s2 ==1)
			count++;
		if(s3 == 1)
			count++;
		System.out.println("出力:"+count);
		
	sc.close();
	}

}
