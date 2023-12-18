import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			int N = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			IntStream.range(0, N).forEach(i -> list.add(sc.nextInt()));
			List<Integer> rateList = list.stream().map(val ->
			{
				for(int i = 0; i < 8; i++)
				{
					if(400 * i <= val && val < 400 * (i + 1))
						return i + 1;
				}
				return 0;
			}).collect(Collectors.toList());

			List<Boolean> isRatePresentList = new ArrayList<>();

			IntStream.rangeClosed(1, 8).forEach(i ->
				isRatePresentList.add(rateList.stream().filter(val -> val == i).findFirst().isPresent()));

			long rate9count = rateList.stream().filter(val -> val == 9).count();

			long existRateCount = isRatePresentList.stream().filter(b -> b == true).count();
			System.out.println((existRateCount > 0 ? existRateCount : 1)  + " " + ((rate9count + existRateCount > 8) ? 8 : (existRateCount + rate9count)));
		}
	}

}
