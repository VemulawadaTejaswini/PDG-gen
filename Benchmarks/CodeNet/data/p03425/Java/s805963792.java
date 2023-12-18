import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = 0;
		int a=0;
		int r=0;
		int c=0;
		int h=0;
		//Pattern pat = new Pattern.compile("^M");
		//Scanner sc2 = new Scanner(System.in);
		/*for(int i = 0;i < 100;i++){
			System.out.println(scanner.next());
		}*/
		int N = sc.nextInt();
		String b = sc.nextLine();
		//int N = Integer.parseInt(sc.next());
		//System.out.println(N);
		ArrayList<String> array = new ArrayList<String>();
		for(int i = 0;i < N;i++){
			String str = sc.nextLine();
			array.add(str);
			//System.out.println(str);
		}
		for(String str:array){
			if(str.matches("^M")){
				m++;
			}else if(str.matches("^A")){
				a++;
			}else if(str.matches("^R")){
				r++;
			}else if(str.matches("^C")){
				c++;
			}else if(str.matches("^H")){
				h++;
			}
		}
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		int num =0;
		nums.add(m);
		nums.add(a);
		nums.add(r);
		nums.add(c);
		nums.add(h);
		for(int lol:nums){
			if(lol == 0){
				num++;
			}else{
				nums2.add(lol);
			}
		}
		if(num >=3){
			System.out.println(0);
		}else if(num == 2){
			System.out.println(nums2.get(0)*nums2.get(1)*nums2.get(2));
		}else if(num == 1){
			int ans =nums2.get(0)*nums2.get(1)*nums2.get(2) +
					nums2.get(0)*nums2.get(1)*nums2.get(3)+
					nums2.get(0)*nums2.get(2)*nums2.get(3)+
					nums2.get(3)*nums2.get(1)*nums2.get(2) ;
			System.out.println(ans);
		}else if(num == 0){
			int ans = nums2.get(0)*nums2.get(1)*nums2.get(2)+
					nums2.get(0)*nums2.get(1)*nums2.get(3)+
					nums2.get(0)*nums2.get(1)*nums2.get(4)+
					nums2.get(0)*nums2.get(3)*nums2.get(2)+
					nums2.get(0)*nums2.get(4)*nums2.get(2)+
					nums2.get(0)*nums2.get(3)*nums2.get(4)+
					nums2.get(3)*nums2.get(1)*nums2.get(2)+
					nums2.get(4)*nums2.get(1)*nums2.get(2)+
					nums2.get(4)*nums2.get(1)*nums2.get(3)+
					nums2.get(4)*nums2.get(3)*nums2.get(2);
			System.out.println(ans);
		}
		sc.close();
		//sc2.close();
	}
}
