class Main{
    
    
    public static void main(String[] args){
        
        
        while (true) {
			Scanner sc = new Scanner(System.in);

			// 標準入力読み取り
			int num = Integer.parseInt(sc.nextLine());

			if (num == 0) {
				break;
			}

//			int max;

//			if (num % 2 == 0) {
//				max = num / 2;
//			} else {
//				max = num / 2 - 0.5;
//			}

			int totalcount = 0;

			int tmpCount;

			// startCountは初めの数字。2。
			for (int startCount = 2; startCount < num ; startCount++) {

				int plussedCount = startCount;

				// 2+3+4みたいな処理。
				for (int addCount = startCount + 1;; addCount++) {
//					System.out.println("plussedCount" + plussedCount);
					plussedCount = plussedCount + addCount;
					if (plussedCount == num) {
						totalcount++;
					}

//					System.out.println("addCount" + addCount);

					if (plussedCount > num) {
						break;
					}

				}
			}

			System.out.println("totalcount:" + totalcount);

		}
    }
}
