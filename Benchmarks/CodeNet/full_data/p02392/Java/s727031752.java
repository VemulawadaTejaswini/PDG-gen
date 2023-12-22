public class Main{
	
	public static void main(String[] args){
		for(java.util.Scanner sc: java.util.stream.Stream.of(new java.util.Scanner(System.in)).collect(java.util.stream.Collectors.toList())) {
			if(java.util.stream.IntStream.of(0)
				.peek(I -> 
					judgeRange(java.util.stream.IntStream.rangeClosed(1, 3)
						.map(J -> sc.nextInt())
						.mapToObj(Integer::valueOf)
						.collect(java.util.stream.Collectors.toList())
					)
				).count() == 0
			) {}
		}
	}
	
	static void judgeRange(java.util.List<Integer> list) {
		if(list.get(0) < list.get(1)&& list.get(1) < list.get(2)) {
			if(java.util.stream.IntStream.of(0).peek(I -> System.out.println("Yes")).count() == 0) {}
		}else {
			if(java.util.stream.IntStream.of(0).peek(I -> System.out.println("No")).count() == 0) {}
		}
	}
}