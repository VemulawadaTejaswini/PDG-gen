import java.util.Scanner;

class Main{
  public static void main(String args[]){

	int n;
	int m[] = new int[100];
	int temp;
	int max = Integer.MIN_VALUE;
	int i;

	Scanner scan = new Scanner(System.in);

	n =  scan.nextInt();
	for(i=0; i<n ; i++)
		m[i] = scan.nextInt();

	temp = m[0];
	for(i=1 ; i<n ; i++){
		if(m[i]-temp > max)
			max = m[i]-temp;
		if(temp > m[i])
			temp = m[i];
	}

	System.out.println(max);

	return;

  }

}