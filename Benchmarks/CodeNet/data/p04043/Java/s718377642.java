import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		double price = sc.nextInt();
		int length = sc.nextInt();
		int price1000 = (int) price / 1000;
		int price100 = (int) ((price % 1000) / 100);
		int price10 = (int) ((price % 100) / 10);
		int price1 = (int) ((price % 10) / 1);
		
		double resultZantei=(price1000*1000)+(price100*100)+(price10*10)+(price1);
		List<Integer> nList = new ArrayList<Integer>(Arrays.asList(price1000,price100,price10,price1));
		List<Integer> abc = new ArrayList<Integer>();
		for(i=0;i<length;i++) {
			abc.add(sc.nextInt());
		}
		boolean hantei = chceck(nList,abc);
		while(hantei) {
			resultZantei++;
			int resultZantei1000 = (int) resultZantei / 1000;
			int resultZantei100 = (int) ((resultZantei % 1000) / 100);
			int resultZantei10 = (int) ((resultZantei % 100) / 10);
			int resultZantei1 = (int) ((resultZantei % 10) / 1);
			nList = Arrays.asList(resultZantei1000,resultZantei100,resultZantei10,resultZantei1);
			hantei = chceck(nList,abc);
		}
		int result = (int) resultZantei;
		System.out.println(result);
	}
	public static boolean chceck(List<Integer> nList,List<Integer> abc){
		int k = 0;
		for(k=0;k<abc.size();k++) {
			if(nList.contains(abc.get(k))){
				return true;
			}
		}
		return false;
	}
}