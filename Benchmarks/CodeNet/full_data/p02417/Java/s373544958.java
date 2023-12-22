	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int count[] = new int[26];
		char abc = 'a';
		try {
			while ((str = br.readLine()).equals(null)){
				for (int i = 0; i < str.length(); ++i) {
					if (Character.isLetter(str.charAt(i))) {
						count[Character.toLowerCase(str.charAt(i)) - 'a']++;
					}
				}

			}
			for(int i=0;i<26;i++) {
				System.out.println(abc++ +":"+count[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}