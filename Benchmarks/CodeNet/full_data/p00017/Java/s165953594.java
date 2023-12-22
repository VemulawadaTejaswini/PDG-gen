import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int T = (int)'t';
		final int[] CODE_THIS = {0,12,11,1};
		final int[] CODE_THAT = {0,12,19,0};
		final int[] CODE_THE = {0,12,15};
		final int MIN = 97;
		final int MAX = 122;
		final int MASS = MAX - MIN;
		int caesar = 0;
		while((in.hasNext())){
			String MS = in.nextLine();
			String s = MS.replaceAll("\\.", "");
			String[] ss = s.split(" ");
			for(int i = 0 ; i < ss.length ; i++){
				if(ss[i].length() == CODE_THE.length){
					int tC = (int)ss[i].charAt(0);
					int[] cb = new int[ss[i].length()];
					for(int j = 0 ;j < ss[i].length();j++){
						int cs = tC - (int)ss[i].charAt(j);
						if(cs < 0){
							cs = cs + MASS;
						}
						cb[j] = cs;
					}
					if (cb[1] == CODE_THE[1] && cb[2] == CODE_THE[2]){
						caesar = T - tC;
						System.out.println(caesar);
						break;
					}			
				}
				else if(ss[i].length() == CODE_THIS.length){
					int tC = (int)ss[i].charAt(0);
					int[] cb = new int[ss[i].length()];
					for(int j = 0 ;j < ss[i].length();j++){
						int cs = tC - (int)ss[i].charAt(j);
						if(cs < 0){
							cs = cs + MASS;
						}
						cb[j] = cs;
					}
					if (cb[1] == CODE_THAT[1] && cb[2] == CODE_THAT[2] && cb[3] == CODE_THAT[3]){
						caesar = T - tC;
						break;
					}
					else if (cb[1] == CODE_THIS[1] && cb[2] == CODE_THIS[2] && cb[3] == CODE_THIS[3]){
						caesar = T - tC;
						break;
					}
				}
			}
			for(int i = 0; i < MS.length(); i++){
				int num = (int)MS.charAt(i);
				if(num < MAX+1 && num > MIN-1){
					System.out.print(Character.toChars(num+caesar)[0]);
				}
				else{
					System.out.print(MS.charAt(i));
				}
			}
			System.out.println();
			caesar = 0;
		}
	}
}