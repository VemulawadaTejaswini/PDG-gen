public class Main {
public static void main(String[] kotai) {
	String str="Nurtures computer scientists and highly-skilled computer engineers\r\n" + 
			"who will create and exploit \"knowledge\" for the new era.\r\n" + 
			"Provides an outstanding computer environment.";
	String sstr="computer";
	int indexStart=0;
	int sstrlength=sstr.length();
	int count=0;
	while(true) {
		int t=str.indexOf(sstr,indexStart);
		if(t>=0) {
			count++;
			indexStart=t+sstrlength;
		}else {
				break;
		}
	}
	System.out.println(count);
}
}

