import java.util.Scanner;
public classMain {
	public static voidmain(String[] args) {
		Scanner sc= newScanner(System.in);
		int[] chars = new int[256];
		for(int i=0;i<256;i++){
     	 chars[i]=0;
    	}
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			for (inti= 0; i< line.length(); i++) {
				char ch= Character.toLowerCase(line.charAt(i));
				chars[ch]++;
			}
		}
		for(charch= 'a'; ch<= 'z'; ch++) {
			System.out.println(ch+ " : " + chars[ch]);
		}
	}
}