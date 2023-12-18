import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = sc.nextLine();
		int j =0;
		int k =0;
		for(int i = 0;i < s.length;i++){
			if(s[i]=="R"){
				j++;
			}else{
				k++;
			}
			
		}
		if(j>k){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}