class Main{
    public static void main(String[] a){
        for(int i=0;i<10;i++) {
			int height = Integer.parseInt(a[i]);
			int maxHeight = 0;
			int cnt = 0;
			if(maxHeight < height) {
				maxHeight = height;
				cnt++;
			}
			if(cnt>2)
				break;
		}
    }
}