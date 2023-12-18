
import java.util.Scanner;

public class Main {

	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int a = s.nextInt();
	int b = s.nextInt();

	int costTrain = n * a;
	int costTaxi = n * b;

	if(costTrain<=costTaxi){
		System.out.println(costTrain);
	}else
	{
		System.out.println(costTaxi);
	}
}
}
