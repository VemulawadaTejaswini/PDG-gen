import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N= Integer.parseInt(s);

        s = sc.nextLine();
        String[] array = s.split(" ");
        int sum = 0;
        int abs=0;
        int x=0;
        for(int j = 0; j < N; j++,x=0,sum=0) {

        for(int i = 0; i < N; i++) {
        	if(i==j)continue;
        	abs=(Integer.parseInt(array[i]) -x);
        	if(abs<0) abs*=-1;
        	sum+=abs;
        	x=Integer.parseInt(array[i]);
        }
        if(x<0) x*=-1;
        sum+=x;

        System.out.println(sum);

        }

	}

}