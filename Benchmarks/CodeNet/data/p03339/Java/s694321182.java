	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// 人数Nの入力
        int N = sc.nextInt();

        // 文字列Sの入力
        String S = sc.next();

        // ループ
        int min = N;

        for (int i = 0; i < S.length(); i++)
        {
            int tmp = 0; // 振り向く人数

            // リーダーで列を分ける
            String left = S.substring(0, i);
            String right = S.substring(i + 1);

            // leftに含まれるWの数
            tmp += left.length() - left.replace("W", "").length();

            // rightに含まれるEの数
            tmp += right.length() - right.replace("E", "").length();

            // 最小値の更新
            if (tmp <= min)
            {
                min = tmp;
            }
        }

        // 出力
        System.out.println(min);

	}