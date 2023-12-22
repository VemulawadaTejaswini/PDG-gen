import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = Integer.parseInt(scan.nextLine());
			String[] str = scan.nextLine().split(" ");
			BubbleSort(str,n);
			SelectionSort(str,n);
		}
	}
	
	public static void swapStr(String[] a,int i,int j){
		String t = a[j];a[j] = a[i];a[i] = t;
	}
	
	public static void PrintOutStr(String[] a,int n){
		for(int i = 0;i < n;i++){
			System.out.print(a[i] + ((i == n-1)?"\n":" "));
		}
	}
	
	public static void BubbleSort(String[] str,int n){
		String[] card = new String[n];
		for(int i = 0;i < n;i++){
			card[i] = str[i];
		}
		for(int i = 0;i < n;i++){
			for(int j = n-1;j > i;j--){
				if(card[j].charAt(1) < card[j-1].charAt(1)){
					swapStr(card,j,j-1);
				}
			}
		}
		PrintOutStr(card,n);
		System.out.println("Stable");
	}
	
	public static boolean jStab(String[] str,String[] card,int n){
		boolean fl = false;
		for(int i = 0;i < n-1;i++){
			if(card[i].charAt(1) == card[i+1].charAt(1)){
				String a = card[i];
				String b = card[i+1];
				int ia = 0;
				int ib = 0;
				for(int j = 0;j < n;j++){
					if(str[j].equals(a)){
						ia = j;
					}else if(str[j].equals(b)){
						ib = j;
					}
				}
				fl = (ib-ia > 0)?false:true;
			}
			if(fl){
				break;
			}
		}
		return fl;
	}
	
	public static void SelectionSort(String[] str,int n){
		String[] card = new String[n];
		for(int i = 0;i < n;i++){
			card[i] = str[i];
		}
		for(int i = 0;i < n;i++){
			int min = i;
			for(int j = i + 1;j < n;j++){
				if(card[min].charAt(1) > card[j].charAt(1)){
					min = j;
				}
			}
			if(min != i){
				swapStr(card,i,min);
			}
		}
		PrintOutStr(card,n);
		System.out.println((jStab(str,card,n))?"Not stable":"Stable");
	}
}