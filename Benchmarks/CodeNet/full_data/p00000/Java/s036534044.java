class Main{
    public static void main(String[] a){
	for (Integer first = 1; first < 10; first++) {
//			System.out.println("first:" + first);
			for (Integer last = 1; last < 10; last++) {
//				System.out.println("last:" + last);
				
				// 掛け算結果
				Integer multiple = first*last;
//				System.out.println("multiple:" + multiple);
				System.out.println(first + "x" + last + "=" + multiple);
			}
		}
    }
}
