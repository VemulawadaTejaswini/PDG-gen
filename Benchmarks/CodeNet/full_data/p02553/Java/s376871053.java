import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a=s.nextInt();
      	int b=s.nextInt();
      	int c=s.nextInt();
      	int d=s.nextInt();
      	int p1=a*c;
      	int p2=a*d;
      	int p3=b*c;
      	int p4=b*d;

		int a[] = new int[]{p1,p2,p3,p4};
      	int max;
      	for(int i=0;i<4;i++)
        {
          if(i==0)
          {
            max=a[0];
          }
          else if(a[i]>=max)
          {
            max=a[i];
          }
        }
      	System.out.println(max+"");
	}
}