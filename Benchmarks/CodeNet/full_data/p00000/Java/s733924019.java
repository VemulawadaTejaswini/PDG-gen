class qq{
		public static void main(String argv[]) {
				StringBuffer n = new StringBuffer();
				for(int i = 1;i<10;i++){
						for(int j = 1 ;j<10;j++){
								int k = i *j;
								n.append(i+"x"+ j+"="+k+"\n");
						}
				}
				System.out.print(n.toString());
		}
}