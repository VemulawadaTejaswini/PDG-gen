public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String  s = sc.nextLine();
		int count = sc.nextInt();
		char[] ca = s.toCharArray();
		char[] ca_n = new char[ca.length];
		for (int i=0;i<ca_n.length;i++){
			ca_n[i] = (char) (ca[i] - 96);
		}
		if (ca_n.length==1){
			ca_n[0] = (char) ((ca_n[0]+count)%26);
			if (ca_n[0]==0){
				ca_n[0] = 26;
			}
		}
		else{
			for (int i=0;i<ca_n.length;i++){
		
			
				if (ca_n[i]==1){
					continue;
				}
				else if(i==(ca_n.length-1) && count>0) {
					ca_n[i] = (char) ((ca_n[i]+count)%26);
					if (ca_n[i]==0){
						ca_n[i] = 26;
					}
				}
				else{
					if (count>0 && 27-ca_n[i] <= count){
						count -=(27-ca_n[i]);
						ca_n[i] = 1;
					}
				
				}
			}
		}
		for (int i=0;i<ca_n.length;i++){
			ca_n[i] +=96;
		}
		String s1 = new String(ca_n);
		System.out.print(s1);
	}
}