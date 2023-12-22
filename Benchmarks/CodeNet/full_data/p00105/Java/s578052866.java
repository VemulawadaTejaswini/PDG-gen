import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] word = new String[105];
		int[] page = new int[105];
		int i = 0;
		while(stdIn.hasNext()){
			word[i] = stdIn.next();
			page[i++] = stdIn.nextInt();
		}
		int end = i;
		for(i=0;i<end;i++){
			int min = i;
			for(int j=i+1;j<end;j++){
				if(word[min].compareTo(word[j])==0&&page[min]>page[j]){
					min = j;
				}
				if(word[min].compareTo(word[j])>0){
					min = j;
				}
			}
			String tmp = word[i];
			word[i] = word[min];
			word[min] = tmp;
			int tmp2 = page[i];
			page[i] = page[min];
			page[min] = tmp2;
		}
		for(i=0;i<end;i++){
			if(i!=0&&word[i-1].compareTo(word[i])==0){
				System.out.print(" "+page[i]);
				continue;
			}
			else if(i!=0){
				System.out.println();
			}
			System.out.println(word[i]);
			System.out.print(page[i]);
		}
		System.out.println();
	}
}