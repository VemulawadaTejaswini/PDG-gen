
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();

		String[] SArray = S.split("");
		ArrayList<String> SList = new ArrayList<>();
		ArrayList<String> SList2 = new ArrayList<>();
		ArrayList<String> SList3 = new ArrayList<>();

		for(int i = 0; i<SArray.length; i++) {
			SList.add(SArray[i]);
		}
		int a = SList.size();

		for(int i = 0; i<(SList.size()-1)/2; i++) {
			SList2.add(SList.get(i));
		}

		for(int i = (SList.size()+3)/2-1; i < a; i++){
			SList3.add(SList.get(i));
		}





		if(check1(SList)) {
			if(SList2.size()%2==1) {
				if(check1(SList2)) {
					if(SList3.size()%2==1) {
						if(check1(SList3)) {
							System.out.println("Yes");
						}else {
							System.out.println("No");
						}
					}else {
						if(check2(SList3)) {
							System.out.println("Yes");
						}else {
							System.out.println("No");
						}
					}
				}else {
					System.out.println("No");
				}
			}else {
				if(check2(SList2)) {
					if(SList3.size()%2==1) {
						if(check1(SList3)) {
							System.out.println("Yes");
						}else {
							System.out.println("No");
						}
					}else {
						if(check2(SList3)) {
							System.out.println("Yes");
						}else {
							System.out.println("No");
						}
					}
				}else {
					System.out.println("No");
				}
			}
		}else{
			System.out.println("No");
		};




	}

	public static boolean check1(ArrayList<String> a) {
		for(int i = 0 ; i<(a.size()-1)/2; i++) {
			if(a.get(i).equals(a.get(a.size()-i-1)) == false){
				return false;
			}
		}
		return true;
	}

	public static boolean check2(ArrayList<String> a ) {
		for(int i = 0; i<a.size()/2; i++) {
			if(a.get(i).equals(a.get(a.size()-i-1))==false) {
				return false;
			}
		}
		return true;
	}
}