class Main
{
		public static void main(String[] args) throws Exception {
		/** TODO
		 * Goal:せんべいを最も多く貰った人と最も少なく貰った人のせんべいの枚数の差の最小値
		 *
		 * 最大値と最小値の余りを求めるプログラミング
		**/

		// Your code here!
        Scanner sc = new Scanner(System.in);
        
        //Number of Atcoder crackers
        int n = sc.nextInt();
        
        //Number of mans
        int k = sc.nextInt();

        int answer = n % k;

        System.out.println( answer );
	}
}