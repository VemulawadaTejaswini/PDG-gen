import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] lbl=br.readLine().split(" ");
		Dice dice1=new Dice(lbl);
		String ope=br.readLine();
		for (int i=0;i<ope.length();i++){
            lbl=dice1.throwDice(ope.charAt(i));
        }
		System.out.println(dice1.getTop());
	}
	
	static class Dice {
		private String[] label;
		public Dice(String[] num){
			this.label=num;
		}
		public String[] throwDice(char ori){
			String t;
			switch(ori) {
	        case 'E':
	            t=label[0];
	            label[0]=label[3];
	            label[3]=label[5];
	            label[5]=label[2];
	            label[2]=t;
	            break;
	        case 'N':
	            t=label[0];
	            label[0]=label[1];
	            label[1]=label[5];
	            label[5]=label[4];
	            label[4]=t;
	            break;
	        case 'S':
	            t=label[0];
	            label[0]=label[4];
	            label[4]=label[5];
	            label[5]=label[1];
	            label[1]=t;
	            break;
	        case 'W':
	            t=label[0];
	            label[0]=label[2];
	            label[2]=label[5];
	            label[5]=label[3];
	            label[3]=t;
	            break;
			}
			return label;
		}
		public String getTop() {
	        return label[0];
	    }
	}
}