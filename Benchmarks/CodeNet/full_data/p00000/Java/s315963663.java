class qq{
		public static void main(String argv[]) {
				StringBuffer n = new StringBuffer();
				for(int i = 1;i<=9;i++){
						for(int j = 1 ;j<=9;j++){
								int k = i *j;
								n.append(i+"x"+ j+"="+k+"\n");
						}
				}
				System.out.print(n.toString());
		}
}