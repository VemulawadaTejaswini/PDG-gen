import java.util.stream.*;

class Main{
	public static void main(String[] A){
		System.out.println(
				IntStream.rangeClosed(2,55555)
						.filter(o->o%5==1&&IntStream.range(2,o).noneMatch(p->o%p==0))
						.limit(new java.util.Scanner(System.in).nextInt())
						.mapToObj(String::valueOf)
						.collect(Collectors.joining(" "))
						);
	}
}
