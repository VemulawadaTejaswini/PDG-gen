import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long[] tmp = new Long[3];
		for(int i=0; i<tmp.length; i++)
			tmp[i] = sc.nextLong();

		int cnt = 0;
		for(Long i=tmp[0]; i<=tmp[1]; i++){
			if(i % tmp[2] == 0)
				cnt++;
		}


		System.out.println(cnt);
	}
}
