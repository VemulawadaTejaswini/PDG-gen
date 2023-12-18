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
				if(1 <= val && val <= 399) return 1;
				else if(400 <= val && val <= 799) return 2;
				else if(800 <= val && val <= 1199) return 3;
				else if(1200 <= val && val <= 1599) return 4;
				else if(1600 <= val && val <= 1999) return 5;
				else if(2000 <= val && val <= 2399) return 6;
				else if(2400 <= val && val <= 2799) return 7;
				else if(2800 <= val && val <= 3199) return 8;
				else if(val <= 3200) return 9;
				else return 0;
			}).collect(Collectors.toList());


			List<Boolean> isRatePresentList = new ArrayList<>();

			IntStream.rangeClosed(1, 8).forEach(i -> isRatePresentList.add(rateList.stream().filter(val -> val == i).findFirst().isPresent()));

			long rate9count = rateList.stream().filter(val -> val == 9).count();

			long existRateCount = isRatePresentList.stream().filter(b -> b == true).count();
			System.out.println(existRateCount + " " + ((rate9count + existRateCount > 8) ? 8 : existRateCount + rate9count));
		}
	}

}
