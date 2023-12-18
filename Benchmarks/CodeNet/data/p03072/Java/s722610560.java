import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max=0;
      int count=0;
      for(int i=0;i<N;i++)
      {
        int temp=sc.nextInt();
        if(max<=temp)
        {
          count++;
          max=temp;
        }
      }
		System.out.println(count);
	}
}
