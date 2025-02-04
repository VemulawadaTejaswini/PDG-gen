import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// ????????????
		String[] lbl=br.readLine().split(" ");
		Dice d1=new Dice(lbl);
		// ??????
		String ope=br.readLine();
		for (int i=0;i<ope.length();i++){
			switch(ope.charAt(i)){
			case 'N': d1.throwN(); break;
			case 'S': d1.throwS(); break;
			case 'E': d1.throwE(); break;
			case 'W': d1.throwW(); break;
			}
        }
		// ??????
		System.out.println(d1.getTop());
	}
	
	static class Dice {

		private String top;		//?????¢
		private String front;	//?????¢
		private String right;	//?????¢
		private String left;	//?????¢
		private String back;	//?????¢
		private String bottom;	//?????¢

		/**
		 * ?????????????????????
		 */
		public Dice(String[] lbl){
			this.top=lbl[0];
			this.front=lbl[1];
			this.right=lbl[2];
			this.left=lbl[3];
			this.back=lbl[4];
			this.bottom=lbl[5];
		}
		
		/**
		 * N???????????????
		 */
		public void throwN(){
            String tmp=top;
            top=front;
            front=bottom;
            bottom=back;
            back=tmp;
			// right,left??????????????????
		}
		
		/**
		 * S???????????????
		 */
		public void throwS(){
			String tmp=top;
			top=back;
			back=bottom;
			bottom=front;
			front=tmp;
			// right,left??????????????????
		}
		
		/**
		 * E???????????????
		 */
		public void throwE(){
            String tmp=top;
            top=left;
            left=bottom;
            bottom=right;
            right=tmp;
			// front,back??????????????????
		}
		
		/**
		 * W???????????????
		 */
		public void throwW(){
            String tmp=top;
            top=right;
            right=bottom;
            bottom=left;
            left=tmp;
			// front,back??????????????????
		}

		/**
		 * ?????¨????????¢?????????????????????
		 */
		public String getTop() {
	        return top;
	    }
	}
}