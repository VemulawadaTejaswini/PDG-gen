import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int n=in.nextInt();
			if(n==0)break;
			List<Integer> A=new ArrayList<>();
			for(int i=0;i<n;i++)A.add(Integer.parseInt(in.next()));
			Collections.sort(A);
			int min=A.get(n-1);
			for(int i=0;i<n-1;i++)min=Math.min(min, A.get(i+1)-A.get(i));
			System.out.println(min);
		}
	}

}

